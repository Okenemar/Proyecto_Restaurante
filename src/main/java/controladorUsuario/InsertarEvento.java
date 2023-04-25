package controladorUsuario;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import clases.Evento;
import clases.Usuario;
import modeloUsuario.ModeloUsuario;

/**
 * Servlet implementation class InsertarEvento
 */
@WebServlet("/InsertarEvento")
public class InsertarEvento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarEvento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("InsertarEvento.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Evento evento = new Evento();
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
		int cEvento = Integer.parseInt(request.getParameter("c_evento"));
		int cUsuario = Integer.parseInt(request.getParameter("c_usuario"));
		String nombre = request.getParameter("nombre");
		try {
			evento.setFecha(fecha.parse(request.getParameter("fecha")));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		evento.setcEvento(cEvento);
		evento.setNombre(nombre);
		
		Usuario usuario = new Usuario();
		usuario.setcUsuario(cUsuario);
		
		evento.setUsuario(usuario);
		
		modeloUsuario.conectar();
		modeloUsuario.insertarEvento(evento);
		modeloUsuario.cerrar();
		response.sendRedirect("VistaEventos");

		
	}

}