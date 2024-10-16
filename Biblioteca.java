package exercicio_relacionamento_classes;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private ArrayList<Autor> autores = new ArrayList<Autor>();
    private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();

    public void emprestarLivro(String nome) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(nome)) {
                livros.remove(livro);
                break;
            }
        }
    }

    public void listarLivros(String nome) {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getNome().equals(nome)) {
                for (Livro livro : bibliotecario.getLivros()) {
                    System.out.println(livro.getTitulo());
                }
            }
        }
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public ArrayList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(ArrayList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }
}
