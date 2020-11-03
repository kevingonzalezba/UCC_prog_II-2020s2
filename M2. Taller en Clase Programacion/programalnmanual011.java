package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual011 {
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
		System.out.println(":::::::Empresa Paginin :::::::");
		float pag,min,hora;
		float ppag,ppagm,ppagh;
		
		
		
		System.out.println(":::::::--: la empresa PAGININ realiza 15 paginas en 30 minutos::::::");
		System.out.println("");
		System.out.println("Digite el numero de hora-s --> para calcular las paginas por hora: ");
		hora= entrada.nextFloat();
		System.out.println("Digite en (minutos)--> para calcular el numero de paginas:");
		min = entrada.nextFloat();
		System.out.println("Digite las paginas a calcular por minutos: ");
		pag = entrada.nextFloat();
		
		ppagh =hora *30;
		ppagm =min / 2 ; 
		ppag = pag * 2;
		System.out.println("El numero de paginas por "+hora+" hora-s es de:"+ppagh);
		System.out.println("El numero de paginas en "+min+" minuto-s es de :"+ppagm);
		System.out.println("se tomará "+ppag+" minuto-s para hacer "+pag+" pagina-s");
}
}