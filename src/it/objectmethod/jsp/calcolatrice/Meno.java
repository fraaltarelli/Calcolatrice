package it.objectmethod.jsp.calcolatrice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Meno
 */
@WebServlet("/Meno")
public class Meno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Meno() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int result = 0;
		String error = "";
		try{
			String primoN= request.getParameter("primonumero");
			String secondoN= request.getParameter("secondonumero");
			int primoNumero =Integer.parseInt(primoN);
			int secondoNumero =Integer.parseInt(secondoN);
			result = primoNumero - secondoNumero;

		}   catch(NumberFormatException e) {
			error="Digitare dei numeri";
		}   catch(ArithmeticException e2) {
			error="Impossibile dividere per 0";
		}
		request.setAttribute("risultato", result);
		request.setAttribute("errore", error);
		request.getRequestDispatcher("Calcolatrice.jsp").forward(request, response);



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
