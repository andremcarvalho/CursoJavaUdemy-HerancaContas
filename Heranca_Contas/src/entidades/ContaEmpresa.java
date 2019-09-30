package entidades;

public class ContaEmpresa extends Conta {

	private Double limiteEmprestimo;
	
	public ContaEmpresa () {
		super();
	}

	

	public ContaEmpresa(Integer numero, String suporte, Double saldo, Double limiteEmprestimo) {
		super(numero, suporte, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}



	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	
	public void emprestimo (double montante) {
		if( montante <= limiteEmprestimo) {
		saldo +=montante-10.0;   // so foi permitido pois na classe Conta o atributo saldo foi definido como protected	
		}
	}
	
	
}
