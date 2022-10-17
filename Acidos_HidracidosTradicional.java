package MetodoTradicional;

import java.util.Scanner;

public class Acidos_HidracidosTradicional {
	
public void AcidosHidracidos() {
	System.out.println(" -------------------------------------------------- ");
	System.out.println("Bienvenido, al Metodo Tradicional de Nomenclatura de los Acidos Hidracidos");
	System.out.println("¿Cual Caso para los Hidroxidos desea aplicar?");
	System.out.println("\n1: Caso 1 \n2: Caso 2");
	
	Scanner entrada = new Scanner (System.in);
	int Caso = entrada.nextInt();
	
	if(Caso == 1) {
		System.out.println("A continuacion la Lista de Hidruros Programados");
		String [] AcidosHidracidos = new String [3];
		AcidosHidracidos [0] = "[0] HCl";
		AcidosHidracidos [1] = "[1] H2S";
		AcidosHidracidos [2] = "[2] HF";
		for(int i = 0;i<3;i++) {
			System.out.println(AcidosHidracidos[i]);
		}
		
		System.out.println("Por favor, escoja  el número de la lista que desea");
		Scanner Entrada = new Scanner(System.in);
		int Eleccion = Entrada.nextInt();
		
		if(Eleccion == 0) {
			System.out.println("Es un Acido Clorhidrico"); 
		}else if (Eleccion == 1) {
			System.out.println("Es un Acido SulfHidrico");
		}else if (Eleccion == 2) {
			System.out.println("Es un Acido FluorHidrico");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
