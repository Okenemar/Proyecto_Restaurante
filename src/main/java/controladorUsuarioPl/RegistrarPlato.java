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
import modeloUsuario.ModeloUsuarioPl;
import modeloUsuario.ModeloUsuarioPr;

/**
 * Servlet implementation class RegistrarPlato
 */
@WebServlet("/RegistrarPlato")
public class RegistrarPlato extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrarPlato() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ModeloUsuarioPr usuarioMPR = new ModeloUsuarioPr();
		usuarioMPR.conectar();

		ArrayList<Producto> productos = usuarioMPR.getProductos();

		usuarioMPR.cerrar();

		request.setAttribute("productos", productos);

		request.getRequestDispatcher("VistaRegistrarPlato.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		double precio = Double.parseDouble(request.getParameter("precio"));
		ModeloUsuarioPr modeloPr = new ModeloUsuarioPr();
		modeloPr.conectar();
		ArrayList<Producto> todosProductos = modeloPr.getProductos();
		ArrayList<Producto> productosPlato = new ArrayList<Producto>();
		Plato plato = new Plato();

		for (Producto producto:todosProductos) {
			try {
				if (!request.getParameter(producto.getcProducto()+"").equals(null)) {
					productosPlato.add(producto);
				}
			} catch (Exception e) {
			}
		}
		modeloPr.cerrar();
//		ArrayList <Producto> productos =request.getParameter("producto");

		plato.setNombre(nombre);
		plato.setPrecio(precio);
		plato.setProductos(productosPlato);
		
		ModeloUsuarioPl modeloPl = new ModeloUsuarioPl();
		modeloPl.conectar();
		
		modeloPl.CrearPlato(plato);
		modeloPl.getCodigoPlatoNombre(plato);
		modeloPl.AñadirProductosPlato(plato);
		
		modeloPl.cerrar();
		
		
		response.sendRedirect("VerPlatos");
		

	}

}
