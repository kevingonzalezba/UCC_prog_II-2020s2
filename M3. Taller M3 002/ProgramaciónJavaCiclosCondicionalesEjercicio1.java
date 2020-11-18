package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaciónJavaCiclosCondicionalesEjercicio1 {
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
		int numero, invertido = 0, resto;
		
		Scanner S = new Scanner(System.in);
		System.out.println("introduce numeros");
		
		numero = S.nextInt();
		
		while(numero > 0) {
			resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /=10;
		}
		System.out.println("Numero invertido: " + invertido);
	}

}
