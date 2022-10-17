package MetodoTradicional; //Nombre del paquete donde esta ubicada nuestra clase

import java.util.Scanner; //Impotamos las librerias de Java util  especificamente la clase Scanner

public class Acidos_HidracidosTradicional {
	
public void AcidosHidracidos() { //Metodo que al ser instanciado por un objeto de la clase Acidos_HidracidosTradicional ejecutara las siguientes lineas de codigo:
	System.out.println(" -------------------------------------------------- "); //Acá ponemos un mensaje en consola que sirva como separador para que se vea más
	//Atractivo visualmente
	System.out.println("Bienvenido, al Metodo Tradicional de Nomenclatura de los Acidos Hidracidos"); //Imprimimos un mensaje en consola
	System.out.println("¿Cual Caso para los Hidroxidos desea aplicar?"); //Le preguntamos al usuario qué caso desea aplicar pues recordemos que en la guia
	//Nos aparecen diferentes casos que varian del estado de oxidacion del elemento  y por lo tanto su nomenclatura puede variar dependiendo si es uno u otro
	System.out.println("\n1: Caso 1 \n2: Caso 2");
	
	Scanner entrada = new Scanner (System.in); //Creamos el objeto entrada de la clase Scanner el cual nos permite que el usuario escriba por teclado
	int Caso = entrada.nextInt(); //Lo que escribe el usuario dependiendo si es el caso  1 o 2 quiero que nos guarde en la variable caso dicho valor
	
	if(Caso == 1) { //Luego con un if evaluamos la condicion si el usuario por teclado nos ingreso el  caso 1 
		System.out.println("A continuacion la Lista de Hidruros Programados"); //Le indicamos que a continuacion se le presentara una lista con los compuestos
		//Programados,  para que escoja con cual compuesto desea que se le muestre su respectiva nomenclatura teniendo en cuenta que estamos dentro del Caso 1
		
		String [] AcidosHidracidos = new String [3]; //En esta Linea creamos un ARREGLO o ARRAY de una DIMENSION, un arreglo nos permite almacenar muchos 
		//Datos de un mismo tipo en este caso estamos almacenando 3 Strings dentro del Arreglo AcidosHidracidos sabemos que es de una unica dimension puesto
		//Que en la declaracion del arreglo despues del  = new Encontramos el tipo de dato que tendra nuestro arregloseguido de un unico corchete y la cantidad de
		//espacio en memoria que queremos que nos cree que en este caso son 3 un array de dos dimensiones tiene la siguiente sintaxis [][] de 3 [][][] y así 
		AcidosHidracidos [0] = "[0] HCl";
		AcidosHidracidos [1] = "[1] H2S";
		AcidosHidracidos [2] = "[2] HF";
		for(int i = 0;i<3;i++) { //En este bucle for reccoremos el Arreglo declaramos una variable i que sera igual a 0 despues del Punto y coma establecemos
			//la condicion MIENTRAS  que i sea menor que 3, Punto y coma ; Quiero que me incrementes el valor de  i en 1 cuando i sea igual a 3 dejara de repetirse
			//ya que dejara de cumplirse la condicion ¿Y por  qué le decimos que 3?, pues porque nuestro Arreglo tiene 3 Espacios en memoria el cual
			//queremos que nos recorra
			System.out.println(AcidosHidracidos[i]); //A continuacion le pedimos que con un print nos imprima en consola lo que hay almacenado en el arreglo
			//AcidosHidracidos POSICION que le indicamos en números pero que se la indicamos con el valor i cuando el bucle for entra por primera vez
			//i Vale 0 porque estamos en la primera vuelta del bucle entonces imprimira  "[0] HCl]" ya que  AcidosHidracidos[i] e i vale 0 por lo que se
			//Posicionara  en la posicion 0, Luego en la siguiente vuelta del bucle i aumentara su valor a 1 por lo que ahora imprimira "H2S" y asi hasta 
			//Llegar al ultimo por lo que en consola le aparecera la lista al usuario
		}
		
		System.out.println("Por favor, escoja  el número de la lista que desea"); //Aca le indicamos que escoja el numero de la lista que desea por esta razon
		//Cuando le asignamos un valor a nuestra lista de Arreglos le ponemos "[2] Que seria la posicion + "HF que seria nuestro compuesto " de esta forma le indicamos
		//Que en la posicion 2 esta el compuesto HF y por lo tanto si desea escojerlo ingrese el Numero 2 
		Scanner Entrada = new Scanner(System.in); //Creamos un objeto de entrada
		int Eleccion = Entrada.nextInt(); //Que lo que nos paso por este objeto entrada por teclado lo almacene en la variable Eleccion de tipo ENTERO ya que
		//Guardaremos un Numero 
		
		if(Eleccion == 0) { //En este caso si en la LISTA que le mostramos al usuario escogio el 0 pues entonce ses un Acido Clorhidrico 
			System.out.println("Es un Acido Clorhidrico");  //Aca lo imprimimos en consola 
		}else if (Eleccion == 1) { //En este caso si en la LISTA que le mostramos al usuario escogio el 1 pues entonce ses un Acido SulfHidrico
			System.out.println("Es un Acido SulfHidrico"); // Acá lo imprimimos  en consola
		}else if (Eleccion == 2) {  //En este caso si en la LISTA que le mostramos al usuario escogio el 2 pues entonce ses un Acido FluorHidrico
			System.out.println("Es un Acido FluorHidrico"); //Aca lo imprimimos en consola
		}
	}
}
	public static void main(String[] args) { //NO TOMAR EN CUENTA ESTA LINEA DE CODIGO 
		// TODO Auto-generated method stub

	}

}
