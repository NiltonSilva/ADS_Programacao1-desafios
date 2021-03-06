package maquinaDeCafe;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean continuaComprando = true;
		int opcaoDoce;
		boolean doce;
		int opcao;
		int notaInserida;
		double troco;
		MaquinaDeCafe expresso = null;
		MaquinaDeCafe capuccino = null;
		MaquinaDeCafe chocolateQuente = null;
		
			do {
				System.out.println("-----------------------------");
				System.out.println("1 - Expresso");
				System.out.println("2 - Capuccino");
				System.out.println("3 - Chocolate Quente");
				System.out.println("-----------------------------");
				System.out.print("Digite a op??o desejada: ");
				opcao = input.nextInt();
				
				switch(opcao) {
				case 1:	
					System.out.println("Digite 0-Sem A??car / 1-Com A??car");
					opcaoDoce = input.nextInt();
					if(opcaoDoce == 1) {
						doce = true;
					} else {
						doce = false;
					}
					expresso = new MaquinaDeCafe(1, "Expresso", doce, 2);
					break;
					
				case 2:	
					System.out.println("Digite 0-Sem A??car / 1-Com A??car");
					opcaoDoce = input.nextInt();
					if(opcaoDoce == 1) {
						doce = true;
					} else {
						doce = false;
					}
					capuccino = new MaquinaDeCafe(2, "Capuccino", doce, 5);
					break;
					
				case 3:	
					System.out.println("Digite 0-Sem A??car / 1-Com A??car");
					opcaoDoce = input.nextInt();
					if(opcaoDoce == 1) {
						doce = true;
					} else {
						doce = false;
					}
					chocolateQuente = new MaquinaDeCafe(3, "Chocolate Quente", doce, 5);
					break;
				default:
					System.out.println("Opcao inv?lida");
				}
				
				do {
					System.out.print("Insira a nota para pagamento: ");
					notaInserida = input.nextInt();
					if(notaInserida != 2 && notaInserida != 5) {
						System.out.println("Nota inserida inv?lida");
						System.out.println("S? s?o aceita notas notas de R$ 2,00 e R$ 5,00.");
					}
				} while(notaInserida != 2 && notaInserida != 5);
				
				switch(opcao) {
				case 1:
					if(expresso.getValor() == notaInserida) {
						System.out.println("-- Caf? pronto --");
						expresso.exibeDados();
					} else {
						System.out.println("-- Caf? pronto --");
						expresso.exibeDados();
						System.out.println("Aguarde seu troco.");
						troco = notaInserida - expresso.getValor();
						System.out.println("-- Troco R$ " + troco + "--");
					}
					break;
				case 2:
					if(capuccino.getValor() == notaInserida) {
						System.out.println("-- Capuccino pronto --");
						capuccino.exibeDados();
					} else if(capuccino.getValor() > notaInserida) {
						System.out.println("Capuccino indispon?vel.");
						System.out.println("Valor inserito abaixo do cobrado.");
						System.out.println("Aguarde seu dinheiro!");
						System.out.println("-- Valor devolvido R$ " + notaInserida + "--");
					}
					break;
				case 3:
					if(chocolateQuente.getValor() == notaInserida) {
						System.out.println("-- Chocolate Quente pronto --");
						chocolateQuente.exibeDados();
					} else if(capuccino.getValor() > notaInserida) {
						System.out.println("Chocolate Quente indispon?vel.");
						System.out.println("Valor inserito abaixo do cobrado.");
						System.out.println("Aguarde seu dinheiro!");
						System.out.println("-- Valor devolvido R$ " + notaInserida + "--");
					}
					break;	
				}
			} while(opcao >= 1 && opcao <= 3);
		
		input.close();
	}
}
