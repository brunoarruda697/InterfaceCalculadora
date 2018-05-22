package br.com.db1.start.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.classes.Divisao;
import br.com.db1.start.classes.Multiplicacao;
import br.com.db1.start.classes.OperacaoMatematica;
import br.com.db1.start.classes.Soma;
import br.com.db1.start.classes.Subtracao;

public class OperadoresTest {

	@Test
	public void calcularTest() {
		OperacaoMatematica operacao = new Soma();
		Assert.assertTrue(32 == operacao.calcula(30d, 2d));
		
		operacao = new Subtracao();
		Assert.assertTrue(28 == operacao.calcula(30d, 2d));
		
		operacao = new Multiplicacao();
		Assert.assertTrue(60 == operacao.calcula(30d, 2d));
		
		operacao = new Divisao();
		Assert.assertTrue(15 == operacao.calcula(30d, 2d));
		
	}
}
