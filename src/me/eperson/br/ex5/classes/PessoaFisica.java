package me.eperson.br.ex5.classes;

import java.sql.Date;

public class PessoaFisica extends Pessoa {
	private String nome, cpf, endereco;
	private Date aniversario;
	
	public PessoaFisica(String nome, String cpf, String endereco, Date aniversario) {
		this.nome = nome;
		this.cpf = cpf;
		this.setEndereco(endereco);
		this.setAniversario(aniversario);
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getIdentificacao() {
		return cpf;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
