package co.edu.campusucc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramaciónJavaCiclosCondicionalesEjemplo2 {
	public static void main(String[] args) throws IOException {
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
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String letra;
		int termina = 0;
		while (1==1) {
			System.out.println(("teclee s o n y oprima enter para continuar"));
			letra = bufEntrada.readLine();
			if (letra.equals("s") || (letra.equals("S"))) {
				termina = 6;
			} else {
				if (letra.equals("n") || (letra.equals("N"))) {
					termina = 5;
				}
			}
		}
	}
}
			


