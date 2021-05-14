package mx.uam.is.practicadiseno.negocio;

import java.util.ArrayList;
import java.util.List;

import mx.uam.is.practicadiseno.datos.MapeadorDatos;

public class ManejadorImpl implements Manejador {

	private MapeadorDatos mapeador;
	private List <Observador> observadores = new ArrayList <Observador> ();

	/**
	 * Constructor que inicializa con algunos datos
	 * @param mapeador 
	 *
	 */
	public ManejadorImpl(MapeadorDatos mapeador) {
		this.mapeador=mapeador;
		mapeador.agrega("Entrada1");
		mapeador.agrega("Entrada2");
		mapeador.agrega("Entrada3");
		
	}

	/**
	 * Recupera los datos
	 *
	 * @return la lista de datos
	 */
	public String[] dameDatos() {
		
		return mapeador.dameDatos();
	}

	/**
	 * Agrega un dato mientras no este vacio y no este ya en la lista
	 *
	 * @param dato el dato a agregar
	 * @return true si se agrego exitosamente false sino
	 */
	public boolean agrega(String dato) {
	
		if(mapeador.agrega(dato)) {
			notifica();
			
			return true;
		}
		
		return false;
	}

	/**
	 * Borra un dato de la list
	 *
	 * @param dato el dato a borrar
	 * @return true si se borro exitosamente, false sino
	 */
	public boolean borra(String dato) {
		boolean c=mapeador.borra(dato);
		notifica();
		return c;
	}

	/**
	 * Metodo llamado cuando se cierra la ventana
	 *
	 */
	public void finaliza(Observador o) {
		if(observadores.isEmpty()) 	
			System.exit(0);
	}

	/**
	 * Metodo que agrega observador
	 */
	@Override
	public boolean agregaObservador(Observador o) {
		// agregar un observador a la lista de observadores
		
		return observadores.add(o);
	}

	/**
	 * Metodo que quita observador
	 */
	@Override
	public boolean quitaObservador(Observador o) {
		// quitar un observador de la lista de observadores
		
		return observadores.remove(o);
	}
	
	/**
	 * Metodo que notifica a observadores cambios
	 */
	private void notifica() {
		// llamar actualiza() sobre todos los observadores
		
		for( Observador ob : observadores)
			ob.actualiza();
	}

}
