package conta;

import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
//comando import, a Classe Conta foi importada na Classe Menu
import conta.model.Conta;
import conta.model.ContaPoupanca;
import conta.model.ContaCorrente;
import conta.util.Cores;

public class Menu {
	public static void main(String[] args) {

		ContaController contas = new ContaController();

//		// teste da classe
//
//		// instanciando a classe modelo para teste
//		Conta c1 = new Conta("MIna", 1,1,1,1f,1);
//		// Objeto c1, da Classe Conta, chama o Método visualizar()
//		c1.visualizar();
//		c1.sacar(1100.0f);
//		c1.visualizar();
//		c1.depositar(300);
//		c1.visualizar();
//		
//		
//		ContaCorrente corrente1 = new ContaCorrente ("lana", 1,2,2,56346.09f,2,345f);
//		corrente1.visualizar();
//		corrente1.sacar(234f);
//		corrente1.visualizar();
//		corrente1.depositar(45f);
//		corrente1.visualizar();
//
//		
//		//teste
//		ContaPoupanca poupanca = new ContaPoupanca ("dg", 2,3,1,34536f,3,29122002);
//		poupanca.visualizar();
//		poupanca.sacar(4564f);
//		poupanca.visualizar();
//		poupanca.depositar(678f);
//		poupanca.visualizar();

		Scanner leia = new Scanner(System.in);

		String nomeTitular;
		//PORQUE A CONTA ESTÁ INICIANDO NO 2??? 
		int numConta = 0;
		int opcao, numAgencia, tipoConta, aniversario, numDestino;
		float saldo, limite, valor;

		while (true) {
			System.out.println(Cores.ANSI_BLACK_BACKGROUND_BRIGHT + Cores.TEXT_WHITE_BOLD
					+ "*****************************************************");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            BANCO DO BRAZILZILZIL                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");

			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + Cores.TEXT_BLACK
					+ "*****************************************************");
			System.out.println("            Entre com a opção desejada:              ");
			System.out.println("                                                     ");

			// Método keyPress() = exige que a tecla enter do seu teclado
			// seja pressionada para finalizar uma opção do Menu
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;

			}
			if (opcao == 9) {
				System.out
						.println(Cores.TEXT_PURPLE + "\nBANCO DO BRAZILZILZIL   - O seu Futuro começa aqui!          ");
				sobre();
				leia.close();
				System.exit(0);

			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_BLACK + "Criar Conta\n\n");

				System.out.println("Digite o nome do Titular: ");
				leia.skip("\\R?");
				nomeTitular = leia.nextLine();
				System.out.println("Insira o numero da agência: ");
				numAgencia = leia.nextInt();

				do {
					System.out.println("Digite o tipo da conta (1- Conta Corrente ou 2- Conta Poupança) :");
					tipoConta = leia.nextInt();
				} while (tipoConta < 1 && tipoConta > 2);

				System.out.println("Digite o saldo da conta - R$ : ");
				saldo = leia.nextFloat();

				switch (tipoConta) {
//switch expression
				case 1 -> {

					System.out.println("Digite o limite de credito em R$: ");
					limite = leia.nextFloat();
					// contas.cadastrar(new ContaCorrente(contas.gerarNumero(), numAgencia,
					// tipoConta, nomeTitular, saldo, limite));
					// solução do gpto
					contas.cadastrar(new ContaCorrente(nomeTitular, numAgencia, contas.gerarNumero(), tipoConta, saldo,
							contas.gerarNumero(), limite));

				}
				case 2 -> {
					System.out.println("Digite o dia do seu aniversário da conta: ");
					aniversario = leia.nextInt();
					// contas.cadastrar(new ContaPoupanca (contas.gerarNumero(), numAgencia,
					// tipoConta, nomeTitular,saldo,aniversario));
					// solucao do gpto
					contas.cadastrar(new ContaPoupanca(nomeTitular, numAgencia, contas.gerarNumero(), tipoConta, saldo,
							contas.gerarNumero(), aniversario));

				}
				}

//				
//				if (opcao == 1) {
//					
//					  System.out.println("            Insira o nome do Titular:               ");
//				        String titular = leia.nextLine();
//				        
//				        System.out.println("            Insira a agencia:                       ");
//				        String agencia = leia.nextLine();
//
//				        System.out.println("            Insira seu CPF:                         ");
//				        String cpf = leia.nextLine();
//
//				        System.out.println("            Insira o status da conta (Ativa/Inativa):");
//				        String status = leia.nextLine();
//				       
//				        ContaPoupanca conta1 = new ContaPoupanca( titular,1,0,1,1.0f,0);
//				        System.out.println("\n"+conta1.poupanca()+ "          ");
//				        conta1.visualizar();
//				}

//				switch (opcao) {
//				case 1:
//
//					String titular, cpf, status;
//					
//					System.out.println("Insira o nome do Titular: ");
//					titular = leia.nextLine();
//					System.out.println("Insira seu cpf: ");
//					cpf = leia.nextLine();
//					ContaPoupanca conta1 = new ContaPoupanca(conta1.setNomeTitular(titular), conta1.setCpf(cpf), conta1.setStatusConta(status));

