package conta.model;

public class ContaPoupanca extends Conta {

//	private String statusConta;
//	private String cpf;
//	private String email;
//	private String telefone;
//	private String tipoClientePFPJ;
//	
	private int aniversario;

//construtor vazio
	public ContaPoupanca(String titular, int agencia, int numero, int tipo, float saldo, int numeroConta,
			int aniversario) {
		super(titular, agencia, numero, tipo, saldo, numeroConta);
		this.aniversario = aniversario;
	}
	
	
	
	public int getAniversario() {
		return aniversario;
	}



	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}




	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}
}
//	public ContaPoupanca(String titular, int agencia, int numero, int tipo, float saldo,
//			String statusConta, String cpf, String email, String telefone, String tipoClientePFPJ, int numeroDaConta) {
//		super(titular, agencia, numero, tipo, saldo);
//		this.statusConta = statusConta;
//		this.cpf = cpf;
//		this.email = email;
//		this.telefone = telefone;
//		this.tipoClientePFPJ = tipoClientePFPJ;
//		this.numeroDaConta = numeroDaConta;
//	}

//	//@Override
//	public String poupanca() {
//			System.out.println("Conta Poupança:\n"
//					+ "Nome do titular:  "+ this.getTitular()+"                \n"
//					+ "Agencia:          " + this.getAgencia()+"               \n" 
//					+ "CPF:              " + this.getCpf()+"                   \n" 
//					+ "Status da conta:  " + this.getStatusConta()+"           \n");
//			
//			return "\nConta Poupança cadastrada com sucesso";
//	
//		}
//	

