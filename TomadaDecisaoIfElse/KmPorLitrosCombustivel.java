import java.util.Scanner;
public class KmPorLitrosCombustivel {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double km, litros, gastoM;
		System.out.println("Entre com a dist�ncia percorrida em KM:");
		km = in.nextDouble();
		System.out.println("Entre com a capacidade do tanque de combust�vel em litros:");
		litros = in.nextDouble();

		gastoM = km / litros;
		System.out.printf("O gasto m�dio de combustivel do ve�culo � de %.2f", gastoM);

		if (gastoM >= 10) {
			System.out.println("\nEcon�mico");
		} else {
			System.out.println("\nN�o Econ�mico");
		}
		in.close();
	}
}
