package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual020 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("autor: Kevin Andres Gonzalez");
		System.out.println("fecha: 8/septiembre/2020");
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
		
		int ruta;
		double utilidad = 0;
		int servicio = 0;
		
		System.out.println("ingrese la ruta del 1-4 porfavor");
		ruta = entrada.nextInt();
		System.out.println("Ingrese el valor del servicio porvafor");
		servicio = entrada.nextInt();
		
		switch (ruta) {
		
		case 1:
			utilidad = (servicio - 1.30) - 1.10;
			break;
		case 2:
			utilidad = (servicio - 1.25) - 1.15;
			break;
		case 3:
			utilidad = (servicio - 1.20) - 1.20;
			break;
		case 4:
			utilidad = (servicio - 1.22) - 1.20;
			break;	
		default:
			System.out.println("la ruta que ingreso no existe ");
			break;
		}
		System.out.println("la utlidad  es: " +utilidad);
		
		
}
}