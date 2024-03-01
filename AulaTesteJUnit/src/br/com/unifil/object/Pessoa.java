package br.com.unifil.object;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String cnpj;
	private boolean pessoaFisica;
	private Endereco endereco;
	
	public Pessoa() {}
	
	public Pessoa(String nome,
					String cpf,
					String cnpj,
					boolean pessoaFisica,
					Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.pessoaFisica = pessoaFisica;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public boolean isPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(boolean pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
