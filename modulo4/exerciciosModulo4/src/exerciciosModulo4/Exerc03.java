package exerciciosModulo4;

public class Exerc03 {

	public static void main(String[] args) {
		System.out.println("N�meros divisiveis por 4 entre 1 e 30: ");
		for(int i = 1; i <= 30; i++) {
			if(i % 4 == 0) {
				System.out.print(i + " - ");
			}
		}
	}
}
