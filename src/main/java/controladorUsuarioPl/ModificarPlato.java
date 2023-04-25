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
import modelo.ModeloUsuarioPr;

/**
 * Servlet implementation class ModificarPlato
 */
@WebServlet("/ModificarPlato")
public class ModificarPlato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarPlato() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codPlato = Integer.parseInt(request.getParameter("cPlato"));
		
		ModeloUsuarioPl usuarioM = new ModeloUsuarioPl();
		usuarioM.conectar();
		Plato plato = usuarioM.getPlato(codPlato);
		usuarioM.cerrar();
		
		ArrayList <Producto> productosPlato = plato.getProductos();
		
		
		ModeloUsuarioPr usuarioMPR = new ModeloUsuarioPr();
		usuarioMPR.conectar();

		ArrayList<Producto> Todosproductos = usuarioMPR.getProductos();

		usuarioMPR.cerrar();
		
		request.setAttribute("plato", plato);
		request.setAttribute("productosPlato",  productosPlato);
		request.setAttribute("Todosproductos", Todosproductos);
		
		request.getRequestDispatcher("VistaModificarPlato.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
