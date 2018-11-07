package com.diogo.workshop.unittest.dojo2;

import com.diogo.workshop.unittest.enums.JokenpoTypeEnum;

public class Jokenpo {
	
	private static final String EMPATE = "Empate";
	private static final String JOGADOR_2_VENCE = "Jogador 2 vence!";
	private static final String JOGADOR_1_VENCE = "Jogador 1 vence!";

	public String jogar(JokenpoTypeEnum jogadorUm, JokenpoTypeEnum jogadorDois) {
		if(jogadorUm.equals(jogadorDois)) return EMPATE;
		else if(jogadorUm.equals(JokenpoTypeEnum.PEDRA) && jogadorDois.equals(JokenpoTypeEnum.TESOURA)) 
			return JOGADOR_1_VENCE;
		else if(jogadorUm.equals(JokenpoTypeEnum.TESOURA) && jogadorDois.equals(JokenpoTypeEnum.PAPEL)) 
			return JOGADOR_1_VENCE;
		else if(jogadorUm.equals(JokenpoTypeEnum.PAPEL) && jogadorDois.equals(JokenpoTypeEnum.PEDRA)) 
			return JOGADOR_1_VENCE;
		else if(jogadorUm.equals(JokenpoTypeEnum.PEDRA) && jogadorDois.equals(JokenpoTypeEnum.PAPEL)) 
			return JOGADOR_2_VENCE;
		else if(jogadorUm.equals(JokenpoTypeEnum.PAPEL) && jogadorDois.equals(JokenpoTypeEnum.TESOURA)) 
			return JOGADOR_2_VENCE;
		else return JOGADOR_2_VENCE;
	}
}
