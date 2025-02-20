package conta.model;

public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(String titular, int agencia, int numero, int tipo, float saldo, int numeroConta,
			float limite) {
		super(titular, agencia, numero, tipo, saldo, numeroConta);

		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	
	
	@Override
	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("\n\n***********************************************************");
			System.out.println("                   Saldo Insuficiente!                         ");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\n\n***********************************************************");
		System.out.println("Limite de crédito:                                             " + this.limite);
	}

	
}
