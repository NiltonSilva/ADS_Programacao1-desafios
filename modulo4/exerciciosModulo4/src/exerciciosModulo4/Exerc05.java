package exerciciosModulo4;

public class Exerc05 {

	public static void main(String[] args) {

		int soma = 0;
		
		for(int i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
				soma = soma + i;
			}
		}	
		System.out.println("O valor dos n?meros pares entre 1 e 50 ? = " + soma);
	}
}
