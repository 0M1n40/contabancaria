package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.COntaRepository;

public class ContaController implements COntaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int num = 0;

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub

		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta conta) {
		// TODO Auto-generated method stub

		listaContas.add(conta);
		System.out.println("\n       Conta número: " + conta.getNumero() + " foi criado com sucesso!  ");

	}

	@Override
	public void atualizar(Conta conta) {

		var buscarConta = buscarNaCollection(conta.getNumero());

		if (buscarConta != null) {
			listaContas.set(listaContas.indexOf(buscarConta), conta);
			System.out.println("\nConta número : " + conta.getNumero() + " foi atualizada com sucesso!");

		} else
			System.out.println("\nConta numero: " + conta.getNumero() + " não foi encontrada");

	}

	@Override
	public void deletar(int numConta) {

		var conta = buscarNaCollection(numConta);

		if (conta != null) {

			if (listaContas.remove(conta) == true)
				System.out.println("\nConta numero: " + numConta + " foi deletada con sucesso!");

		} else
			System.out.println("\nConta numero: " + numConta + " não foi encontrada!");

	}

	@Override
	public void sacar(int numConta, float valor) {

		var conta = buscarNaCollection(numConta);
		if (conta != null) {

			if (conta.sacar(valor) == true)
				System.out.println("\nSaque da conta numero: " + numConta + " foi efetuado con sucesso!");

		} else
			System.out.println("\nConta numero: " + numConta + " não foi encontrada!");

	}

	@Override
	public void depositar(int numConta, float valor) {
		var conta = buscarNaCollection(numConta);

		if (conta != null) {

		conta.depositar (valor);
				System.out.println("\nO depósito na conta numero: " + numConta + " foi efetuado con sucesso!");

		} else
			System.out.println("\nConta numero: " + numConta + " não foi encontrada ou a conta destino não é uma conta corrente!");

		

	}

	@Override
	public void transferir(int numOrigem, int numDestino, float valor) {

		var contaOrigin = buscarNaCollection (numOrigem);
		var contaDestino = buscarNaCollection (numDestino);
		
		if (contaOrigin != null && contaDestino != null) {
			if (contaOrigin.sacar(valor)== true) {}
			contaDestino.depositar(valor);
			System.out.println("\n       Transferencia foi efetuada com sucesso!               ");
			
		}else 
			System.out.println("\n\n***********************************************************");
			System.out.println("\n    A conta de origem e/ou destino não foi encontrada        ");
	}

	public int gerarNumero() {

		return ++num;
	}

	public Conta buscarNaCollection(int numConta) {

		for (var conta : listaContas) {
			if (conta.getNumero() == numConta) {
				return conta;
			}
		}
		return null;
	}

	@Override
	public void procurarNumero(int numConta) {
		// TODO Auto-generated method stub

		// assinatura de metodo inserico como parametro com uma variavel inteiro,
		// ela vai receber um numero da conra que quer localizar
		var conta = buscarNaCollection(numConta);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("\nConta número: " + numConta + "não foi encontrada!");

	}

}
