package conta.model;

//passo a passo:
public class Conta {

	// criado o pacote do modelo
	// depois criou a classe conta
	// e agr precis colocar os atributos da classe conta

	// atributos (caracteristicas)
	private String titular;
	private int agencia;
	private int numero;
	private int tipo;
	private float saldo;

// construtos : ele cria um obrigatoriedade para o usuário preencher todos os dados dos atributos  da classe modelo.	

	public Conta(String titular, int agencia, int numero, int tipo, float saldo) {
		// super();
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	// get e set: usado para manipular atributos private da classe
	// get: le o conteudo do atributo
	// set : insere conteudo em um atributo

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	// metodos(acoes) especificos

	// sacar = verifica se o saldo é menor do que o valor de saque
	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	// depositar = recebe o valor do usuario e soma com o saldo atual
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	// visuslizar

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1 : 
			tipo = "Conta Corrente";
			break;
			
		case 2 : 
			tipo = "Conta Poupança";
			break;
			
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
	}
}
