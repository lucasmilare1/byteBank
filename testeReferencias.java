import java.security.spec.RSAOtherPrimeInfo;

public class testeReferencias {
public static void main(String[] args) {
	conta primeiraConta = new conta ();
	primeiraConta.saldo = 300;
	System.out.println("saldo da primeira: " + primeiraConta.saldo);

	conta segundaConta = primeiraConta;
	System.out.println("saldo da segunda conta " + segundaConta.saldo);

	segundaConta.saldo += 100;
	System.out.println("saldo da segunda conta é " + segundaConta.saldo);
	 
	if(primeiraConta == segundaConta) {
		System.out.println("são a mesmissa conta");
	}
	
}
}
