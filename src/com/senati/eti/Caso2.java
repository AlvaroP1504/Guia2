package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número....: ");
		int n = sc.nextInt();
		
		String mensaje ="Número es par" ;
		
		if (n % 2 != 0)
			mensaje="Número es impar";
		
		System.out.println("\n============Resultados=================");
		System.out.println("Mensaje.....: "+mensaje);

	}

}
