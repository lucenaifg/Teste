package br.ifg.edu.testejenkins;

import org.junit.Assert;
import org.junit.Test;

public class MatematicaTest {

	@Test
	public void testSoma() {
		Matematica mat = new Matematica();
		Assert.assertEquals(4, mat.soma(2, 2),04);
	}

}
