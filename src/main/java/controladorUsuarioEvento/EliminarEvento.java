package controladorUsuarioEvento;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modeloUsuario.ModeloUsuario;

/**
 * Servlet implementation class EliminarEvento
 */
@WebServlet("/EliminarEvento")
public class EliminarEvento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarEvento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cEvento = Integer.parseInt(request.getParameter("c_evento"));
		
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		modeloUsuario.conectar();
		modeloUsuario.eliminarEvento(cEvento);
		modeloUsuario.cerrar();
		
		response.sendRedirect("VerEventos");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}