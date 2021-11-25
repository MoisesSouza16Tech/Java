import java.util.Scanner;
public class CalculaImc {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double peso, altura, imc;
		System.out.println("Digite seu peso em kg:");
		peso = in.nextDouble();
		System.out.println("Entre com sua altura em metros:");
		altura = in.nextDouble();

		imc = peso / (altura * altura);
		System.out.printf("Seu IMC é de %.2f", imc);

		if (imc < 18.5) {
			System.out.println("\nExcesso de Magreza");
		} else if (imc < 25) {
			System.out.println("\nPeso Normal");
		} else if (imc < 30) {
			System.out.println("\nExcesso de Peso");
		} else if (imc < 35) {
			System.out.println("\nObesidade (Grau I)");
		} else if (imc < 40) {
			System.out.println("\nObesidade (Grau II)");
		} else {
			System.out.println("\nObesidade (Grau III)");
		}
		in.close();
	}
}