import java.util.Scanner;

public class CincoAlunos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1;
		double n1, n2, m;

		while (i <= 5) {
			System.out.println("Entre com a 1� nota do " + i + "� aluno:");
			n1 = in.nextDouble();
			System.out.println("Entre com a 2� nota do " + i + "� aluno:");
			n2 = in.nextDouble();
			m = (n1 + n2) / 2;
			System.out.println("Sua m�dia �: " + m);
			if (m >= 6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
			i++;
		}
		in.close();
	}

}
