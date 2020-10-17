package com.testes;

public class Calculadora {

	public int somar (String valor) {
	
	  int soma = 0 ;
	  for(String valorSomar : valor.split("\\+"))
		  soma+=Integer.valueOf(valorSomar);
	  
	  System.out.print(soma);
	  return soma ;
		
		
	}
	
}
