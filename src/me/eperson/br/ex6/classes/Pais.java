package me.eperson.br.ex6.classes;

import java.util.ArrayList;

public class Pais {
	private String nome, nomeCapital;
	private float dimensaoEmKm2;
	ArrayList<Pais> paisesQueFazFronteira = new ArrayList<Pais>();
	
	//a) Construtor que inicialize o nome, capital e a dimensão do país;
	public Pais(String nome, String nomeCapital, float dimensaoEmKm2) {
		this.setNome(nome);
		this.setNomeCapital(nomeCapital);
		this.setDimensaoEmKm2(dimensaoEmKm2);
	}
	
	//b) Métodos de acesso (getters/setters) para as propriedades indicadas no item (a);
	
	public float getDimensaoEmKm2() {
		return dimensaoEmKm2;
	}

	public void setDimensaoEmKm2(float dimensaoEmKm2) {
		this.dimensaoEmKm2 = dimensaoEmKm2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCapital() {
		return nomeCapital;
	}

	public void setNomeCapital(String nomeCapital) {
		this.nomeCapital = nomeCapital;
	}
	
	//c) Um método que permita verificar se dois países são iguais. Dois países são iguais se tiverem o mesmo nome e a mesma capital. A assinatura deste método deve ser: public boolean equals(Pais outro);
	public boolean equals(Pais outro) {
		if (!this.getNome().equalsIgnoreCase(outro.getNome()))
			return false;
		if (!this.getNomeCapital().equalsIgnoreCase(outro.getNomeCapital()))
			return false;
		return true;
	}
	
	//d) Um método que define quais outros países fazem fronteira (note que um país não pode fazer fronteira com ele mesmo);
	public void addPaisQueFazFronteira(Pais outro) {
		if (this.equals(outro)) return;
		paisesQueFazFronteira.add(outro);
	}
	
	//e) Um método que retorne a lista de países que fazem fronteira;
	public ArrayList<Pais> getPaisesQueFazemFronteira() {
		return paisesQueFazFronteira;
	}
	
	//f) Um método que receba um outro país como parâmetro e retorne uma lista de vizinhos comuns aos dois países.
	public ArrayList<Pais> vizinhosEmComumCom(Pais outro) {
		ArrayList<Pais> toReturn = new ArrayList<Pais>();
		for (Pais p1 : outro.getPaisesQueFazemFronteira()) {
			for (Pais p2 : this.getPaisesQueFazemFronteira()) {
				if (p1.equals(p2))
					toReturn.add(p1);					
			}
		}
		return toReturn;
	}
}
