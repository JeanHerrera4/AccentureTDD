package src;

/**
 * 
 * @author Jean Herrera
 *
 */

public class Main {
	
	public static void main(String[] args){
		Ciclista ciclista = Ciclista.obtenerInstancia();
		ciclista.setEdad(20);
		ciclista.setNombre("Juan");
		
		Futbolista futbolista = Futbolista.obtenerInstancia();
		futbolista.setEdad(18);
		futbolista.setNombre("Pablo");
		
		System.out.println("Ciclista: ");
		System.out.println(ciclista.Entrenar());
		System.out.println(ciclista.Debutar(ciclista.getEdad()));
		System.out.println(ciclista.Competir());
		System.out.println(ciclista.Ganar(ciclista.getNombre()));
		
		System.out.println("--------------------");
		System.out.println("Futbolista: ");
		
		System.out.println(futbolista.Entrenar());
		System.out.println(futbolista.Debutar(futbolista.getEdad()));
		System.out.println(futbolista.Competir());
		System.out.println(futbolista.Ganar(futbolista.getNombre()));
		
	}

}
