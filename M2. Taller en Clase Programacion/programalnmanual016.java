package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual016 {
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
		System.out.println("::::Calvin y Hobbes:::::");
		System.out.println("");
		double unid1,unid2,unid3;
		String emp1;
		String emp2;
		
		System.out.println("Programa para calcular las unidades que produjo dos empleados.");
		System.out.println("La diferencia de un empleado y otro es de 2/3.");
		System.out.println("");
		System.out.println("Digite el nombre del empleado #1:");
		emp1:entrada.next();
		System.out.println("Digite la cantida que produjo el empleado  :");
		unid1 =entrada.nextDouble();
		System.out.println("");
		System.out.println("Digite el nombre del empleado #2:");
		emp2= entrada.next();
		System.out.println("Digite la cantida que produjo el empleado  :");
		unid2 =entrada.nextDouble();
		
		unid3 =unid1 + unid2;
		unid1 =unid2 - 2/3;
		unid2 =unid2 + unid1;
		
		System.out.println("La cantida de unidades de los dos empleados es de:"+unid3);
		System.out.println("La cantida que produjo el empleado #1 es de:"+unid1);
		System.out.println("La cantida que produjo el empleado #2 es de:"+unid2);
	}
}
