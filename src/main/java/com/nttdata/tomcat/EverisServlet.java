package com.nttdata.tomcat;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EverisServlet
 */
@WebServlet("/EsmeradoServlet")
public class EverisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public EverisServlet() {
		super();
	}

	/**
	 * 
	 * Método encargado de enviar la información desde la url para imprimirla por
	 * pantalla.
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("ESMERADO HOLA");
	}

	/**
	 * 
	 * Método encargado de mostrar con los parámetros que enviamos.
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Definición de parámetros.
		final String param1 = request.getParameter("param1");
		final String param2 = request.getParameter("param2");

		// Respuesta que muestra por pantalla con el método post.
		response.getWriter().append("Primer Parámetro: " + param1 + " | Segundo Parámetro: " + param2);

	}

}
