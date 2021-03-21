package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00000");
		
		System.out.print("Empleado.........: ");
		String nomEmpleado = sc.nextLine();
		
		System.out.print("Horas trabajas...: ");
		float ht = sc.nextFloat();
		
		System.out.print("Tarifa por hora..: ");
		float tarifaHora = sc.nextFloat();

		System.out.print("Minutos tardados.: ");
		int minT = sc.nextInt();
		

		
		float bono = 0, dscto = 0;
		float importe = (ht * tarifaHora);
		
		float meta = (float) ((ht/70) * 100);
		
		if (ht > 60) 
			bono = importe * 0.13f;
		else
			bono = (ht * tarifaHora) * 0.04f;
			
		
		if (minT > 15)
			dscto = (ht * tarifaHora) * 0.003f;

		System.out.println("\n=========== Resultados ============");
		System.out.println("Empleado............: " + nomEmpleado);
		System.out.println("Horas trabajadas....: " + ht);
		System.out.println("Tarifa por hora.....: " + tarifaHora);
		System.out.println("Importe.............: " + importe);
		System.out.println("Bono................: " + bono);
		System.out.println("Descuento...........: " + dscto);
		System.out.println("Meta alcanzada......: " + df.format(meta) + "%"); 

	}

}
