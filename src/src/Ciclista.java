package src;

/**
 * 
 * @author Jean Herrera
 *
 */

public class Ciclista extends Persona implements Deportista{
	
	/**
	 * La clase ciclista extiende de la clase Persona y es la implementación de la clase Deportista.
	 * Acá creamos un objeto de la clase ciclista y el método obtenerInstancia con el fin de implementar
	 * el patrón de Diseño Singleton.
	 * Los demás métodos son implementaciones de la interfaz Deportista y son usados para efectos del ejercicio.
	 */
	
	
	private static Ciclista ciclista;
	
	//Se usa el patron Singleton, con el fin de crear una sola instancia de la clase Ciclista.
	public synchronized static Ciclista obtenerInstancia(){
		if(ciclista == null){
			ciclista = new Ciclista();
		}
		return ciclista;
	}
	
	public String Entrenar(){
		return "El entrenamiento es a las 5 de la mañana";
	}
	
	public String Debutar(int edad){
		return "Yo corrí por primera vez a los " + super.getEdad() + " años";
	}
	public String Competir(){
		return "Estoy preparado para correr el Giro";
	}
	
	public String Ganar(String nombre){
		return "Soy " + super.getNombre() + " y soy el ganador del Tour";
	}

}
