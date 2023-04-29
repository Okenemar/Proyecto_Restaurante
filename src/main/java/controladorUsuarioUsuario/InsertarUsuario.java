package controladorUsuarioUsuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.RolUsuario;
import clases.Usuario;
import modeloUsuario.ModeloUsuario;

/**
 * Servlet implementation class InsertarUsuario
 */
@WebServlet("/InsertarUsuario")
public class InsertarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("InsertarUsuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		int cUsuario = Integer.parseInt(request.getParameter("c_usuario"));
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String telefono = request.getParameter("telefono");
		String correoTrabajo = request.getParameter("correo_trabajo");
		String trabajo = request.getParameter("trabajo");
		int mgr = Integer.parseInt(request.getParameter("mgr"));
		int rol = Integer.parseInt(request.getParameter("rol"));
		usuario.setcUsuario(cUsuario);
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setTelefono(telefono);
		usuario.setCorreoTrabajo(correoTrabajo);
		usuario.setTrabajo(trabajo);
		usuario.setMgr(mgr);
		
		RolUsuario rolUsuario = new RolUsuario();

		rolUsuario.setId(rol);
		usuario.setRol(rolUsuario);
		
		modeloUsuario.conectar();
		modeloUsuario.insertarUsuario(usuario);
		modeloUsuario.cerrar();
		response.sendRedirect("VerUsuarios");
	}

}
