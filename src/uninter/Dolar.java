package uninter;

public class Dolar extends Moeda {
	//Função da Moeda de Dolar
	
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}
	
	@Override
	public void info() {
		System.out.println("Dolar -  " + valor);
	}

	@Override
	public double converter() {
		return this.valor * 4.80;
	}
	
	
	//Identificando cada objeto com Equals
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			
		} 
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if (this.valor != objetoDeDolar.valor) {
			return false;
		}
		
		return true;
	}
}
