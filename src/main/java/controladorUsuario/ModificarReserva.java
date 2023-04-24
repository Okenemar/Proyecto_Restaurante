package controladorUsuario;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Cliente;
import clases.Reserva;
import 	modeloUsuario.ModeloUsuario;

/**
 * Servlet implementation class ModificarReserva
 */
@WebServlet("/ModificarReserva")
public class ModificarReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarReserva() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		
		SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
		ModeloUsuario modeloUsuario  = new ModeloUsuario();
		Reserva reserva = new Reserva();
		
		try {
			reserva.setFecha(fecha.parse(request.getParameter("fecha")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Cliente cliente = new Cliente();
		
		cliente.setNombre(nombre);
		cliente.setTelefono(telefono);
		reserva.setCliente(cliente);
		
		modeloUsuario.conectar();
		modeloUsuario.modificarReserva(reserva);
		modeloUsuario.cerrar();
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

