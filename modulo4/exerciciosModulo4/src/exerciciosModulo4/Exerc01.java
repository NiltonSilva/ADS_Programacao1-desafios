package exerciciosModulo4;

public class Exerc01 {

	public static void main(String[] args) {
		
		int soma = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println("A soma dos n�meros �mpares de 1 a 20 � = " + soma);
	}

}
