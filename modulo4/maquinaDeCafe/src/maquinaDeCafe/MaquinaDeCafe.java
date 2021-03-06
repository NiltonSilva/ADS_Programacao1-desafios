package maquinaDeCafe;

public class MaquinaDeCafe {
	
	private int cod;
	private String tipo;
	private boolean  adocado;
	private int valor;
	
	public MaquinaDeCafe() {
		
	}

	public MaquinaDeCafe(int cod, String tipo, boolean adocado, int valor) {
		this.cod = cod;
		this.tipo = tipo;
		this.adocado = adocado;
		this.valor = valor;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isAdocado() {
		return adocado;
	}

	public void setAdocado(boolean adocado) {
		this.adocado = adocado;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void exibeDados() {
		System.out.println("-----------------------");
		System.out.println("C?digo: " + cod);
		System.out.println("Tipo: " + tipo);
		if(this.adocado == true) {
			System.out.println("Ado?ado: SIM");
		} else {
			System.out.println("Ado?ado: N?O");
		}
		System.out.println("Valor: " + valor);
	}

}
