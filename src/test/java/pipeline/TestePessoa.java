package pipeline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teste.Pessoa;

class TestePessoa {

	@Test
	void test() {
		Pessoa pessoa1 = new Pessoa();
		
		assertEquals("Ola", pessoa1.fala());
	}

}
