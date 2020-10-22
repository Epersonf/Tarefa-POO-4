package me.eperson.br.ex5.classes;

public class PessoaJuridica extends Pessoa {
	private String razaoSocial, cnpj, endereco;
	private float faturamento;
	
	public PessoaJuridica(String razaoSocial, String cnpj, String endereco, float faturamento) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.faturamento = faturamento;
	}
	
	@Override
	public String getIdentificacao() {
		return cnpj;
	}

	@Override
	public String getNome() {
		return razaoSocial;
	}
	
}
