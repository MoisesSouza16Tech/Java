import java.util.Scanner;
public class VerificaIdade {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int anoNasc, aAtual, id;
		System.out.println("Entre com a data de nascimento:");
		anoNasc = in.nextInt();
		System.out.println("Entre com o ano atual:");
		aAtual = in.nextInt();
		
		id = aAtual - anoNasc;
		System.out.println("Sua idade é " + id + " anos");

		if (id < 10) {
			System.out.println("Criança");
		} else if (id < 18) {
			System.out.println("Adolescente");
		} else if (id < 60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
		in.close();
	}
}