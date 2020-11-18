package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaciónJavaCiclosCondicionalesEjercicio5 {
	public static void main(String[] args) {
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
		int n, max;
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese el numero de elementos para la matriz:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Ingrese los digitos para determinar cual es el mayor:");
		for(int i = 0; i < n; i++)
		{
		a[i] = s.nextInt();
		}
		max = a[0];
		for(int i = 0; i < n; i++)
		{
		if(max < a[i])
		{
		max = a[i];
		}
		}
		System.out.println("El mayor de los digitos es:"+max);
	}
}
