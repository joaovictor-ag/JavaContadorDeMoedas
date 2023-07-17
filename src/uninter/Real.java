package uninter;

public class Real extends Moeda {
	//Função da Moeda de REAL
	
	public Real(double valorInicial) {
		this.valor = valorInicial;
	}

	@Override
	public void info() {
		System.out.println("Real -  " + valor);
	}

	@Override
	public double converter() {	
		System.out.println("----------Total Convertido para Reais----------");
		return this.valor;
		
	}
	
	//Identificando cada objeto com Equals
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			
		} 
		
		Real objetoDeReal = (Real) objeto;
		
		if (this.valor != objetoDeReal.valor) {
			return false;
		}
		
		return true;
	}
	
	
}
