package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Ciclista;

/**
 * 
 * @author Jean Herrera
 *
 */

public class CiclistaTest {
	
	/**
	 * Desde estas clases de prueba se inici� el ejercicio con el fin de implementar TDD. Esta clase contiene
	 * los test a partir de los cuales se crearon las clases y dem�s componentes del proyecto.
	 */

	@Test
	public void testCiclistaEntrenando() {
		Ciclista ciclista = Ciclista.obtenerInstancia();
		assertEquals("El entrenamiento es a las 5 de la ma�ana", ciclista.Entrenar());
	}
	
	@Test
	public void testCiclistaDebutando() {
		Ciclista ciclista = Ciclista.obtenerInstancia();
		ciclista.setEdad(15);
		assertEquals("Yo corr� por primera vez a los 15 a�os", ciclista.Debutar(ciclista.getEdad()));
	}
	
	@Test
	public void testCiclistaCompitiendo() {
		Ciclista ciclista = Ciclista.obtenerInstancia();
		assertEquals("Estoy preparado para correr el Giro", ciclista.Competir());
	}
	
	@Test
	public void testCiclistaGanando() {
		Ciclista ciclista = Ciclista.obtenerInstancia();
		ciclista.setNombre("Pablo");
		assertEquals("Soy Pablo y soy el ganador del Tour", ciclista.Ganar(ciclista.getNombre()));
	}

}
