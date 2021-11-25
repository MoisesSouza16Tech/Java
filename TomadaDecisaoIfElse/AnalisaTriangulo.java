import java.util.Scanner;
public class AnalisaTriangulo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		System.out.println("Entre com a medida do lado A do triângulo:");
		a = in.nextDouble();
		System.out.println("Entre com a medida do lado B do triângulo");
		b = in.nextDouble();
		System.out.println("Entre com a medida do lado C do triângulo");
		c = in.nextDouble();
		if (a > b + c || b > a + c || c > a + b) {
			System.out.println("As medidas não são capazes de formar um triângulo");
		} else if (a == b && b == c) {
			System.out.println("Triângulo Equilatero");
		} else if (a != b && b != c && a != c) {
			System.out.println("Triângulo Escaleno");
		} else {
			System.out.println("Triângulo Isósceles");
		}
		in.close();
	}
}

