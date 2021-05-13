package mx.uam.is.practicadiseno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.uam.is.practicadiseno.datos.MapeadorDatos;
import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;
import mx.uam.is.practicadiseno.negocio.ManejadorImpl;
import mx.uam.is.practicadiseno.negocio.Observador;
import mx.uam.is.practicadiseno.vista.Ventana;

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		

		// Carga el application context
		new ClassPathXmlApplicationContext("mx/uam/is/practicadiseno/applicationContext.xml");


	}

}
