import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result = 1, i = 1, n;
		System.out.println("Entre com um n�mero inteiro:");
		n = in.nextInt();

		while (i <= n) {
			result = result * i;
			i++;
		}
		System.out.println("O fatorial de " + n + " � igual a " + result);
		in.close();
	}

}
