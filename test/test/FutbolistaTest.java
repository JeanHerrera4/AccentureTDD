package test;
import static org.junit.Assert.*;

import org.junit.Test;

import src.Futbolista;

/**
 * 
 * @author Jean Herrera
 *
 */

public class FutbolistaTest {
	
	/**
	 * Desde estas clases de prueba se inici� el ejercicio con el fin de implementar TDD. Esta clase contiene
	 * los test a partir de los cuales se crearon las clases y dem�s componentes del proyecto.
	 */

	@Test
	public void testFutbolistaEntrenando() {
		Futbolista futbolista = Futbolista.obtenerInstancia();
		assertEquals("El entrenamiento hoy es a las 6 de la ma�ana", futbolista.Entrenar());
	}
	
	@Test
	public void testFutbolistaDebutando() {
		Futbolista futbolista = Futbolista.obtenerInstancia();
		futbolista.setEdad(17);
		assertEquals("Yo juegu� mi primer partido a los 17 a�os", futbolista.Debutar(futbolista.getEdad()));
	}
	
	@Test
	public void testFutbolistaCompitiendo() {
		Futbolista futbolista = Futbolista.obtenerInstancia();
		assertEquals("Estoy preparado para jugar el mundial", futbolista.Competir());
	}
	
	@Test
	public void testFutbolistaGanando() {
		Futbolista futbolista = Futbolista.obtenerInstancia();
		futbolista.setNombre("Juan");
		assertEquals("Soy Juan y soy ganador del mundial", futbolista.Ganar(futbolista.getNombre()));
	}

}
