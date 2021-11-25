import java.util.Scanner;
public class ABissexto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int aInicial, aFinal, i=1, aAtual=0, aBis=0;
		System.out.println("Entre com o ano inicial");
		aInicial = in.nextInt();
		System.out.println("Entre com o ano Final");
		aFinal = in.nextInt();
		aAtual = aInicial;																							i = i * i;
		
			do {
				aAtual = aAtual + 1;																				
				i++;
				if ((aAtual % 400 == 0) || (aAtual % 4 ==0 && aAtual % 100 !=0)) {
					aBis = aBis + 1;
				System.out.print(aAtual+"; ");	
				}else {
					aBis = aBis * 1;
				}
				
			}while (aAtual<aFinal);
			System.out.println("\nO intervalo em questão possui "+aBis+" ano(s) bissextos.");										       	
	in.close();
	}

}