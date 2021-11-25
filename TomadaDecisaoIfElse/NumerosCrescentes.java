import java.util.Scanner;
public class NumerosCrescentes {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a, b, c;

		System.out.println("Entre com o primeiro valor inteiro:");
		a = in.nextInt();
		System.out.println("Entre o segundo valor inteiro:");
		b = in.nextInt();
		System.out.println("Ente com o terceiro valor inteiro:");
		c = in.nextInt();

		if (a < b && b < c) {
			System.out.println("\nOs valores em ordem crescente são: " + a + ", " + b + ", " + c);
		} else if (a < c && c < b) {
			System.out.println("\nOs valores em ordem crescente são: " + a + ", " + c + ", " + b);
		} else if (b < a && a < c) {
			System.out.println("\nOs valores em ordem crescente são: " + b + ", " + a + ", " + c);
		} else if (b < c && c < a) {
			System.out.println("\nOs valores em ordem crescente são: " + b + ", " + c + ", " + a);
		} else if (c < a && a < b) {
			System.out.println("\nOs valores em ordem crescente são: " + c + ", " + a + ", " + b);
		} else {
			System.out.println("\nOs valores em ordem crescente são: " + c + ", " + b + ", " + a);
		}
		in.close();
	}
}