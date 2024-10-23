package exercicio_heranca;

public class Produto {

	private String nome;
	private int estoque;
	private double valor;

	public Produto(String nome, int estoque, double valor) {
		this.nome = nome;
		this.estoque = estoque;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public void reduzirEstoque(int quantidade) {
		this.estoque -= quantidade;
	}

	public double getValor() {
	        return valor;
	        
	}

	

}
