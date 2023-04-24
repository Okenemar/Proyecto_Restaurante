package controladorUsuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;


import clases.Usuario;
import clases.Evento;
import modeloUsuario.ModeloUsuario;

/**
 * Servlet implementation class ModificarEvento
 */
@WebServlet("/ModificarEvento")
public class ModificarEvento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarEvento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Evento evento = new Evento();
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		int cUsuario=Integer.parseInt(request.getParameter("cUsuario"));
		SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
		int cEvento = Integer.parseInt(request.getParameter("cEvento"));
		String nombre = request.getParameter("nombre");
		try {
			evento.setFecha(fecha.parse(request.getParameter("fecha")));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		evento.setcEvento(cEvento);
		evento.setNombre(nombre);
		Usuario usuario = new Usuario();
		
		usuario.setcUsuario(cUsuario);
		
		evento.setUsuario(usuario);
		
		modeloUsuario.conectar();
		modeloUsuario.modificarEvento(evento);
		modeloUsuario.cerrar();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
	}

}
