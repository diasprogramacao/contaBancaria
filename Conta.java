package contaBancaria2;

public class Conta {

	// Atributos do objeto;
	
	int agencia;
	int numero;
	double saldo; 
	String titular;

	// Ações do objeto 
	
	
	public void deposita (double valor) {
		
		this.saldo = this.saldo + valor;
	}
	
	public boolean saque (double valor) {
		
		if (this.saldo >= valor) {
			
			this.saldo -=  valor;
			
			return true;
		} else {
			
			return false;
		}
	}
	
		public boolean transfere (double valor , Conta destino) {
			
			if (this.saldo >= valor) {
				
				this.saldo -= valor;
				
			  destino.saldo += valor;
				
				return true;
			
			} else 
				
				return false;
		}
}
