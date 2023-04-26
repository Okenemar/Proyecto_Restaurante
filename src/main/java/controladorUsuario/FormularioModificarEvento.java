package controladorUsuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Evento;
import modeloUsuario.ModeloUsuario;

/**
 * Servlet implementation class FormularioModificarEvento
 */
@WebServlet("/FormularioModificarEvento")
public class FormularioModificarEvento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioModificarEvento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

	}	
}