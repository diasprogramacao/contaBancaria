package contaBancaria2;

public class criarConta {

	public static void main(String[]agrs) {
	
		//REFERECIA CONTA 1
		Conta referencia1 = new Conta();
		//REFERECIA CONTA 2
		Conta referencia2 = new Conta();
		
		//DEPOSITO CONTA 1
		referencia1.deposita(200);
		System.out.println("Saldo Referencia1 = " + referencia1.saldo);
		
		//SAQUE CONTA 1 
		
	    referencia1.saque(100);
	    System.out.println("Saldo logo após saque " + referencia1.saldo);
	    
	    //TRANSFERENCIA CONTA 1 PARA CONTA 2;
	    
	    referencia1.transfere(50, referencia2);
	    System.out.println("Saldo conta 2, após receber transferência : " + referencia2.saldo);
	    	
	    }
	}
	

