package controladorUsuarioLogin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import clases.Usuario;
import modeloUsuario.ModeloUsuario;


/**
 * Servlet implementation class LoginEmpleado
 */
@WebServlet("/LoginEmpleado")
public class LoginEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("VistaLoginEmpleado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cUsuario = Integer.parseInt(request.getParameter("cUsuario"));
		String contraseña= request.getParameter("contraseña");
		
		ModeloUsuario usuarioM = new ModeloUsuario();
		usuarioM.conectar();
		String contrasenaBdd = usuarioM.getContrasena(cUsuario);
		
		if (contraseña.equals(contrasenaBdd)) {//login ok
			//conseguir el usuario de la BBDD
			
			Usuario usuarioLogueado;
		
				try {
					usuarioLogueado = usuarioM.getUsuario(cUsuario);
					//gaurdar el usuario en session
					HttpSession session = request.getSession();
					session.setAttribute("usuarioLogueado", usuarioLogueado);
					
					response.sendRedirect("PaginaUsuario");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			
		}
		else {
			request.getRequestDispatcher("VistaLoging.jsp").forward(request, response);
		}
		
		usuarioM.cerrar();
	}

}
