public class JoaoPedroAltura {
	public static void main(String[] args) {
		int i = 0;
		double hJoao = 134, hPedro = 145;
		
		while (hJoao <= hPedro) {
			hJoao += 2.5;
			hPedro += 2;
			i++;
		}
		System.out.println("Vão demorar " + i + " anos para que João fique mais alto que Pedro.");
		System.out.println("Nesse momento João estará com " + hJoao + " cm e Pedro com " + hPedro + " cm.");
	}

}
