import java.util.Scanner;
public class AnalisaTriangulo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		System.out.println("Entre com a medida do lado A do tri�ngulo:");
		a = in.nextDouble();
		System.out.println("Entre com a medida do lado B do tri�ngulo");
		b = in.nextDouble();
		System.out.println("Entre com a medida do lado C do tri�ngulo");
		c = in.nextDouble();
		if (a > b + c || b > a + c || c > a + b) {
			System.out.println("As medidas n�o s�o capazes de formar um tri�ngulo");
		} else if (a == b && b == c) {
			System.out.println("Tri�ngulo Equilatero");
		} else if (a != b && b != c && a != c) {
			System.out.println("Tri�ngulo Escaleno");
		} else {
			System.out.println("Tri�ngulo Is�sceles");
		}
		in.close();
	}
}

