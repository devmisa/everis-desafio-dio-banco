
public class Main {
	
	public static void main(String[] args) {
		Cliente Misael = new Cliente ();
		Misael.setNome("Misael");
		
		
		Conta cc = new ContaCorrente(Misael);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(Misael);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
