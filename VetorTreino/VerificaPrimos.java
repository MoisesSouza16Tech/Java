import java.util.Scanner;
public class VerificaPrimos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, resto0=0, a[];
		a = new int[5];
		
		for (int j=0; j<5; j++) {
			resto0=0;
			//ler um numero e verificar se é primo
			
			System.out.println("Entre com um numero inteiro");
			a[j] = in.nextInt();
			//verificar se o resto da divisao é zero
			for (i=1; i<=a[j]; i++) {
				if (a[j]%i == 0) {
					resto0++;
				}
			}
			//verificando se o numero é primo ou nao
			if (resto0 > 2) {
				System.out.println("Não é primo");
			}else {
				System.out.println("É primo");
			}
		} //fechando o vetor
	}
}
