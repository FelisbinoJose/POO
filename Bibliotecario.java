package exercicio_relacionamento_classes;

import java.util.ArrayList;

public class Bibliotecario {

	private String nome;
	private static ArrayList<Livro> livros = new ArrayList<Livro>();

	public static void cadastrarLivro(String titulo, Autor autor) {
		Livro livro = new Livro();
		livros.add(livro);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

}
