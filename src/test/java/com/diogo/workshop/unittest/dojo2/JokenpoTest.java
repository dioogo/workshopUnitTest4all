package com.diogo.workshop.unittest.dojo2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.diogo.workshop.unittest.enums.JokenpoTypeEnum;

public class JokenpoTest {
	
	@Test
	public void jogarEmpate() throws Exception {
		
		JokenpoTypeEnum jogadorUm = JokenpoTypeEnum.PEDRA;
		JokenpoTypeEnum jogadorDois = JokenpoTypeEnum.PEDRA;
		
		String resultado = new Jokenpo().jogar(jogadorUm, jogadorDois);
		assertEquals("Empate", resultado);
	}
	
	@Test
	public void jogarJogadorUmVencePedra() throws Exception {
		
		
		JokenpoTypeEnum jogadorUm = JokenpoTypeEnum.PEDRA;
		JokenpoTypeEnum jogadorDois = JokenpoTypeEnum.TESOURA;
		
		String resultado = new Jokenpo().jogar(jogadorUm, jogadorDois);
		assertEquals("Jogador 1 vence!", resultado);
	}
	
	@Test
	public void jogarJogadorDoisVence() throws Exception {
		
		JokenpoTypeEnum jogadorUm = JokenpoTypeEnum.PEDRA;
		JokenpoTypeEnum jogadorDois = JokenpoTypeEnum.PAPEL;
		
		String resultado = new Jokenpo().jogar(jogadorUm, jogadorDois);
		assertEquals("Jogador 2 vence!", resultado);
	}
	
	@Test
	public void jogarJogadorDoisVenceTesoura() throws Exception {
		
		JokenpoTypeEnum jogadorUm = JokenpoTypeEnum.PAPEL;
		JokenpoTypeEnum jogadorDois = JokenpoTypeEnum.TESOURA;
		
		String resultado = new Jokenpo().jogar(jogadorUm, jogadorDois);
		assertEquals("Jogador 2 vence!", resultado);
	}
	
	@Test
	public void jogarJogadorDoisVencePedra() throws Exception {
		
		JokenpoTypeEnum jogadorUm = JokenpoTypeEnum.TESOURA;
		JokenpoTypeEnum jogadorDois = JokenpoTypeEnum.PEDRA;
		
		String resultado = new Jokenpo().jogar(jogadorUm, jogadorDois);
		assertEquals("Jogador 2 vence!", resultado);
	}
	
	@Test
	public void jogarJogadorUmVenceTesoura() throws Exception {
		
		JokenpoTypeEnum jogadorUm = JokenpoTypeEnum.TESOURA;
		JokenpoTypeEnum jogadorDois = JokenpoTypeEnum.PAPEL;
		
		String resultado = new Jokenpo().jogar(jogadorUm, jogadorDois);
		assertEquals("Jogador 1 vence!", resultado);
	}
	
	@Test
	public void jogarJogadorUmVencePapel() throws Exception {
		
		JokenpoTypeEnum jogadorUm = JokenpoTypeEnum.PAPEL;
		JokenpoTypeEnum jogadorDois = JokenpoTypeEnum.PEDRA;
		
		String resultado = new Jokenpo().jogar(jogadorUm, jogadorDois);
		assertEquals("Jogador 1 vence!", resultado);
	}

}
