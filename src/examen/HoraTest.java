package examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class HoraTest {

	Hora h1 = new Hora();

	// Test 1
	@Test
	public void CP1() {
		assertTrue(h1.validarHora(10, 10, 10));
	}

	// Test 2
	@Test
	public void CP2() {
		assertFalse(h1.validarHora(10, 10, 24));
	}

	// Test 3
	@Test
	public void CP3() {
		assertFalse(h1.validarHora(10, 60, 10));
	}

	// Test 4
	@Test
	public void CP4() {
		assertFalse(h1.validarHora(60, 10, 10));
	}

	// Test 5
	@Test
	public void CP5() {
		assertFalse(h1.validarHora(60, 60, 24));
	}

}
