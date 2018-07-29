package cr.ac.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.logica.CribaEratostenes;

public class CribaEratostenesTest {

	@Test
	public void lessThanOneTest() {
		assertEquals(0,CribaEratostenes.generaCriba(-1).length);
	}
	
	@Test
	public void noCompositeReturnTest() {
		assertNotEquals(10, CribaEratostenes.generaCriba(10).length);
	}
	
	@Test
	public void primeCountTest() {
		assertEquals(4,CribaEratostenes.generaCriba(10).length);
		assertEquals(8,CribaEratostenes.generaCriba(20).length);
		assertEquals(10,CribaEratostenes.generaCriba(30).length);
		assertEquals(12,CribaEratostenes.generaCriba(40).length);
		assertEquals(15,CribaEratostenes.generaCriba(50).length);
	}

}
