package me.eperson.br.ex6.classes;

import java.util.ArrayList;

public class Pais {
	private String nome, nomeCapital;
	private float dimensaoEmKm2;
	ArrayList<Pais> paisesQueFazFronteira = new ArrayList<Pais>();
	
	//a) Construtor que inicialize o nome, capital e a dimens�o do pa�s;
	public Pais(String nome, String nomeCapital, float dimensaoEmKm2) {
		this.setNome(nome);
		this.setNomeCapital(nomeCapital);
		this.setDimensaoEmKm2(dimensaoEmKm2);
	}
	
	//b) M�todos de acesso (getters/setters) para as propriedades indicadas no item (a);
	
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
	
	//c) Um m�todo que permita verificar se dois pa�ses s�o iguais. Dois pa�ses s�o iguais se tiverem o mesmo nome e a mesma capital. A assinatura deste m�todo deve ser: public boolean equals(Pais outro);
	public boolean equals(Pais outro) {
		if (!this.getNome().equalsIgnoreCase(outro.getNome()))
			return false;
		if (!this.getNomeCapital().equalsIgnoreCase(outro.getNomeCapital()))
			return false;
		return true;
	}
	
	//d) Um m�todo que define quais outros pa�ses fazem fronteira (note que um pa�s n�o pode fazer fronteira com ele mesmo);
	public void addPaisQueFazFronteira(Pais outro) {
		if (this.equals(outro)) return;
		paisesQueFazFronteira.add(outro);
	}
	
	//e) Um m�todo que retorne a lista de pa�ses que fazem fronteira;
	public ArrayList<Pais> getPaisesQueFazemFronteira() {
		return paisesQueFazFronteira;
	}
	
	//f) Um m�todo que receba um outro pa�s como par�metro e retorne uma lista de vizinhos comuns aos dois pa�ses.
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
