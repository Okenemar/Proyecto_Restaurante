package controladorUsuarioUsuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Usuario;
import modeloUsuario.ModeloUsuario;

/**
 * Servlet implementation class FormularioModificarUsuario
 */
@WebServlet("/FormularioModificarUsuario")
public class FormularioModificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioModificarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		Usuario usuario = new Usuario();
		try {
			modeloUsuario.conectar();
			usuario = modeloUsuario.getUsuario(Integer.parseInt(request.getParameter("c_usuario")));
			modeloUsuario.cerrar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("usuario", usuario);
		request.getRequestDispatcher("ModificarUsuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
