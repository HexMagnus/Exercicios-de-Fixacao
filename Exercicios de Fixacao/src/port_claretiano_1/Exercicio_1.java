package port_claretiano_1;

import java.util.Scanner;

public class Exercicio_1 {
	
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double combustivel, litros, total;
		
		
		System.out.print("Informe o valor do combustível: ");
		combustivel= input.nextDouble();
		
		System.out.print("Informe o número de litros: :");
		litros = input.nextDouble();
		
		total = combustivel*litros;
		
		System.out.println("Valor do combustível -> " +combustivel);
		System.out.println("Quantidade de litros ->  = " + litros);
		System.out.println("é " + total);
	    	   
       
		}

	}

	