package controladorUsuarioPl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ModeloUsuarioPl;

/**
 * Servlet implementation class EliminarPlato
 */
@WebServlet("/EliminarPlato")
public class EliminarPlato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarPlato() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cPlato = Integer.parseInt(request.getParameter("cPlato"));
		ModeloUsuarioPl usuarioM = new ModeloUsuarioPl();
		
		usuarioM.conectar();
		usuarioM.EliminarProductosPlato(cPlato);
		usuarioM.EliminarPlato(cPlato);
		usuarioM.cerrar();
		
		response.sendRedirect("VerPlatos");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
