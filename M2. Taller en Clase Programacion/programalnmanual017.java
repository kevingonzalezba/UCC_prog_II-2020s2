package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual017 {
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
System.out.println(":::::::Problema de Embarcaciones:::::::");
		
		float hmill,milla,pdias,r,tr,hr;
		System.out.println(":::::::--: Tres embarcaciones::::::");
		System.out.println("");
		System.out.println(":::::Embarcacion #1:::::");
		System.out.println("Nota: la distancia que tendran que pasar las 3 embarcaciones es de unas 1200 millas.");
		System.out.println("");
		System.out.println("Digite el numero de milla-s de -->(ida) que recorre la embarcacion por hora-s : ");
		milla= entrada.nextFloat();
		System.out.println("Digite el numero de lillas de -->(Vuelta) o retorno que recorre la embarcacion por hora-s");
		r= entrada.nextFloat();
		hmill =1200 / milla;
		pdias =hmill *1 / 24; 
		hr= 1200 / r;
		tr= hr * 1 / 24;
		
		float hmillp,millap,pdiasp,rp,trp,hrp;
		System.out.println(":::::::--: Tres embarcaciones::::::");
		System.out.println("");
		System.out.println(":::::Embarcacion #2:::::");
		System.out.println("Nota: la distancia que tendran que pasar las 3 embarcaciones es de unas 1200 millas.");
		System.out.println("");
		System.out.println("Digite el numero de milla-s de -->(ida) que recorre la embarcacion por hora-s : ");
		millap= entrada.nextFloat();
		System.out.println("Digite el numero de lillas de -->(Vuelta) o retorno que recorre la embarcacion por hora-s");
		rp= entrada.nextFloat();
		hmillp =1200 / millap;
		pdiasp =hmillp *1 / 24; 
		hrp= 1200 / r;
		trp= hrp * 1 / 24;
		
		float hmills,millas,pdiass,rs,trs,hrs;
		System.out.println(":::::::--: Tres embarcaciones::::::");
		System.out.println("");
		System.out.println(":::::Embarcacion #3:::::");
		System.out.println("Nota: la distancia que tendran que pasar las 3 embarcaciones es de unas 1200 millas.");
		System.out.println("");
		System.out.println("Digite el numero de milla-s de -->(ida) que recorre la embarcacion por hora-s : ");
		millas= entrada.nextFloat();
		System.out.println("Digite el numero de lillas de -->(Vuelta) o retorno que recorre la embarcacion por hora-s");
		rs= entrada.nextFloat();
		hmills =1200 / millas;
		pdiass =hmills *1 / 24; 
		hrs= 1200 / rs;
		trs= hrs * 1 / 24;
		
		
		System.out.println("");
		System.out.println(":::::Embarcacion #1:::::");
		System.out.println("El numero de horas que se tarda en recorer 1200 millas");
		System.out.println("Que es la distancia entre Buenos Aires y Rio de Janeiro (Brazil) es de "+hmill+" hora-s.");
		System.out.println("Se demoró "+pdias+" dia-s para recorrer 1200 millas de (Buenos Aires a Rio de Janeiro).");
		System.out.println("Se demora "+tr+" dia-s para recorrer 1200 millas de (Rio de Janeiro a Buenos Aires)");
		System.out.println("");
		System.out.println(":::::Embarcacion #2:::::");
		System.out.println("El numero de horas que se tarda en recorer 1200 millas");
		System.out.println("Que es la distancia entre Buenos Aires y Rio de Janeiro (Brazil) es de "+hmillp+" hora-s.");
		System.out.println("Se demoró "+pdiasp+" dia-s para recorrer 1200 millas de (Buenos Aires a Rio de Janeiro).");
		System.out.println("Se demora "+trp+" dia-s para recorrer 1200 millas de (Rio de Janeiro a Buenos Aires)");
		System.out.println("");
		System.out.println(":::::Embarcacion #3:::::");
		System.out.println("El numero de horas que se tarda en recorer 1200 millas");
		System.out.println("Que es la distancia entre Buenos Aires y Rio de Janeiro (Brazil) es de "+hmills+" hora-s.");
		System.out.println("Se demoró "+pdiass+" dia-s para recorrer 1200 millas de (Buenos Aires a Rio de Janeiro).");
		System.out.println("Se demora "+trs+" dia-s para recorrer 1200 millas de (Rio de Janeiro a Buenos Aires)");
	}
}
