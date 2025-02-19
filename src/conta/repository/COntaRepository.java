package conta.repository;
import conta.model.Conta;
public interface COntaRepository {

	
	//crud da conta
	//Criar Conta, Consultar todas as Contas, Consultar Conta pelo número,
	//Atualizar dados da Conta e Apagar Conta
	
	public void procurarNumero (int numConta);
	public void listarTodas();
	public void cadastrar (Conta conta);
	public void atualizar(Conta conta);
	public void deletar (int numConta);
	
	
	//metodos bancarios
	public void sacar (int numConta, float valor);
	public void depositar (int numConta, float valor);
	public void transferir (int numOrigem, int numDestino, float valor);
}
