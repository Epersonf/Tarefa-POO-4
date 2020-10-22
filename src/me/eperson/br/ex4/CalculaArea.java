package me.eperson.br.ex4;

public class CalculaArea {
	
	public static void main(String[] args) {
		Circulo t = new Circulo(3);
		System.out.println(t.calculaArea());
	}
	
	public static abstract class FiguraGeometrica {		
		public abstract float calculaArea();	
	}
	
	public static class Quadrado extends FiguraGeometrica {
		
		float lado;
		
		public Quadrado(float lado) {
			this.lado = lado;
		}
		
		@Override
		public float calculaArea() {
			return (float) Math.pow(lado, 2);
		}
		
	}
	
	public static class Circulo extends FiguraGeometrica {
		
		float raio;
		
		public Circulo(float raio) {
			this.raio = raio;
		}
		
		@Override
		public float calculaArea() {
			return (float) Math.PI * raio * raio;
		}
	}
	
	public static class Retangulo extends FiguraGeometrica {
		
		float lado1, lado2;
		
		public Retangulo(float lado1, float lado2) {
			this.lado1 = lado1;
			this.lado2 = lado2;
		}
		
		@Override
		public float calculaArea() {
			return lado1 * lado2;
		}
	}
	
	public static class Triangulo extends FiguraGeometrica {
		
		private float base, altura;
		
		public Triangulo(float base, float altura) {
			this.base = base;
			this.altura = altura;
		}
		
		@Override
		public float calculaArea() {
			return base * altura / 2;
		}
	}
}
