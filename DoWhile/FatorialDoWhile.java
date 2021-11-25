import java.util.Scanner;
public class FatorialDoWhile {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int i=1, r=1, n;
		
		n=in.nextInt();
		
		do {
			
			r=r*i;
			
			i++;
		}while(i<=n);
		
		System.out.println(r);
		
		in.close();
		
		
	}

}