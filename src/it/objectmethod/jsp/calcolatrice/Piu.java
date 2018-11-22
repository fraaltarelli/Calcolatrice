package it.objectmethod.jsp.calcolatrice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

public class Piu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result = 0;
		String error = "";
		try{
			String primoN= request.getParameter("primonumero");
			String secondoN= request.getParameter("secondonumero");	
			int primoNumero =Integer.parseInt(primoN);
			int secondoNumero =Integer.parseInt(secondoN);
			result = primoNumero + secondoNumero;

		}   catch(NumberFormatException e) {
			error="Digitare dei numeri";
		}   catch(ArithmeticException e2) {
			error="Impossibile dividere per 0";
		}

		request.setAttribute("risultato", result);
		request.setAttribute("errore", error);
		request.getRequestDispatcher("Calcolatrice.jsp").forward(request, response);

	}

}
