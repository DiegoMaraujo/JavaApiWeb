package br.com.apiCadastro.resource;

import java.util.ArrayList;
import java.util.List;

public class InscricaoHelper {
	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void init() {
		pessoas.add(new Pessoa("Kleber",1));
		pessoas.add(new Pessoa("Marcus",2));
		pessoas.add(new Pessoa("Stag",3));
	}
	
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public Pessoa findPessoa(Integer id) {
		init();
		for (Pessoa indice : pessoas) {
			if(indice.getMatricula().equals(id)) {
				return indice;
			}
		}
		return null;
	}
	
	public  void cadastro(Pessoa pessoa) {
		init();
		pessoa.setMatricula(pessoas.size()+1);
		pessoas.add(pessoa);
		
	}
	
	public boolean delete(Integer id) {
		init();
		Pessoa remove = null;
		for(Pessoa indice : pessoas) {
			if(indice.getMatricula().equals(id)) {
				remove = indice;
			}
		}
		return pessoas.remove(remove);
		
	}
	
	public Pessoa editar(Pessoa pessoa) {
		init();
		Pessoa pessoaEdit = null;
		for(Pessoa indice : pessoas) {
			if(indice.getMatricula().equals(pessoa.getMatricula())) {
				pessoaEdit = indice;
			}
		}
		if(pessoaEdit != null) {
			pessoaEdit.setNome(pessoa.getNome());
		}
		return pessoaEdit;
		
		
		
	}
	
}