				// }

				break;
			case 2:
				System.out.println(Cores.TEXT_BLACK + "Listar todas as Contas\n\n");
				contas.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_BLACK + "Consultar dados da Conta - por número\n\n");

				System.out.println("Digite o número da conta: ");
				numConta = leia.nextInt();
				contas.procurarNumero(numConta);
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_BLACK + "Atualizar dados da Conta\n\n");
				System.out.println("Digite o numero da conta: ");
				numConta = leia.nextInt();

				var buscarConta = contas.buscarNaCollection(numConta);

				if (buscarConta != null) {

					tipoConta = buscarConta.getTipo();

					System.out.println("Digite o nome do Titular: ");
					leia.skip("\\R?");
					nomeTitular = leia.nextLine();
					System.out.println("Insira o numero da agência: ");
					numAgencia = leia.nextInt();

					System.out.println("Digite o saldo da conta: ");
					saldo = leia.nextFloat();

					switch (tipoConta) {

					case 1 -> {

						System.out.println("Digite o limite de credito em R$: ");
						limite = leia.nextFloat();

						contas.cadastrar(new ContaCorrente(nomeTitular, numAgencia, contas.gerarNumero(), tipoConta,
								saldo, contas.gerarNumero(), limite));

					}
					case 2 -> {
						System.out.println("Digite o dia do seu aniversário da conta: ");
						aniversario = leia.nextInt();

						contas.cadastrar(new ContaPoupanca(nomeTitular, numAgencia, contas.gerarNumero(), tipoConta,
								saldo, contas.gerarNumero(), aniversario));
					}
					default -> {

						System.out.println("Tipo de conta inválida!");
					}

					}

				} else {
					System.out.println("A conta não foi encontrada!");
				}

				keyPress();
				break;

			case 5:
				System.out.println(Cores.TEXT_BLACK + "Apagar a Conta\n\n");

				System.out.println("Digite o numero da conta: ");
				numConta = leia.nextInt();
				contas.deletar(numConta);

				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_BLACK + "Saque\n\n");
				System.out.println("Digite o numero da conta: ");
				valor = leia.nextFloat();

				do {
					System.out.println("Digite o valor do saque: ");
					valor = leia.nextFloat();
				} while (valor <= 0);

				contas.sacar(numConta, valor);

				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_BLACK + "Depósito\n\n");
				System.out.println("Digite o numero da conta: ");
				numConta = leia.nextInt();

				do {
					System.out.println("Digite o valor do deposito: ");
					valor = leia.nextFloat();
				} while (valor <= 0);

				contas.depositar(numConta, valor);

				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_BLACK + "Transferência entre Contas\n\n");

				System.out.println("Digite o numero da conta de origem: ");
				numConta = leia.nextInt();
				System.out.println("Digite o numero da conta de destino: ");
				numDestino = leia.nextInt();

				do {
					System.out.println("Digite o valor da transferencia: ");
					valor = leia.nextFloat();
				} while (valor <= 0);

				contas.transferir(numConta, numDestino, valor);

				keyPress();
				break;
			default:

				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			}
		}

	}

	public static void sobre() {
		System.out.println("\n***********************************************************");
		System.out.println("Projeto Desenvolvido por: Mina Monteiro                    ");
		System.out.println("Generation Brasil - minam@generation.org                   ");
		System.out.println("https://github.com/0M1n40                                  ");
		System.out.println("***********************************************************");
	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar.");
			System.in.read();
		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}