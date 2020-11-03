package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual007 {
	public static void main(String[] args) {
		System.out.println("autor: Kevin Andres Gonzalez");
		System.out.println("fecha: 31/OCTUBRE/2020");
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
		System.out.println("mi primer programa en java Kevin Gonzalez");
		System.out.println("autor: Kevin Andres Gonzalez");
		 int num;
		 int num1;
		 int num2 ;
	     int porcentaje;
	     int porcentaje1;	        
	     int porcentaje2;
	     
	     double rpta;
	                
	        Scanner scanner = new Scanner(System.in);        
	        System.out.print("Ingrese primera nota: ");   
	        num = scanner.nextInt();
	        System.out.print("Ingrese el porcentaje(%): ");   
	        porcentaje = scanner.nextInt();
	        System.out.print("Ingrese segunda nota: ");   
	        num1 = scanner.nextInt();
	        System.out.print("Ingrese el porcentaje(%): ");   
	        porcentaje1 = scanner.nextInt();
	        System.out.print("Ingrese tercera nota: ");   
	        num2 = scanner.nextInt();
	        System.out.print("Ingrese el porcentaje(%): ");   
	        porcentaje2 = scanner.nextInt();
	        
	        rpta = num*porcentaje /100.0+ num1*porcentaje1 /100.0 + num2*porcentaje2 /100.0;
	        System.out.println("la nota definitiva  "+ 
	                 " es " + rpta); 
	}
}
