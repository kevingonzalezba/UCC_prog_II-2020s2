package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual019 {
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
			double factura = 0;
			double cargo = 0;
			int diagnostico = 0;
			String tipo;
			
			System.out.println("ingrese la marca del vehiculo");
			tipo = entrada.next();
			System.out.println("Ingrese el cargo su vehiculo  anteriormente ingresando");
			cargo = entrada.nextDouble();
			System.out.println ("ingrese el diagnostico quuiere realizar a su vehiculo");
			diagnostico = entrada.nextInt();
			
			switch(diagnostico) {
			
			case 1:
				factura = cargo + 3500;
				break;
			case 2:
				factura = cargo + 2800;
				break;
			case 3:
				factura = cargo + 1950;
				break;
			case 4:
				factura = cargo + 2750;
				break;	
			case 5:
				factura = cargo + 3000;
				break;
			case 6:
				factura = cargo + 1600;
				break;
				
				default:
					System.out.println ("El diagnostico seleccionado no esta disponible");
					break;
			}
			System.out.println ("El valor de la factura es: " + factura);
			System.out.println ("El tipo de vehiculo es: " + tipo);
			System.out.println ("El dignostico realizado al vehiculo fue: " + diagnostico);
}
}
