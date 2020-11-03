package co.edu.campusucc;

import java.util.Scanner;

public class programalnmanual006 {
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
		
		Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese dos números: ");

        
        double primero = reader.nextDouble();
        double segundo = reader.nextDouble();
        
        System.out.print("Introduzca una operadora para iniciar el programa (+, -, *, /): ");
        
        char operator = reader.next().charAt(0);

        double resultado;

        switch(operator)
        {
            case '+':
                resultado = primero + segundo;
                break;

            case '-':
                resultado = primero - segundo;
                break;

            case '*':
                resultado = primero * segundo;
                break;

            case '/':
                resultado = primero / segundo;
                break;

            default:
                System.out.printf("¡Error! el operador no es correcto");
                return;
        }

        
		        
        System.out.println("la suma de 2 números es: " + 
     		   (primero + segundo) );
        System.out.println("la resta de 2 números es: " + 
      		   (primero - segundo) );
        System.out.println("la multiplicacion de 2 números es: " + 
       		   (primero * segundo) );
        System.out.println("El promedio de 2 números es: " +         		
       		   (primero + segundo) / 2 );
	}
}
