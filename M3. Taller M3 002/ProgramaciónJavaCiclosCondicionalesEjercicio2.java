package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaciónJavaCiclosCondicionalesEjercicio2 {
	public static void main(String[] args) {
		System.out.println("autor: Kevin Andres Gonzalez");
		System.out.println("fecha: 16/septiembre/2020");
		System.out.println("____*##########*");
		System.out.println("__*##############");
		System.out.println("__################");
		System.out.println("_##################_________*####*");
		System.out.println("__##################_____*##########");
		System.out.println("__##################___*#############");
		System.out.println("___#################*_###############*");
		System.out.println("____#################################*");
		System.out.println("______###############################");
		System.out.println("_______#############################");
		System.out.println("________=##########################");
		System.out.println("__________########################");
		System.out.println("___________*#####################");
		System.out.println("____________*##################");
		System.out.println("_____________*###############");
		System.out.println("_______________#############");
		System.out.println("________________##########");
		System.out.println("________________=#######*");
		System.out.println("_________________######");
		System.out.println("__________________####");
		System.out.println("__________________###");
		System.out.println("___________________#");
		System.out.println("programando en java Kevin Gonzalez");
		 
		Scanner miScanner = new Scanner(System.in);

	        int numero;

	        int resultado = 0;

	       

	        System.out.print("Introduce un número para sumar sus dígitos: ");

	        numero = miScanner.nextInt();

	       

	        while(numero > 0) {

	            resultado += numero % 10;

	            numero = numero / 10;

	        }

	        System.out.println("La suma es: " + resultado);
	}
}
