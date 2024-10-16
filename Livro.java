package exercicio_relacionamento_classes;

public class Livro {
	
	private String titulo;
	private Autor autor;
	private Bibliotecario bibliotecario;
	

	
	public Livro() {
	}
	

	public static boolean emprestar(String nome) {
		return true;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	
	
	
	

}
