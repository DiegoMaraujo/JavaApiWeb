package br.com.inscricaoApiCadastroResourceTest.resource.test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import javax.ws.rs.core.Response;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.apiCadastro.resource.InscricaoHelper;
import br.com.apiCadastro.resource.InscricaoApiCadastroResource;
import br.com.apiCadastro.resource.Pessoa;

@RunWith(MockitoJUnitRunner.class)
public class InscricaoApiCadastroResourceTest {
	
	@InjectMocks
	InscricaoApiCadastroResource inscricaoApiCadastroResource = new InscricaoApiCadastroResource();
	
	@Mock
	InscricaoHelper inscricaoHelper;
	
	Pessoa pessoa;
	
	@Test
	public void matriculaPorId() {
		when(inscricaoHelper.findPessoa(1)).thenReturn(pessoa);
		Response retornoTest = inscricaoApiCadastroResource.matriculaPorId("1");
		assertEquals(200, retornoTest.getStatus());
	}
	
	@Test
	public void matriculaPorId2() {
		when(inscricaoHelper.findPessoa(1)).thenReturn(pessoa);
		Response retornoTest = inscricaoApiCadastroResource.matriculaPorId("1");
		Object retorno = retornoTest.getEntity();
		assertEquals(new Integer(1), ((Pessoa) retorno).getMatricula());
	}
	
	@After
	public void finishTest() {
		System.out.println("Teste Finalizado!");
	}
	
	@Before
	public void configTest() {
		pessoa = new Pessoa();
		pessoa.setMatricula(1);
		pessoa.setNome("Maria");
		System.out.println("Teste Iniciado!");
	}
	
	@AfterClass
	public static void finish() {
		System.out.println("Classe de Teste Finalizado!");
	}
	
	@BeforeClass
	public static void config() {
		System.out.println("Classe de Teste Iniciado!");
	}
}
