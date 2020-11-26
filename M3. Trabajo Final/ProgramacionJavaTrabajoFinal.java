package co.edu.campusucc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProgramacionJavaTrabajoFinal2 {
	public static void main(String[] args) {
		System.out.println("autor: Kevin Andres Gonzalez");
		System.out.println("fecha: 26/septiembre/2020");
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
		
		System.out.println("Digite 1 para el programa ProgramacionJavaCiclosCondicionalesEjercicio1");
		System.out.println("programando en java Kevin Gonzalez");
		System.out.println("programando en java Kevin Gonzalez");
		System.out.println("Digite 1 para el programa ProgramacionJavaCiclosCondicionalesEjercicio1");
		System.out.println("Digite 2 para el programa ProgramacionJavaCiclosCondicionalesEjercicio2");
		System.out.println("Digite 3 para el programa ProgramacionJavaCiclosCondicionalesEjercicio3");
		System.out.println("Digite 4 para el programa ProgramacionJavaCiclosCondicionalesEjercicio4");
		System.out.println("Digite 5 para el programa ProgramacionJavaCiclosCondicionalesEjercicio5");
		System.out.println("Digite 6 para el programa ProgramacionJavaCiclosCondicionalesEjercicio6");
		System.out.println("Digite 7 para el programa ProgramacionJavaCiclosCondicionalesEjemplo1");
		System.out.println("Digite 8 para el programa ProgramacionJavaCiclosCondicionalesEjemplo2");
		System.out.println("Digite 9 para el programa programalnmanual009");
		System.out.println("Digite 10 para el programa programalnmanual010");
		System.out.println("Digite 11 para el programa programalnmanual011");
		System.out.println("Digite 12 para el programa programalnmanual012");
		System.out.println("Digite 13 para el programa programalnmanual013");
		System.out.println("Digite 14 para el programa programalnmanual014");
		System.out.println("Digite 15 para el programa programalnmanual015");
		System.out.println("Digite 16 para el programa programalnmanual016");
		System.out.println("Digite 17 para el programa programalnmanual017");
		System.out.println("Digite 18 para el programa programalnmanual018");
		System.out.println("Digite 19 para el programa programalnmanual019");
		System.out.println("Digite 20 para el programa programalnmanual020");
		Scanner scan= new Scanner(System.in);
		int opcionPrograma;
		String comando = "";
			System.out.println("dijite el numero del programa para ejecutar");
			opcionPrograma = scan.nextInt();
			
			System.out.println("el numero digitado es:" + opcionPrograma);
		
		
		Process theProcess = null;
	      BufferedReader inStream = null;
	  
				
		
				switch(opcionPrograma) {
				case 1:
					comando = "java co.edu.campusucc.ProgramacionJavaCiclosCondicionalesEjercicio1";
					break;
				case 2:
					comando = "java co.edu.campusucc.ProgramacionJavaCiclosCondicionalesEjercicio2";
					break;
				case 3:
					comando = "java co.edu.campusucc.ProgramacionJavaCiclosCondicionalesEjercicio3";
					break;
				case 4:
					comando = "java co.edu.campusucc.ProgramacionJavaCiclosCondicionalesEjercicio4";
					break;
				case 5:
					comando = "java co.edu.campusucc.ProgramacionJavaCiclosCondicionalesEjercicio5";
					break;
				case 6:
					comando = "java co.edu.campusucc.ProgramacionJavaCiclosCondicionalesEjercicio6";
					break;
				case 7:
					comando = "java co.edu.campusucc.ProgramacionJavaCiclosCondicionalesEjemplo1";
					break;
				case 8:
					comando = "java co.edu.campusucc.ProgramacionJavaCiclosCondicionalesEjemplo2";
					break;
				case 9:
					comando = "java co.edu.campusucc.programalnmanual009";
					break;
				case 10:
					comando = "java co.edu.campusucc.programalnmanual010";
					break;
				case 11:
					comando = "java co.edu.campusucc.programalnmanual011";
					break;
				case 12:
					comando = "java co.edu.campusucc.programalnmanual012";
					break;
				case 13:
					comando = "java co.edu.campusucc.programalnmanual013";
					break;
				case 14:
					comando = "java co.edu.campusucc.programalnmanual014";
					break;
				case 15:
					comando = "java co.edu.campusucc.programalnmanual015";
					break;
				case 16:
					comando = "java co.edu.campusucc.programalnmanual016";
					break;
				case 17:
					comando = "java co.edu.campusucc.programalnmanual017";
					break;
				case 18:
					comando = "java co.edu.campusucc.programalnmanual018";
					break;
				case 19:
					comando = "java co.edu.campusucc.programalnmanual019";
					break;
				case 20:
					comando = "java co.edu.campusucc.programalnmanual020";
					break;
				default:
						break;
	      }
	     
	      try
	      {
	          theProcess = Runtime.getRuntime().exec("java ProgramacionJavaCiclosCondicionalesEjercicio1");
	          inStream = new BufferedReader(new InputStreamReader( theProcess.getInputStream()));
				System.out.print(inStream.readLine());	
	      }
	      catch(IOException e)
	      {
	         System.err.println("Error on exec() method");
	         e.printStackTrace();  
	      }
	        
	     
	      try
	      {
	         inStream = new BufferedReader(
	                                new InputStreamReader( theProcess.getInputStream() ));  
	         System.out.println(inStream.readLine());
	      }
	      catch(IOException e)
	      {
	         System.err.println("Error on inStream.readLine()");
	         e.printStackTrace();  
	      }
	   } 
	} 

