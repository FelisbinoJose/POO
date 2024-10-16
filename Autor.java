package exercicio_relacionamento_classes;

import java.util.ArrayList;

public class Autor {
	
	private String nome;
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Livro> getLivros() {
		return livros;
	}
	
	public Autor(String nome, ArrayList<Livro> livros) {
		this.nome = nome;
		this.livros = livros;
	}

	
	
	
}
