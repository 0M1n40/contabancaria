package conta;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {
			System.out.println(Cores.ANSI_CYAN_BACKGROUND_BRIGHT + Cores.TEXT_BLACK_BOLD 
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
			
			System.out.println(Cores.ANSI_CYAN_BACKGROUND_BRIGHT + Cores.TEXT_BLACK + Cores.TEXT_RED
					+ "*****************************************************");
			System.out.println("            Entre com a opção desejada:              ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_BLACK + "\nBANCO DO BRAZILZILZIL   - O seu Futuro começa aqui!          ");
				sobre();
				leia.close();
				System.exit(0);
			
		}

		switch (opcao) {
		case 1:
			System.out.println(Cores.TEXT_WHITE  + "Criar Conta\n\n");

			break;
		case 2:
			System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

			break;
		case 3:
			System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

			break;
		case 4:
			System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

			break;
		case 5:
			System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

			break;
		case 6:
			System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

			break;
		case 7:
			System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

			break;
		case 8:
			System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");

			break;
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
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
}