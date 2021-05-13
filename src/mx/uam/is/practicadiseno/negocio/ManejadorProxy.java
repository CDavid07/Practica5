package mx.uam.is.practicadiseno.negocio;

public class ManejadorProxy implements Manejador {

	Manejador manejador;
	
	public ManejadorProxy (Manejador manejador) {
		this.manejador=manejador;
	}
	
	@Override
	public String[] dameDatos() {
		// TODO Auto-generated method stub
		return manejador.dameDatos();
	}

	@Override
	public boolean agrega(String dato) {
		// TODO Auto-generated method stub
		return manejador.agrega(dato);
	}

	@Override
	public boolean borra(String dato) {
		// TODO Auto-generated method stub
		
		return manejador.borra(dato);
	}

	@Override
	public void finaliza(Observador o) {
		manejador.finaliza(o);

	}

	@Override
	public boolean agregaObservador(Observador o) {
		  System.out.println("Se invocó el método agregaObservador(Observador o)");
	      return manejador.agregaObservador(o);
	}

	@Override
	public boolean quitaObservador(Observador o) {
		System.out.println("Se invoco el metodo quitaObservador");
		return manejador.quitaObservador(o);
	}

}
