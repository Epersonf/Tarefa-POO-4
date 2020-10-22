package me.eperson.br.ex3;

public class Ex3 {
	public static class Pessoa {
		private String nome;
		private Pessoa pai, mae;
		private int idade;
		
		public Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}
		
		public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
			this.nome = nome;
			this.idade = idade;
			this.pai = pai;
			this.mae = mae;
		}
		
		public static Pessoa search(Pessoa filho, String chave) {
			if (filho == null) return null;
			
			Pessoa p = filho;
			
			if (filho.nome.equalsIgnoreCase(chave))
				return p;
			
			p = search(filho.pai, chave);
			if (p != null) return p;
			
			p = search(filho.mae, chave);
			if (p != null) return p;
			
			return null;
		}
	}
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Jose", 3,
				new Pessoa("Augusto", 32),
				new Pessoa("Marta", 32) 
		);
		System.out.println(Pessoa.search(pessoa, "Marta").nome);
		
	}
}
