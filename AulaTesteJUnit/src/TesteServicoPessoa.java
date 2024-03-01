import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import br.com.unifil.object.Endereco;
import br.com.unifil.object.Pessoa;
import br.com.unifil.service.ServicoPessoa;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
class TesteServicoPessoa {

	List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
	
	
	@Before
	public void begin() {
	}
	
	@After
	public void destroy() {
		listaPessoa = new ArrayList<Pessoa>();
		System.out.println(listaPessoa.size());
	}
	
	
	/**
	 * Caso de teste
	 * Entrada -> 4 pessoas onde a variável pessoaFisica = true
	 * Saída esperada -> 4
	 */
	@Test
	public void casoTesteRetorna4PessoasFisicas() {
		listaPessoa.add(new Pessoa("Ricardo", "1234", null, true, new Endereco("Rua 1", "1", "Algum bairro", "Londrina", "Paraná")));
		listaPessoa.add(new Pessoa("Ageu", null, "5678", false, new Endereco("Rua 2", "2", "Bairro 2", "Londrina", "Paraná")));
		listaPessoa.add(new Pessoa("Thiago", "101112", null, true, new Endereco("Rua 3", "3", "Bairro 3", "Goiás", "Goiás")));
		listaPessoa.add(new Pessoa("Bruno do Carmo", "141516", null, true, new Endereco("Rua 4", "4", "Bairro 4", "Londrina", "Paraná")));
		listaPessoa.add(new Pessoa("Samuca", "171819", null, true, new Endereco("Rua 5", "5", "Bairro 5", "Ivaporã", "Paraná")));
		Assert.assertEquals(4, ServicoPessoa.qtdPessoaFisica(listaPessoa));
	}
	
	/*
	 * Caso teste 2
	 * Entrada -> Nenhuma pessoa fisica
	 * Saída esperada -> 0
	 * 
	 */
	@Test
	public void casoTesteRetorna0PessoasFisicas() {
		listaPessoa.add(new Pessoa("Ricardo", "1234", null, false, new Endereco("Rua 1", "1", "Algum bairro", "Londrina", "Paraná")));
		listaPessoa.add(new Pessoa("Ageu", null, "5678", false, new Endereco("Rua 2", "2", "Bairro 2", "Londrina", "Paraná")));
		listaPessoa.add(new Pessoa("Thiago", "101112", null, false, new Endereco("Rua 3", "3", "Bairro 3", "Goiás", "Goiás")));
		listaPessoa.add(new Pessoa("Bruno do Carmo", "141516", null, false, new Endereco("Rua 4", "4", "Bairro 4", "Londrina", "Paraná")));
		listaPessoa.add(new Pessoa("Samuca", "171819", null, false, new Endereco("Rua 5", "5", "Bairro 5", "Ivaporã", "Paraná")));
		Assert.assertEquals(0,ServicoPessoa.qtdPessoaFisica(listaPessoa));
	}
	
	
	/*
	 * Caso teste 2
	 * Entrada -> null
	 * Saída esperada -> 0
	 * 
	 */
	@Test
	public void casoTesteRetorna0PassandoNulo() {
		listaPessoa = null;
		Assert.assertEquals(0,ServicoPessoa.qtdPessoaFisica(listaPessoa));
	}
	
}
