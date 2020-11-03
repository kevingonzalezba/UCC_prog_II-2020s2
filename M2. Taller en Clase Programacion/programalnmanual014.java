package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual014 {
	static Scanner entrada = new Scanner(System.in);
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
		System.out.println(":::::::Yomonto Moto::::::");
		System.out.println("Programa pa calcular salario");
		
		float mult,vhora,salar,salarf,hora,cod;
		String empleado;
		
		System.out.println("");
		System.out.println("Digite el nombre del empleado:");
		empleado = entrada.next();
		System.out.println("Digite el codigo de "+empleado+" :");
		cod=entrada.nextFloat();
		System.out.println("Digite las horas trabajadas de "+empleado+":");
		hora= entrada.nextFloat();
		
		System.out.println("Digite el valor equivalente a (1)Una hora laboral:");
		vhora= entrada.nextFloat();
		System.out.println("Digite el valor a pagar:");
		salar = entrada.nextFloat();
		
		if (hora >= 48) {
			
			mult =(hora * vhora)*20 /100;
			System.out.println("Salario con horas extras (20).");
		}
		
		else {
			mult=hora * vhora;
		}
		salarf= mult + salar;
		System.out.println("");
		System.out.println("El empleado: "+empleado+" con numero de codigo ("+cod+") trabajó "+hora+" hora-s");
		System.out.println("El salario final  a pagar es de:"+salarf);
}
}
