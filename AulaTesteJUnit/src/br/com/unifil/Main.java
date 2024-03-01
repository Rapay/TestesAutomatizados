package br.com.unifil;

import java.util.ArrayList;
import java.util.List;

import br.com.unifil.object.Endereco;
import br.com.unifil.object.Pessoa;
import br.com.unifil.service.ServicoPessoa;

public class Main {
	
	public static void main(String[] args) {
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		listaPessoa.add(criarPessoa("Aluno 1", "11111111111111", null, true, criaEndereco("Rua 1", "123", "Bairro 1", "Londrina", "Paraná")));
		listaPessoa.add(criarPessoa("Aluno 2", null, "11111111111111", false, criaEndereco("Rua 2", "123", "Bairro 2", "Londrina", "Paraná")));
		listaPessoa.add(criarPessoa("Aluno 3", "22222222", null, true, criaEndereco("Rua 1", "123", "Bairro 1", "Cambé", "Paraná")));
		listaPessoa.add(criarPessoa("Aluno 4", "11111111111111", null, true, criaEndereco("Rua 1", "123", "Bairro 1", "Ibiporã", "Paraná")));
		listaPessoa.add(criarPessoa("Aluno 5", null, "11111111111111", false, criaEndereco("Rua 1", "123", "Bairro 1", "Ibiporã", "Paraná")));
		listaPessoa.add(criarPessoa("Aluno 6", "11111111111111", null, true, criaEndereco("Rua 1", "123", "Bairro 1", "Ibiporã", "Paraná")));
		listaPessoa.add(criarPessoa("Aluno 7", "11111111111111", null, true, criaEndereco("Rua 1", "123", "Bairro 1", "Cambé", "Paraná")));
		listaPessoa.add(criarPessoa("Aluno 8", null, "11111111111111", false, criaEndereco("Rua 1", "123", "Bairro 1", "Ivaiporã", "Paraná")));
		listaPessoa.add(criarPessoa("Aluno 9", "11111111111111", null, true, criaEndereco("Rua 1", "123", "Bairro 1", "Assaí", "Paraná")));
		listaPessoa.add(criarPessoa("Aluno 10", null, "11111111111111", false, criaEndereco("Rua 1", "123", "Bairro 1", "Londrina", "Paraná")));
		
		
		System.out.println("Qtd Pessoa Fisica: " + ServicoPessoa.qtdPessoaFisica(listaPessoa));
		System.out.println("Qtd Pessoa Juridica: " + ServicoPessoa.qtdPessoaJuridica(listaPessoa));
		System.out.println("Retorno da Pessoa: " + ServicoPessoa.retornaPessoa(listaPessoa, "Aluno 8").getNome());
		System.out.println("Qtd Pessoa pela cidade: " + ServicoPessoa.retornaListaPessoaPelaCidade(listaPessoa, "Londrina").size());
	}
	
	
	public static Pessoa criarPessoa(String nome,
										String cpf,
										String cnpj,
										boolean pessoaFisica,
										Endereco endereco) {
		return new Pessoa(nome, cpf, cnpj, pessoaFisica, endereco);
	}
	
	
	public static Endereco criaEndereco (String rua,
											String numero,
											String bairro,
											String cidade,
											String estado) {
		return new Endereco(rua, numero, bairro, cidade, estado);
	}

}
