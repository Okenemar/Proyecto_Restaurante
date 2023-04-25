package controladorUsuario;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Evento;
import clases.Reserva;
import modeloUsuario.ModeloUsuario;

/**
 * Servlet implementation class VerEventos
 */
@WebServlet("/VerEventos")
public class VerEventos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerEventos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		modeloUsuario.conectar();
		
		ArrayList <Evento> eventos = modeloUsuario.getEventos();				
		
		eventos = modeloUsuario.getEventos();
		
		modeloUsuario.cerrar();
		
		request.setAttribute("eventos", eventos);
		
		request.getRequestDispatcher("VistaEventos.jsp").forward(request, response);
		response.sendRedirect("VistaEventos");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
