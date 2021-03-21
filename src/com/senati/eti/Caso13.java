package com.senati.eti;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String opTipo = "";
		float rpta = 0;
		
		System.out.print("Primer número.....: ");
		float pn = sc.nextInt();
		
		System.out.print("Segundo número....: ");
		float sn = sc.nextInt();
		
		System.out.print("Operación [1-6]...: ");
		int op = sc.nextInt();
		
		if (op == 1) {
			opTipo = "Suma";
			rpta =(int) (pn + sn);
		}
		
		else if (op == 2) {
			opTipo = "Resta";
			rpta = (int) (pn - sn);
		}

		else if (op == 3) {
			opTipo = "Producto";
			rpta = pn * sn;
		}

		else if (op == 4) {
			rpta = 0; 
			if (pn == 0 || sn == 0) {
				opTipo = "No es posible hayar división";
				rpta = 0;
			}
			else {
				opTipo = "División";
				rpta = pn / sn;
			}
		}

		else if (op == 5) {
			if (pn == 0 || sn == 0) {
				opTipo = "No es posible hayar el resto entero";
				rpta = 0;
			}
			else {
				opTipo = "Resto entero";
				rpta = (int) pn % sn;
			}
		}
		
		else if (op == 6) {
			opTipo = "Promedio";
			rpta = (pn+sn)/2;
		}
		
		else {
			opTipo = "Parámetro no especificado.";
			rpta = 0;
		}
		
		System.out.println("\n... Resultados ...");
		System.out.println("Número 1.......: " + pn);
		System.out.println("Número 2.......: " + sn);
		System.out.println("Operación......: " + opTipo);
		System.out.println("Resultado......: " + rpta);
	}

}
