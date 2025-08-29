package br.edu.ifba.principal;

import java.util.Scanner;

import br.edu.ifba.lista.Lista;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int cont = 0;
		Lista l = new Lista();
		while(cont<=4) {
			
			l.adicionarNoComeco(in.nextInt());
			
			cont++;
			
		}
		
		l.listarElementos();
		
		l.adicionarPorPosicao(3, 12);
		
		l.listarElementos();
		
		l.removerInicio();
		
		l.listarElementos();
		
		l.removerDoFim();
		
		l.listarElementos();
		
		l.removerPorPosicao(2);
		
		l.listarElementos();
	}
	
	

}
