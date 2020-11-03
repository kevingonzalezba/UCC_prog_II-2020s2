package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual012 {
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
		System.out.println(":::::::Pollos Criski::::::");
		System.out.println("Programa pa calcular salario");
		
		float horasx,mult,vhora,salar,mult1,seg,salarf;
		String empleado;
		
		System.out.println("");
		System.out.println("Digite el nombre del empleado:");
		empleado = entrada.next();
		System.out.println("Digite las horas extras trabajadas de "+empleado+":");
		horasx= entrada.nextFloat();
		System.out.println("Digite el valor equivalente a (1)Una hora extra:");
		vhora= entrada.nextFloat();
		System.out.println("Digite el valor a pagar:");
		salar = entrada.nextFloat();
		
		mult =(horasx * vhora)*50 /100;
		mult1= mult + salar;
		seg=(salar*12)/100;
		salarf=seg - salar;
		System.out.println("");
		System.out.println("El salario a pagar es de:"+salarf);
}
}