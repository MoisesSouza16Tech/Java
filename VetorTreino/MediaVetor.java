import java.util.Scanner;
public class MediaVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10; //constante com valor 10
		int i, a[], m=0;
		a = new int[TAM];
		//leitura do vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"o valor:");
			a[i]=in.nextInt();
			m=m+a[i];
		}
		m = m/TAM;
		
		//apresenta��o da m�dia
		System.out.println("A m�dia dos valores inseridos no vetor �: "+m);
		in.close();
		
	}

}