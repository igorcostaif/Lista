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
	
	public boolean verificarPosicao(int posicao) {
		return posicao>=0 && posicao<this.totalElementos;
	}
	
	public void adicionarPorPosicao(int posicao, Object obj ) {
		
		if(!verificarPosicao(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		if(posicao==0) {
			adicionarNoComeco(obj);
		}else if(posicao == this.totalElementos) {
			adicionaNoFinal(obj);
		}else {
			
			Celula aux = this.cabeca;
			
			for(int cont=0;cont<posicao-1;cont++) {
				aux = aux.getProximo();
			}
			
			Celula nova = new Celula(aux.getProximo(),obj);
			aux.setProximo(nova);
			this.totalElementos++;
			
			
			
		}
		
	}
	
	public void removerInicio() {
		
		this.cabeca = this.cabeca.getProximo();
		this.totalElementos --;
		
		if(this.totalElementos==0) {
			
			this.cauda = null;
		}
		
	}
	
	public void removerDoFim() {
		if(this.totalElementos==1) {
			removerInicio();
		}
		
		Celula penultima = this.cabeca;
		
		for(int cont=0;cont<this.totalElementos-1;cont++) {
			penultima = penultima.getProximo();
		}
		
		penultima.setProximo(null);
		this.cauda = penultima;
		
		this.totalElementos--;
	}
	
	public void removerPorPosicao(int posicao) {
		
		if(!verificarPosicao(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		if(posicao==0) {
			removerInicio();
		}else if(posicao==this.totalElementos) {
			removerDoFim();
		}else {
			Celula aux = this.cabeca;
			for(int cont=0;cont<posicao-1;cont++) {
				aux = aux.getProximo();
			}
			
			aux.setProximo(aux.getProximo().getProximo());
			
			this.totalElementos--;
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
