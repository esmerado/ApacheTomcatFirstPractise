package com.nttdata.tomcat;

/**
 * Clase formaci�n JSP.
 * 
 * @author jesmerad
 *
 */
public class NttDataJPS {

	/**
	 * Saludo desde clase llamada al JSP.
	 * 
	 * @param name
	 * @return
	 */
	public static String helloNttData(final String name) {
		
		//Devolvemos nuestro mensaje.
		return "Bienvenido a NTT Data " + name;
	}

}
