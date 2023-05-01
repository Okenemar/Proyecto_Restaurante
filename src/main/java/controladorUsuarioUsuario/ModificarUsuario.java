package controladorUsuarioUsuario;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import clases.RolUsuario;
import clases.Usuario;

import modeloUsuario.ModeloRolUsuario;
import modeloUsuario.ModeloUsuario;

/**
 * Servlet implementation class ModificarUsuario
 */
@WebServlet("/ModificarUsuario")
public class ModificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarUsuario() {
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
		int id = Integer.parseInt(request.getParameter("cUsuario"));
		
		ModeloUsuario usuarioM = new ModeloUsuario();
		Usuario usuario = new Usuario();
		try {
			usuarioM.conectar();
			usuario = usuarioM.getUsuario(id);
			usuarioM.cerrar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("usuario", usuario);
		
		//rol
				ModeloRolUsuario rolM = new ModeloRolUsuario();
				rolM.conectar();
				ArrayList<RolUsuario> roles = rolM.getRolesUsuarios();
				rolM.cerrar();

		request.setAttribute("roles", roles);
				
		request.getRequestDispatcher("ModificarUsuario.jsp").forward(request, response);
	}
			else {
				response.sendRedirect("PaginaUsuario");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Usuario usuario = new Usuario();
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		
		int cUsuario = Integer.parseInt(request.getParameter("cUsuario"));
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String contraseña =request.getParameter("contraseña");
		String telefono = request.getParameter("telefono");
		String correoTrabajo = request.getParameter("correoTrabajo");
		
		
		int rol = Integer.parseInt(request.getParameter("rol"));
		usuario.setcUsuario(cUsuario);
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setContraseña(contraseña);
		usuario.setTelefono(telefono);
		usuario.setCorreoTrabajo(correoTrabajo);
		
		
		
		RolUsuario rolUsuario = new RolUsuario();

		rolUsuario.setId(rol);
		usuario.setRol(rolUsuario);
		
		modeloUsuario.conectar();
		modeloUsuario.modificarUsuario(usuario);
		modeloUsuario.cerrar();
		
		response.sendRedirect("VerUsuarios");
	}

}
