package clases;

public class Carta {
	protected String valor;
	protected boolean enBaraja;
	
	public Carta(String valor , boolean enBaraja) {
		this.valor = valor;
		this.enBaraja = enBaraja;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", enBaraja=" + enBaraja + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
