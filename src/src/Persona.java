package src;

/**
 * 
 * @author Jean Herrera
 *
 */

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	
	/**
	 * La clase persona cumple el objetivo de ser heredada por las clases futbolistas y ciclistas.
	 * Contiene los atributos básicos de una persona (para el ejercicio) y los getters y setters como métodos.
	 */
	
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public void setDni(String dni){
		this.dni = dni;
	}
	
	public String getDni(){
		return dni;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public int getEdad(){
		return edad;
	}
}
