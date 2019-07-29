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
	 * Desde estas clases de prueba se inició el ejercicio con el fin de implementar TDD. Esta clase contiene
	 * los test a partir de los cuales se crearon las clases y demás componentes del proyecto.
	 */

	@Test
	public void testFutbolistaEntrenando() {
		Futbolista futbolista = Futbolista.obtenerInstancia();
		assertEquals("El entrenamiento hoy es a las 6 de la mañana", futbolista.Entrenar());
	}
	
	@Test
	public void testFutbolistaDebutando() {
		Futbolista futbolista = Futbolista.obtenerInstancia();
		futbolista.setEdad(17);
		assertEquals("Yo juegué mi primer partido a los 17 años", futbolista.Debutar(futbolista.getEdad()));
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
