public class JoaoPedroAltura {
	public static void main(String[] args) {
		int i = 0;
		double hJoao = 134, hPedro = 145;
		
		while (hJoao <= hPedro) {
			hJoao += 2.5;
			hPedro += 2;
			i++;
		}
		System.out.println("V�o demorar " + i + " anos para que Jo�o fique mais alto que Pedro.");
		System.out.println("Nesse momento Jo�o estar� com " + hJoao + " cm e Pedro com " + hPedro + " cm.");
	}

}
