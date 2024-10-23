package exercicio_heranca;

public class Mendicamento extends Produto {

	private boolean reterReceita;

	public Mendicamento(String nome, int estoque, double valor, boolean reterReceita) {
        super(nome, estoque, valor);
        this.reterReceita = reterReceita;
    }

	public boolean isReterReceita() {
        return reterReceita;
	}
	
	

}
