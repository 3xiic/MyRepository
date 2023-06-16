package co.edu.unbosque.model;

import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nextHTML = "/recibo.jsp";
		InetAddress ip = InetAddress.getLocalHost();
		Date d = new Date();
		String fecha = new SimpleDateFormat("dd/MM/yyyy").format(d);
		String numero = request.getParameter("tarjeta");
		numero = numero.substring(numero.length()-4);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextHTML);
		
		request.setAttribute("Tarjeta", numero);
		request.setAttribute("Fecha", fecha);
		request.setAttribute("Articulo", request.getParameter("articulo"));
		request.setAttribute("Cantidad", request.getParameter("cantidad"));
		request.setAttribute("Precio", request.getParameter("precio"));
		request.setAttribute("Nombre", request.getParameter("nombre"));
		request.setAttribute("Apellido", request.getParameter("apellido"));
		request.setAttribute("Ip", ip.toString());
		request.setAttribute("Card", request.getParameter("card"));
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
