package controladorUsuarioPl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Plato;
import modeloUsuario.ModeloUsuarioPl;

/**
 * Servlet implementation class VerPlatos
 */
@WebServlet("/VerPlatos")
public class VerPlatos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerPlatos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList <Plato> platos = new ArrayList <>();
		
		ModeloUsuarioPl usuarioM = new ModeloUsuarioPl();
		
		usuarioM.conectar();
		platos = usuarioM.getPlatos();
		usuarioM.cerrar();
		
		request.setAttribute("platos", platos);
		
		request.getRequestDispatcher("VistaPlatos.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
