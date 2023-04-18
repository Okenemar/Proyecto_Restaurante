package controladorUsuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Reserva;
import modeloUsuario.ModeloUsuario;

/**
 * Servlet implementation class FormularioModificarReserva
 */
@WebServlet("/FormularioModificarReserva")
public class FormularioModificarReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioModificarReserva() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		Reserva reserva = new Reserva();
		int nReserva=Integer.parseInt(request.getParameter("nReserva"));
		try {
			modeloUsuario.conectar();
			reserva = modeloUsuario.getReserva(nReserva);
			modeloUsuario.cerrar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.setAttribute("reserva", reserva);
		request.getRequestDispatcher("ModificarReserva.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
