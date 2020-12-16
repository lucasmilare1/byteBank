
public class testaMetodo {
	public static void main(String[] args) {
		conta contaDoPaulo = new conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.saldo);
		
		 boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		
		conta contaDaMarcela = new conta();
	 contaDaMarcela.deposita(1000);
	 
	if( contaDaMarcela.transfere(300, contaDoPaulo)) {
		System.out.println("tranferencia com sucesso");
	} else {
		System.out.println("faltou dinheiro");
	}
	 System.out.println(contaDaMarcela.saldo);
	 System.out.println(contaDoPaulo.saldo);
		 
	 contaDoPaulo.titular = "paulo silveira";
	 System.out.println(contaDoPaulo.titular);
	}
	}
