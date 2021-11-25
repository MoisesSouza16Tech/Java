import java.util.Scanner;
public class KmPorLitrosCombustivel {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double km, litros, gastoM;
		System.out.println("Entre com a distância percorrida em KM:");
		km = in.nextDouble();
		System.out.println("Entre com a capacidade do tanque de combustível em litros:");
		litros = in.nextDouble();

		gastoM = km / litros;
		System.out.printf("O gasto médio de combustivel do veículo é de %.2f", gastoM);

		if (gastoM >= 10) {
			System.out.println("\nEconômico");
		} else {
			System.out.println("\nNão Econômico");
		}
		in.close();
	}
}
