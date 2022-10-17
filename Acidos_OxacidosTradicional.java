package MetodoTradicional; //Nombre de nuestro paquete donde guardamos nuestra clase 

import java.util.Scanner; //Importamos  las librerias  de Java util especificamente de la clase Scanner 

public class Acidos_OxacidosTradicional { //Aca empieza nuestra clase con la llave de apertura { 
public void Acidos_Oxacidos() { //Aca empieza nuestro metodo Acidos_Oxacidos que usaremos al instanciar la clase 
	System.out.println(" -------------------------------------------------- "); // Separador para mayor atractivo Visual
	System.out.println("Bienvenido, al Metodo Tradicional de Nomenclatura de los Acidos Oxacidos"); //Mensaje de Bienvenida
	System.out.println("¿Cual Caso para los Hidroxidos desea aplicar?"); //Le preguntamos que caso desea aplicar
	System.out.println("\n1: Caso 1 \n2: Caso 2 \n3: Caso 3"); //Le mostramos los casos disponibles 
	
	Scanner entrada = new Scanner (System.in); //Instanciamos la clase Scanner y creamos el objeto Entrada  para que nos ingrese un dato por teclado
	int Caso = entrada.nextInt(); //Pedimos que ese dato ingresado nos lo guarde en la variable Caso de tipo ENTERO
	
	if(Caso == 1) { //Evaluamos con un condicional si el caso que nos ingreso por teclado es 1 
		System.out.println("A continuacion la Lista de Hidruros Programados"); //Le enseñamos nuestra lista de elementos Programados 
		String [] Oxacidos = new String [6]; //Creamos 6 Espacios en Memoria dentro de nuetro Arreglo 
		Oxacidos [0] = "[0] H2CO2";
		Oxacidos [1] = "[1] H2CO3";
		Oxacidos [2] = "[2] H2SeO2";
		Oxacidos [3] = "[3] H3PO3";
		Oxacidos [4] = "[4] H3PO4";
		Oxacidos [5] = "[5] H2SeO4";
		
		for(int i = 0;i<6;i++) { //Recorremos nuestro arreglo y que nos imprima posicion por posicion que cambiara con la variable i dentro del bucle for 
			System.out.println(Oxacidos[i]);
		}
		
		System.out.println("Por favor, escoja  el número de la lista que desea"); //Aca le indicamos que escoja  el numero de nuestra lista de arreglos
		Scanner Entrada = new Scanner(System.in); //Creamos un objeto de Entrada
		int Eleccion = Entrada.nextInt(); //Le pedimos que lo que nos ingreso por teclado nos lo guarde  en la variable de tipo ENTERO ELECCION 
		if (Eleccion == 0) { //Evaluamos con un condicional si lo que nos ingreso  por teclado fue el compuesto de la lista 0
			System.out.println("La nomenclatura del Elemento Seleccionado es:");
			//Si esta condicion es Verdadera
			System.out.println("Es un Acido Carbonoso"); //Imprimes en consola indicandole que es un acido carbonoso 
		}else if (Eleccion == 1) { //Si selecciono el 1
			//Es verdadera la condicion
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Carbonico"); //Es un Acido carbonico
		}else if (Eleccion == 2) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Selenico");
		}else if (Eleccion == 3) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Fosforoso");
		}else if (Eleccion == 4) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Fosforico");
		}else if (Eleccion == 5) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Selenico");
		}
	}else if (Caso == 2) { //En caso que el usuario haya seleccionado el Caso 2 en vez del uno
		System.out.println("A continuacion la Lista de Hidruros Programados");
		String [] Oxacidos = new String [6]; //Arreglo de una dimension con 6 espacios en Memoria
		Oxacidos [0] = "[0] H2SO2";
		Oxacidos [1] = "[1] H2SO3";
		Oxacidos [2] = "[2] H2SO4";
		Oxacidos [3] = "[3] H2TeO2";
		Oxacidos [4] = "[4] H2TeO3";
		Oxacidos [5] = "[5] H2TeO4";
		for(int i = 0;i<6;i++) { //Recorremos el Arreglo con un bucle for
			System.out.println(Oxacidos[i]);
		}
		
		
		System.out.println("Por favor, escoja  el número de la lista que desea"); //Le pedimos que nos ingrese el numero de la lista de compuestos
		//Al cual desea conocer su nomenclatura
		Scanner Entrada = new Scanner(System.in);
		int Eleccion = Entrada.nextInt();
		if (Eleccion == 0) { //El compuesto seleccionado de la lista esta en la posicion 0 del arreglo
			//La condicion es Verdadera
			System.out.println("La nomenclatura del Elemento Seleccionado es:");
			
			System.out.println("Es un Acido HipoSulfuroso"); //Entonces le imprimes un mensaje por consola indicandole que su compuesto es un 
			//Acido Hiposulfuroso
		}else if (Eleccion == 1) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Acido Sulfuroso");
		}else if (Eleccion == 2) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Sulfurico");
		}else if (Eleccion == 3) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido HipoTeluroso");
		}else if (Eleccion == 4) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Teluroso");
		}else if (Eleccion == 5) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Telurico");
		}
	}else if (Caso == 3) { //Se hace lo mismo que en el anterior si el usuario en vez de escoger el caso 1 y 2 escoge el Caso 3
		System.out.println("A continuacion la Lista de Hidruros Programados"); //Lista el elementos programados
		String [] Oxacidos = new String [8]; //Arreglo de 8 Espacios en memoria de una dimension
		Oxacidos [0] = "[0] HClO";
		Oxacidos [1] = "[1] HClO2";
		Oxacidos [2] = "[2] HClO3";
		Oxacidos [3] = "[3] HClO4";
		Oxacidos [4] = "[4] HIO";
		Oxacidos [5] = "[5] HIO2";
		Oxacidos [6] = "[6] HIO3";
		Oxacidos [7] = "[7] HIO4"; 
		for(int i = 0;i<8;i++) { //Recorremos el arreglo
			System.out.println(Oxacidos[i]);
		}
		
		
		System.out.println("Por favor, escoja  el número de la lista que desea");
		Scanner Entrada = new Scanner(System.in); //Pedimos que nos ingese el numero de la lista que desea
		int Eleccion = Entrada.nextInt();
		if (Eleccion == 0) { //Aca procedemos a evaluar si lo que nos ingreso de la lista de compuestos es el que esta en la posicion 0
			System.out.println("La nomenclatura del Elemento Seleccionado es:");
			
			System.out.println("Es un Acido HIPOCLOROSO");		 //Aca le dice la nomenclatura del compuesto que esta en la posicion 0 del arreglo
		}else if (Eleccion == 1) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido  CLOROSO");
		}else if (Eleccion == 2) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido CLORICO");
		}else if (Eleccion == 3) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido PERCLORICO");
		}else if (Eleccion == 4) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Hipoyodoso");
		}else if (Eleccion == 5) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Yodoso");
		}else if (Eleccion == 6) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Yodico");
		}else if (Eleccion == 7) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Peryodico");
		}
	}
}
	
	
	public static void main(String [] args) {
		
	}
}
