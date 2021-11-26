import java.util.Scanner;
public class Ex_5_Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], i, f, n;
		final int TAM = 5;
		a = new int[TAM];
		b = new int[TAM];

		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o valor que quer obter seu fatorial:");
			a[i] = in.nextInt();
			f = 1;

			for (n = a[i]; n > 1; n--) {
				f = f * n;
				b[i] = f;
			}
		}

		for (i = 0; i < TAM; i++) {
			if (b[i] != 0) {
				System.out.println("O fatorial de " + a[i] + " é " + b[i]);
			} else {
				System.out.println("O fatorial de " + a[i] + " é 1");
			}
		}
		in.close();
	}
}


