import java.util.Scanner;
public class Ex_9_Palindromos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 11;
		int a[] = new int[TAM];
		int i, n = 0;

		// Lendo os elementos
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o " + (i + 1) + "� n�mero:");
			a[i] = in.nextInt();
		}

		// Verificando
		for (i = 0; i < TAM; i++) {

			if (a[i] == a[(TAM - 1) - i]) {
				n++;
			}
		}

		// Apresentando se os elementos s�o palindromos ou n�o
		if (n == TAM) {
			System.out.println("Os elementos do vetor s�o pal�ndromos");
		} else {
			System.out.println("Os elementos do vetor n�o s�o pal�ndromos.");
		}

		in.close();
	}
}