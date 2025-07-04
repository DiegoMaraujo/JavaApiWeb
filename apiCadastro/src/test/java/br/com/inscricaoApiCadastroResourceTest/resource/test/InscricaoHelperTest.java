package br.com.inscricaoApiCadastroResourceTest.resource.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.apiCadastro.resource.InscricaoHelper;
import br.com.apiCadastro.resource.Pessoa;



public class InscricaoHelperTest {
	
	InscricaoHelper inscricaoHelper = new InscricaoHelper();
	
	public static final long LIMIT = 20000;
	
	@After
	public void finishTest() {
		System.out.println("Teste Finalizado!");
	}
	
	@Before
	public void configTest() {
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
	
	
	//Caso de teste
	@Test(timeout = LIMIT)
	public void findPessoa() {
		Pessoa retornoFind = inscricaoHelper.findPessoa(1);
		assertEquals(new Integer(1),retornoFind.getMatricula());
	}
	
	@Test
	public void findPessoa1() {
		Pessoa retornoFind = inscricaoHelper.findPessoa(10);
		assertEquals(null,retornoFind);
	}
	
	
}

