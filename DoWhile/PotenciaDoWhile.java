import java.util.Scanner;
public class PotenciaDoWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1, b, r, c;
		b=in.nextInt();
		r=b;
		c=in.nextInt();
		do {
			
			r=r*b;
			i++;
			
		}while(i<c);
		System.out.println(r);
		
		in.close();
	}
	
}