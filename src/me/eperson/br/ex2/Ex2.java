package me.eperson.br.ex2;

import me.eperson.br.ex1.ConversaoDeUnidadesDeArea;

public class Ex2 {
	
	public static void main(String[] args) {
		float areaDoCampoDeFutebol = 8250;
		float areaEmPesQuadrados = ConversaoDeUnidadesDeArea.metrosParaPesQuadrados(areaDoCampoDeFutebol);
		float areaEmAcres = ConversaoDeUnidadesDeArea.metrosParaAcres(areaDoCampoDeFutebol);
		float cmQuadrado = ConversaoDeUnidadesDeArea.pesQuadradosParaCmQuadrado(areaEmPesQuadrados);
	}
	
}
