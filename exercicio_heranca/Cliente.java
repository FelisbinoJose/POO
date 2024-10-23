package exercicio_heranca;

public class Cliente {
	
	private String nome;
    private double saldoDevedor;

    public Cliente(String nome, double saldoDevedor) {
        this.nome = nome;
        this.saldoDevedor = saldoDevedor;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void adicionarDivida(double valor) {
        this.saldoDevedor += valor;
    }

    public void pagarDivida(double valor) {
        this.saldoDevedor -= valor;
        if (this.saldoDevedor < 0) this.saldoDevedor = 0;
    
	
	
	
    }
}
