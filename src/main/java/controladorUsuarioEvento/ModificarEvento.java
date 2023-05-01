package controladorUsuarioEvento;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import clases.Evento;
import clases.Usuario;
import modeloUsuario.ModeloUsuario;

/**
 * Servlet implementation class ModificarEvento
 */
@WebServlet("/ModificarEvento")
public class ModificarEvento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarEvento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Usuario usuarioLogueado = (Usuario) session.getAttribute("usuarioLogueado");

		if (usuarioLogueado == null) {// no logeado
			response.sendRedirect("PaginaReservaCliente");
		} else {
			
			if (usuarioLogueado.getRol().getId()==(1)) {
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		Evento evento = new Evento();
		try {
			modeloUsuario.conectar();
			evento = modeloUsuario.getEvento(Integer.parseInt(request.getParameter("c_evento")));
			modeloUsuario.cerrar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("evento", evento);
		request.getRequestDispatcher("ModificarEvento.jsp").forward(request, response);
			}
			else {
				response.sendRedirect("PaginaEvento");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Evento evento = new Evento();
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		int cEvento = Integer.parseInt(request.getParameter("c_evento"));
		String nombre = request.getParameter("nombre");
		
		evento.setcEvento(cEvento);
		evento.setNombre(nombre);
		
		modeloUsuario.conectar();
		modeloUsuario.modificarEvento(evento);
		modeloUsuario.cerrar();
		
		response.sendRedirect("VerEventos");
		
		
		
	}

}