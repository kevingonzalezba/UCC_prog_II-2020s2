package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual021 {
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
		int fac1,fac2,fac3;
		double fact = 0;
		double und;
		int cod;
		System.out.println("digite el codigo del producto. 1.A, 2.B, 3.C :");
	     cod = entrada.nextInt();
		System.out.println("digite la cantidad de unidades");
		und=entrada.nextDouble();
		
		if(und<=500) {
			switch (cod) {
			case 1:fac1=500;
			fact = fac1 *1.07;
			System.out.println("el valor de la factura es de: "+fact);
			break;
			case 2:fac2=800;
			fact = fac2 *1.08;
			System.out.println("el valor de la factura es de: "+ fact);
			break;
			case 3:fac3=1000;
			fact = fac3 *1.05;
			System.out.println("el valor de la factura es de: "+ fact);
			break;
			
			default:
				System.out.println("el dato no corresponde ");
			}
		}
		else if(und>=501) {
			switch (cod) {
			case 1:fac1=1000;
			fact = fac1 *1.09;
			System.out.println("el valor de la factura es de: "+fact);
			break;
			case 2:fac2=1400;
			fact = fac2 *1.11;
			System.out.println("el valor de la factura es de: "+ fact);
			break;
			case 3:fac3=1600;
			fact = fac3 *1.10;
			System.out.println("el valor de la factura es de: "+ fact);
			break;
			
			default:
				System.out.println("el dato no corresponde ");
			}
		}
		System.out.println("el valor de la factura es de: "+ fact);
	}
}
		
