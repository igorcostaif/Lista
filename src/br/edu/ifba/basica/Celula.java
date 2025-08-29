package br.edu.ifba.basica;

public class Celula {
	
	private Celula proximo;
	private Object elemento;
	
	public Celula(Celula proximo, Object elemento) {
		super();
		this.proximo = proximo;
		this.elemento = elemento;
	}
	public Celula() {
		super();
	}
	public Celula(Object elemento) {
		this.elemento = elemento;
	}
	
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	@Override
	public String toString() {
		return "Celula [proximo=" + proximo + ", elemento=" + elemento + "]";
	}
	
	

}
