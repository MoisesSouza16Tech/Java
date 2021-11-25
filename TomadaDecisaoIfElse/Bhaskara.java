import java.util.Scanner;
public class Bhaskara {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double a, b, c, delta, raizDelta, x1, x2;
		System.out.println("Entre com o valor de A");
		a = in.nextDouble();
		System.out.println("Entre com o valor de B");
		b = in.nextDouble();
		System.out.println("Entre com o valor de C");
		c = in.nextDouble();
		delta = (b*b)-4*a*c;

		if (delta <0) {
			System.out.println("Não exixstem raízes reais para essa equação");
		} else if (delta == 0) {
			x1 = (-b) / (2 * a);
			System.out.println("Existe uma raiz real");
			System.out.println("x1 = "+x1);
		} else {			
			raizDelta = Math.sqrt(delta);
			x1 = (-b + raizDelta) / (2*a);
			x2 = (-b - raizDelta) / (2*a);
			System.out.println("Existem 2 raizes reais para essa equação");
			System.out.printf("x1 =  %.2f\n",x1);
			System.out.printf("x2 =  %.2f\n",x2);
			
		}
		in.close();
	}
}
