package entidades;

public class Conta {

	// atributos
	private Integer numero;
	private String suporte;
	protected Double saldo; // para possbilitar que o atributo seja usado em classes no mesmo pacote

	// construtores
	public Conta() {

	}

	public Conta(Integer numero, String suporte, Double saldo) {
		this.numero = numero;
		this.suporte = suporte;
		this.saldo = saldo;
	}

	// getters and setters
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getSuporte() {
		return suporte;
	}

	public void setSuporte(String suporte) {
		this.suporte = suporte;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	//métodos
	public void retirada (double montante ) {
		saldo -= montante;
		
	}
	public void deposito (double montante) {
		saldo+= montante;
	}
	
}
