package exercicioProgramacaoI;

public class Teste {

	public static void main(String[] args) {
		
		// Declarando variáveis
		Pessoa p1, p2, p3;
		Endereco end1, end2;
		Data d1, d2, d3;
		
		// Chamando o construtor da classe Endereço
		end1 = new Endereco("Av. Riachuelo", 92, "São Leopoldo");
		end2 = new Endereco("Rua Santa Ines", 982, "Fortaleza");
		
		// chamando o construtor da classe Data
		d1 = new Data(25, 05, 1987);
		d2 = new Data(30,03,1951);
		d3 = new Data(25, 07, 1962);
		
		// Chamando o construtor da classe Pessoa
		// Pessoa(nome, sexo, dataNascimento, Endereco)
		p1 = new Pessoa("Nilton", 'M', d1, end1);
		p2 = new Pessoa("José", 'M', d2, end2);
		p3 = new Pessoa("Lucilene", 'F', d3, end2);
		
		
		

	}

}
