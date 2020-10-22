package me.eperson.br.ex1;

public class ConversaoDeUnidadesDeArea {
	
	public static float metrosParaPesQuadrados(float metros) {
		return metros * 10.76f;
	}

	public static float metrosParaAcres(float metros) {
		return metros * 0.000247105f;
	}
	
	public static float pesQuadradosParaCmQuadrado(float pesQuadrados) {
		return pesQuadrados	* 929f;
	}
	
	
	public static float milhasQuadradasParaAcres(float milhasQuadradas) {
		return milhasQuadradas * 640f;
	}
	
	public static float acresParaPesQuadrados(float acres) {
		return acres * 43.560f;
	}
	
}
