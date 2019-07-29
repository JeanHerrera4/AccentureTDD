package src;

/**
 * 
 * @author Jean Herrera
 *
 */

public class Futbolista extends Persona implements Deportista{
	
	/**
	 * La clase futbolista extiende de la clase Persona y es la implementación de la clase Deportista.
	 * Acá creamos un objeto de la clase futbolista y el método obtenerInstancia con el fin de implementar
	 * el patrón de Diseño Singleton.
	 * Los demás métodos son implementaciones de la interfaz Deportista y son usados para efectos del ejercicio.
	 */
	
	private static Futbolista futbolista;
	
	//Se usa el patron Singleton, con el fin de crear una sola instancia de la clase Futbolista.
	public synchronized static Futbolista obtenerInstancia(){
		if(futbolista == null){
			futbolista = new Futbolista();
		}
		return futbolista;
	}
	
	public String Entrenar(){
		return "El entrenamiento hoy es a las 6 de la mañana";
	}
	
	public String Debutar(int edad){
		return "Yo juegué mi primer partido a los " + super.getEdad() + " años";
	}
	public String Competir(){
		return "Estoy preparado para jugar el mundial";
	}
	
	public String Ganar(String nombre){
		return "Soy " + super.getNombre() + " y soy ganador del mundial";
	}

}
