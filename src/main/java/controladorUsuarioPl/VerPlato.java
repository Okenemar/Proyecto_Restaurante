package controladorUsuarioPl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Plato;
import clases.Producto;
import modelo.ModeloUsuarioPl;

/**
 * Servlet implementation class VerPlato
 */
@WebServlet("/VerPlato")
public class VerPlato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerPlato() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cPlato = Integer.parseInt(request.getParameter("cPlato"));
		Plato plato = new Plato();
		//ArrayList <Producto> productos = new ArrayList<>();
		
		ModeloUsuarioPl usuarioM = new ModeloUsuarioPl();
		
		usuarioM.conectar();
		
		//productos =usuarioM.getProductosPlato(cPlato);
		plato = usuarioM.getPlato(cPlato);
		
		
		usuarioM.cerrar();
		
		//request.setAttribute("productos", productos);
		request.setAttribute("plato", plato);
		
		request.getRequestDispatcher("VistaPlato.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
