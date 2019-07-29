package src;

/**
 * 
 * @author Jean Herrera
 *
 */

public interface Deportista{
	
	/**
	 * La interfaz deportista es la usada para crear la firma de los métodos a implementar en futbolista y 
	 * ciclista.
	 */

	public String Entrenar();
	public String Debutar(int edad);
	public String Competir();
	public String Ganar(String nombre);
}
