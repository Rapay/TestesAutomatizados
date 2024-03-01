package br.com.unifil.service;

import java.util.List;
import java.util.stream.Collectors;

import br.com.unifil.object.Pessoa;

public class ServicoPessoa {
	
	
	//MÉTODO PARA IDENTIFICAR A QUANTIDADE DE PESSOAS FÍSICAS EXISTENTES NA LISTA
	public static int qtdPessoaFisica(List<Pessoa> listaPessoas) {
		/**
		 * int count = 0;
		 * 
		 * for(Pessoa p: listaPessoas){
		 * 	  if(p.isPessoaFisica()){
		 * 		count ++;
		 * 	  }
		 * }
		 */
		if(listaPessoas != null) {
			return listaPessoas.stream()
					.filter(p -> p.isPessoaFisica())
					.collect(Collectors.toList()).size();
		}
		return 0;
	}
	
	//MÉTODO PARA IDENTIFICAR A QUANTIDADE DE PESSOAS JURIDICAS EXISTENTES NA LISTA
	public static int qtdPessoaJuridica(List<Pessoa> listaPessoas) {
		int count = 0;
		
		for(Pessoa p : listaPessoas) {
			if(!p.isPessoaFisica())
				count ++;
		}
		
		return count;
	}
	
	
	//MÉTODO PARA RETORNAR UMA ÚNICA PESSOA NA LISTA
	public static Pessoa retornaPessoa(List<Pessoa> listaPessoa, String nome) {
		/**
		 * Pessoa p = null;
		 * 
		 * for(int i = 0; i < listaPessoa.size(); i++){
		 * 		if(listaPessoa(i).getNome.equalsIgnoreCase(nome)){
		 * 			p = new Pessoa();
		 * 			p = listaPessoa(i);
		 * 			break;
		 * 		}
		 * }
		 * return p;
		 */
		return listaPessoa.stream().filter(p -> p.getNome().equalsIgnoreCase(nome))
				.findFirst().orElse(null);
	}
	
	
	//MÉTODO PARA RETORNAR A QUANTIDADE DE PESSOAS QUE MORAM EM UMA DETERMINADA CIDADE
	public static List<Pessoa> retornaListaPessoaPelaCidade(List<Pessoa> listaPessoa, String nomeCidade){
		return listaPessoa.stream().filter(p -> 
				p.getEndereco().getCidade().equalsIgnoreCase(nomeCidade))
				.collect(Collectors.toList());		
	}
	
	

}
