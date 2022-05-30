
public class Main {

	public static void main(String[] args) {
		Cliente Cliente = new Cliente();
		Cliente.setNome("Johann Malkowski");
		
		Conta cc = new ContaCorrente(Cliente);
		Conta poupanca = new ContaPoupanca(Cliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		poupanca.depositar(100);
		
		cc.imprimirExtrato();
		System.out.println(" ");
		poupanca.imprimirExtrato();
	}

}