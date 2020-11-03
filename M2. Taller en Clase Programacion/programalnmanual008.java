package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual008 {
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
        float costo, d, cambio;
		
		System.out.println(":::::Devolucion de saldo:::::");
		System.out.println("Digite el valor del producto:");
		costo = entrada.nextFloat();
		System.out.println("Digite el valor a pagar:");
		d = entrada.nextFloat();
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		cambio = costo - d;
		System.out.println("El costo del articulo es:"+costo+"  .valor pagado:"+d+"  .Su saldo es de:"+cambio);
		
				
	}
}