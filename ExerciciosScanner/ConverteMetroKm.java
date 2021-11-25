import java.util.Scanner;
public class ConverteMetroKm {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double m, km;
		
		System.out.println("Entre com o valor em metros: ");
		m = leia.nextDouble();
		
		km = m/1000;
		
		System.out.println("O valor de "+m+" m em quilômetros é: "+km+" km.");
		in.close();
	}

}