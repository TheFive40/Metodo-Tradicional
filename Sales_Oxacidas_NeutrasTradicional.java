package MetodoTradicional;

import java.util.Scanner;

public class Sales_Oxacidas_NeutrasTradicional {

	public void Sales_Neutras() {
		System.out.println(" -------------------------------------------------- ");
		System.out.println("Bienvenido, al Metodo Tradicional de Nomenclatura de los Acidos Oxacidas Neutras");
		System.out.println("¿Cual Caso para los Hidroxidos desea aplicar?");
		System.out.println("\n1: Caso 1 \n2: Caso 2 \n3: Caso 3");
		
		Scanner entrada = new Scanner (System.in);
		int Caso = entrada.nextInt();
		
		if(Caso == 1) {
			System.out.println("A continuacion la Lista de Hidruros Programados");
			String [] Oxacidos = new String [8];
			Oxacidos [0] = "[0] Na2CO2";
			Oxacidos [1] = "[1] Fe2CO3";
			Oxacidos [2] = "[2] CuCO2";
			Oxacidos [3] = "[3] Cu2CO3";
			Oxacidos [4] = "[4] AlPO4";
			Oxacidos [5] = "[5] FePO3";
			
			for(int i = 0;i<8;i++) {
				System.out.println(Oxacidos[i]);
			}
			
			System.out.println("Por favor, escoja  el número de la lista que desea");
			Scanner Entrada = new Scanner(System.in);
			int Eleccion = Entrada.nextInt();
			if (Eleccion == 0) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");
				
				System.out.println("Es un CARBONITO DE SODIO");		
			}else if (Eleccion == 1) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un CARBÓNATO FERROSO");
			}else if (Eleccion == 2) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un CLORATO DE ");
			}else if (Eleccion == 3) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un CARBONATO CRUPOSO");
			}else if (Eleccion == 4) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un FOSFATO ALUMINICO");
			}else if (Eleccion == 5) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un SULFITO FERRICO");
			}
		}else if (Caso == 2) {
			System.out.println("A continuacion la Lista de Hidruros Programados");
			String [] Oxacidos = new String [6];
			Oxacidos [0] = "[0] FeSO2";
			Oxacidos [1] = "[1] Fe2(SO3)3";
			Oxacidos [2] = "[2] FeSO4";
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
				
				System.out.println("Es un HIPOSULFITO FERROSO");		
			}else if (Eleccion == 1) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un SULFITO FERRICO");
			}else if (Eleccion == 2) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un SULFATO FERROSO");
			}else if (Eleccion == 3) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Acido HIPOTELURITO CRUPOSO");
			}else if (Eleccion == 4) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un TELURITO CÚPRICO");
			}else if (Eleccion == 5) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un SULFATO PLUMBOSO");
			}
		}else if (Caso == 3) {
			System.out.println("A continuacion la Lista de Hidruros Programados");
			String [] Oxacidos = new String [8];
			Oxacidos [0] = "[0] NaClO";
			Oxacidos [1] = "[1] Fe(Clo2)3";
			Oxacidos [2] = "[2] Mg(ClO3)2";
			Oxacidos [3] = "[3] KClO4";
			Oxacidos [4] = "[4] NaIO";
			Oxacidos [5] = "[5] Fe(IO2)2";
			Oxacidos [6] = "[6] Cu(IO3)2";
			Oxacidos [7] = "[7] LiIO4"; 
			for(int i = 0;i<8;i++) {
				System.out.println(Oxacidos[i]);
			}
			
			
			System.out.println("Por favor, escoja  el número de la lista que desea");
			Scanner Entrada = new Scanner(System.in);
			int Eleccion = Entrada.nextInt();
			if (Eleccion == 0) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");
				
				System.out.println("Es un HIPOCLORITO  DE SODIO");		
			}else if (Eleccion == 1) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un CLORITO FÉRRICO");
			}else if (Eleccion == 2) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un CLORATO DE MAGNESIO");
			}else if (Eleccion == 3) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un PERCLÓRATO DE POTASIO");
			}else if (Eleccion == 4) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un HIPOYODITO DE SODIO");
			}else if (Eleccion == 5) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un YODITO DE HIERRO");
			}else if (Eleccion == 6) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un YODATO DE COBRE ");
			}else if (Eleccion == 7) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un PERYODATO DE LITIO");
			}
		}
	}
	public static void main(String[] args) {
		
	}

}
