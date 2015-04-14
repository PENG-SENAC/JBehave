package com.gartisk.jbehave;

public class Triangulo {

	private int a, b, c;
	private String tipo;

	public Triangulo(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		// Dimensão inválida
		if( a <= 0 || b <= 0 || c <= 0){
			this.tipo = TipoTriangulo.INVALIDO;
			return;
		// SE 2 Lados nao forem maior do o terceiro, não é um triangulo.
		} else if( (a > (b+c) ) && (b > (a+c)) && (c > (a+b)) ){
			this.tipo = TipoTriangulo.INVALIDO;
			return;	
		}
		
		// 3 Lados iguais
		if( a == b && a == c){
			this.tipo =  TipoTriangulo.EQUILATERO;
		
		// 2 Lados iguais e um diferente
		} else if( (a == b && b != c) || (b == c && b != a) ){
			tipo = TipoTriangulo.ISOSCELES;
		
		// 3 Lados diferentes
		} else if( a != b && a != c && b != c ){
			tipo =  TipoTriangulo.ESCALENO;
		} 
		
		System.out.println("a = "+a+"; b = "+b+"; c = "+c);
	}

	public String retornarTipo() {
		return tipo;
	}
}
