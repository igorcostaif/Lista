package br.edu.ifba.lista;

import br.edu.ifba.basica.Celula;

public class Lista {
	
	private Celula cabeca;
	private Celula cauda;
	
	private int totalElementos = 0;
	
	public void adicionarNoComeco(Object elemento) {
		
		Celula celula = new Celula(this.cabeca,elemento); 
		this.cabeca = celula;
		
		if(this.totalElementos==0) {
			this.cauda = celula;
		}
		
		this.totalElementos++;
		
		
	}
	
	public void adicionaNoFinal(Object elemento) {
		
		if(this.totalElementos==0) {
			adicionarNoComeco(elemento);
		}else {
			Celula celula = new Celula(elemento);
			this.cauda.setProximo(celula);
			this.cauda = celula;
			this.totalElementos++;
			
			
		}
		
		
		
	}
	
	public void listarElementos() {
		
		Celula atual = this.cabeca;
		
		System.out.print("[");
		
		for(int cont=0;cont<this.totalElementos-1;cont++) {
			
			System.out.print(atual.getElemento()+"-");
			
			atual = atual.getProximo();
			
		}
		
		System.out.print(atual.getElemento()+"]");
		
		
	}
	

}
