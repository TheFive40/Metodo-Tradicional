package MetodoTradicional;

import java.util.Scanner;

public class Sales_Oxacidas_AcidasTradicional {

	public void Sales_Acidas() {
		System.out.println(" -------------------------------------------------- ");
		System.out.println("Bienvenido, al Metodo Tradicional de Nomenclatura de los Acidos Oxacidas Neutras");
		System.out.println("¿Cual Caso para los Hidroxidos desea aplicar?");
		System.out.println("\n1: Caso 1 \n2: Caso 2 \n3: Caso 3");
		
		Scanner entrada = new Scanner (System.in);
		int Caso = entrada.nextInt();
		
		if(Caso == 1) {
			System.out.println("A continuacion la Lista de Hidruros Programados");
			String [] Oxacidos = new String [6];
			Oxacidos [0] = "[0] NaHCO2";
			Oxacidos [1] = "[1] NaHCO3";
			Oxacidos [2] = "[2] Cu(HCO2)2";
			Oxacidos [3] = "[3] CuHCO3";
			Oxacidos [4] = "[4] NaH2PO4";
			Oxacidos [5] = "[5] Na2HPO3";
			
			for(int i = 0;i<6;i++) {
				System.out.println(Oxacidos[i]);
			}
			
			System.out.println("Por favor, escoja  el número de la lista que desea");
			Scanner Entrada = new Scanner(System.in);
			int Eleccion = Entrada.nextInt();
			if (Eleccion == 0) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");
				
				System.out.println("Es un CARBONITO ACIDO DE SODIO");	
				
				System.out.println("O TAMBIEN BICARBONITO DE SODIO");

			}else if (Eleccion == 1) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un CARBÓNATO ACIDO DE SODIO");
				System.out.println("O TAMBIEN BICARBÓNATO DE SODIO O");

			}else if (Eleccion == 2) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es  ");
			}else if (Eleccion == 3) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un ");
			}else if (Eleccion == 4) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un FOSFATO ACIDO DE SODIO ");
			}else if (Eleccion == 5) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un FOSFITO ACIDO DE SODIO");
			}
		}else if (Caso == 2) {
			System.out.println("A continuacion la Lista de Hidruros Programados");
			String [] Oxacidos = new String [6];
			Oxacidos [0] = "[0] LiHSO2";
			Oxacidos [1] = "[1] Mg(HSO3)2";
			Oxacidos [2] = "[2] NaHSO4";
			Oxacidos [3] = "[3] Cu2TeO2";
			Oxacidos [4] = "[4] CuTeO3";
			Oxacidos [5] = "[5] PbTeO4";
			for(int i = 0;i<6;i++) {
				System.out.println(Oxacidos[i]);
			}
			
			
			System.out.println("Por favor, escoja  el número de la lista que desea");
			Scanner Entrada = new Scanner(System.in);
			int Eleccion = Entrada.nextInt();
			if (Eleccion == 0) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");
				
				System.out.println("Es un HIPOSULFITO DE LITIO");		
			}else if (Eleccion == 1) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un SULFITO ACIDO DE MAGNESIO");
			}else if (Eleccion == 2) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un SULFATO ACIDO DE SODIO");
			}else if (Eleccion == 3) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un  HIPOTELURITO ACIDO DE COBRE");
			}else if (Eleccion == 4) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un TELURITO ACIDO DE COBRE ");
			}else if (Eleccion == 5) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es unm TELURATO ACIDO DE PLOMO ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
