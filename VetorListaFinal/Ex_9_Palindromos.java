import java.util.Scanner;
public class Ex_9_Palindromos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 11;
		int a[] = new int[TAM];
		int i, n = 0;

		// Lendo os elementos
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o " + (i + 1) + "º número:");
			a[i] = in.nextInt();
		}

		// Verificando
		for (i = 0; i < TAM; i++) {

			if (a[i] == a[(TAM - 1) - i]) {
				n++;
			}
		}

		// Apresentando se os elementos são palindromos ou não
		if (n == TAM) {
			System.out.println("Os elementos do vetor são palíndromos");
		} else {
			System.out.println("Os elementos do vetor não são palíndromos.");
		}

		in.close();
	}
}