import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo1{
public static void main(String[] args) {
	Runtime r=Runtime.getRuntime();
	String comando="";
	Process p;
	Scanner scanIn = new Scanner(System.in);
	System.out.println("Introduce el comando a ejecutar");
	comando = scanIn.nextLine();
	scanIn.close(); 

	try{
		p=r.exec(comando);
		} catch(Exception e) {
			System.out.println ("Error en "+comando);
			e.printStackTrace();
			}
	}

}//Ejemplo1