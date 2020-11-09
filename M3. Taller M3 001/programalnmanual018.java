package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual018 {
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
			
			String nom;
			double sueldo = 0;
			int cate;
				System.out.println("Digite el nombre del empleado");
				nom=entrada.next();
				
				System.out.println("Digite la categoria por favor");
				cate = entrada.nextInt();
				
				System.out.println("Escriba su sueldo favor");
				sueldo = entrada.nextDouble();
			
			
			
			switch (cate) {
			case 1: sueldo= sueldo*1.15;
			break;
			case 2: sueldo= sueldo*1.10;
			break;
			case 3: sueldo= sueldo*1.08;
			break;
			case 4: sueldo= sueldo*1.07;
			break;
			default:
				sueldo=0;
				System.out.println("la categoria no existe");
			}
			System.out.println("el sueldo a pagar a" + sueldo);
		}
	}


