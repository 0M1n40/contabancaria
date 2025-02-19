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
		System.out.println("\n Conta número: " + conta.getNumero() + " foi criado com sucesso!");

	}

	@Override
	public void atualizar(Conta conta) {

		var buscarConta = buscarNaCollection (conta.getNumero());
		
		if (buscarConta != null) {
			listaContas.set(listaContas.indexOf(buscarConta), conta);
			System.out.println("\nConta número : "+ conta.getNumero() + "foi atualizada com sucesso!");
			
		}else 
			System.out.println("\nConta numero: " + conta.getNumero()+ "nãofoi encontrada");
		
	}

	@Override
	public void deletar(int numConta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sacar(int numConta, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numConta, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numOrigem, int numDestino, float valor) {
		// TODO Auto-generated method stub

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
