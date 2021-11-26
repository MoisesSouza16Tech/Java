import java.util.Scanner;
public class Ex_2_Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i, j, resultado;
		a = new int[5];

		for (i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "º número de sua escolha para o vetor:");
			a[i] = in.nextInt();
		}
		System.out.println();

		for (i = 0; i < 5; i++) {
			System.out.println();
			System.out.println("\nTabuada do " + a[i] + ": ");
			for (j = 0; j <= 10; j++) {
				resultado = a[i] * j;
				System.out.print("\n" + a[i] + " x " + j + " = " + resultado);
			}
		}
		in.close();
	}
}
