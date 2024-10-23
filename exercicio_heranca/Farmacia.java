package exercicio_heranca;

import java.util.ArrayList;

public class Farmacia {

	private ArrayList<Produto> produtos = new ArrayList<>();
	private ArrayList<Cliente> clientes = new ArrayList<>();

	public void cadastrarProduto(Produto produto) {
		produtos.add(produto);
	}

	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public boolean venderProduto(String nomeProduto, String nomeCliente, int quantidade) {
		Produto produto = encontrarProduto(nomeProduto);
		Cliente cliente = encontrarCliente(nomeCliente);

		if (produto instanceof Mendicamento) {
			if (produto.getEstoque() < quantidade) {
				return false;
			}
			cliente.adicionarDivida(produto.getValor() * quantidade);
		} else if (produto instanceof Perfumaria) {
			if (cliente.getSaldoDevedor() >= 100 || produto.getEstoque() < quantidade) {
				return false;
			}
			produto.reduzirEstoque(quantidade);
			cliente.adicionarDivida(produto.getValor() * quantidade);
		} else if (produto instanceof Hospitalar) {
			cliente.adicionarDivida(produto.getValor() * quantidade);
		}

		return true;
	}

	public boolean pagarDividaCliente(String nomeCliente, double valor) {
		Cliente cliente = encontrarCliente(nomeCliente);
		if (cliente != null) {
			cliente.pagarDivida(valor);
			return true;
		} else {
			return false;
		}
	}

	private Produto encontrarProduto(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNome().equalsIgnoreCase(nome)) {
				return produto;
			}
		}
		return null;
	}

	private Cliente encontrarCliente(String nome) {
		for (Cliente cliente : clientes) {
			if (cliente.getNome().equalsIgnoreCase(nome)) {
				return cliente;
			}
		}
		return null;
	}

}
