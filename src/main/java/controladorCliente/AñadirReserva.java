package controladorCliente;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Cliente;
import clases.Evento;
import clases.Reserva;
import controladorUsuario.ModeloEvento;
import modelo.ModeloCliente;


/**
 * Servlet implementation class AñadirReserva
 */
@WebServlet("/AñadirReserva")
public class AñadirReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AñadirReserva() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Reserva reserva = new Reserva();
		ModeloCliente clienteM = new ModeloCliente();
		
		
		String DNI = request.getParameter("DNI2");
		String Nombre = request.getParameter("Nombre");
		String Apellido = request.getParameter("Apellido");
		String Telefono = request.getParameter("Telefono");
		String Correo = request.getParameter("Correo");
		SimpleDateFormat formatFecha = new SimpleDateFormat ("yyyy-MM-dd");
		int idEvento =Integer.parseInt(request.getParameter("evento"));
		
		try {
			Date Fecha = formatFecha.parse(request.getParameter("Fecha"));
			reserva.setFecha(Fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Cliente cliente = new Cliente();
		
		cliente.setDni(DNI);
		cliente.setNombre(Nombre);
		cliente.setApellido(Apellido);
		cliente.setTelefono(Telefono);
		cliente.setCorreo(Correo);
		
		//comprobar que el cliente existe
		
		clienteM.conectar();
		
		Boolean encontado=clienteM.DNIExiste(DNI);
		
		if (encontado==false) {
			
			clienteM.registrarCliente(cliente);
		}
		
		
		Evento evento = new Evento();
		evento.setcEvento(idEvento);
		
		
		
		reserva.setCliente(cliente);
		reserva.setEvento(evento);
		clienteM.crearReserva(reserva);
		
		
		clienteM.cerrar();
		
		response.sendRedirect("VerReservas");
		
		
		
		
	}

}
