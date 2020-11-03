package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual004 {
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
        int rest1, rest2 = 1;
		
		boolean l1 = false, l2 =  false, k;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("¿la tierra es un satelite? [0]... falso [1]...verdad");
			rest1 = leer.nextInt();
				System.out.println("\"¿azul es una obra literaria de ruben dario? [0]... falso [1]...verdad ");
				rest2 = leer.nextInt();
		}
		
		if (rest1!= 0) l1=true;
		if (rest2!= 0) l2=true;
		
		k= l1 && l2;
		System.out.println("el valor final de k es:" +k);
	}
}
