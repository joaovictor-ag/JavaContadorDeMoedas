package uninter;

public class Euro extends Moeda {
	//Função da Moeda de Euro
	
	public Euro(double valorInicial) {
		this.valor = valorInicial;
	}
	
	@Override
	public void info() {
		System.out.println("Euro -  " + valor);
	}

	@Override
	public double converter() {
		return this.valor * 5.40;
	}
	
	
	//Identificando cada objeto com Equals
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			
		} 
		
		Euro objetoDeEuro = (Euro) objeto;
		
		if (this.valor != objetoDeEuro.valor) {
			return false;
		}
		
		return true;
	}
	
}
