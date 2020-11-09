package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual022 {
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
		
		double economia = 0; ;
		double administracion = 0; 
		double ciencia = 0;
		int ruta;
		
		String empleado;
		
		System.out.println("Digite su nombre:");
		empleado = entrada.next();
		System.out.println("ingrese numero si es economia economia y esta en el semestre 1-3 presione(1)");
		System.out.println("ingrese numero si es economia economia y esta en el semestre 4-7 presione(2);");
		System.out.println("ingrese numero si es economia economia y esta en el semestre 8-10 presione(3);");
		System.out.println("ingrese numero si es administracion y esta en el semestre 1-3 presione(4);");
		System.out.println("ingrese numero si es administracion y esta en el semestre 4-7 presione(5);");
		System.out.println("ingrese numero si es administracion y esta en el semestre 8-10 presione(6);");
		System.out.println("ingrese numero si es ciencia y esta en el semestre 1-3 presione(7);");
		System.out.println("ingrese numero si es ciencia y esta en el semestre 4-7 presione(8);");
		System.out.println("ingrese numero si es ciencia y esta en el semestre 8-10 presione(9);");
		ruta = entrada.nextInt();
		
		
		switch (ruta) {
	case 1:
		economia = (economia + 1500);
		System.out.println("el valor de la factura es de: "+economia);
		break;
	case 2:	
		economia = (economia + 2220);
		System.out.println("el valor de la factura es de: "+economia);
		break;
	case 3:
		economia = (economia + 1800);
		System.out.println("el valor de la factura es de: "+economia);
		break;
	case 4:
		administracion =(administracion + 2000);
		System.out.println("el valor de la factura es de: "+administracion);
		break;
	case 5:	
	    administracion = (administracion + 4000);
	    System.out.println("el valor de la factura es de: "+administracion);
	    break;
	case 6:
		administracion = (administracion + 5000);
		System.out.println("el valor de la factura es de: "+administracion);
		break;
	case 7:
		ciencia = (ciencia + 1800);
		System.out.println("el valor de la factura es de: "+ciencia);
		break;
	case 8:
		 ciencia = (ciencia + 5000);
		    System.out.println("el valor de la factura es de: "+ciencia);
			break;
	case 9:
		ciencia = (ciencia + 7000);
		System.out.println("el valor de la factura es de: "+ciencia);
		break;
	default:
		System.out.println("el numero de la carrera no existe ");
		break;
	}
		
	
}
}

