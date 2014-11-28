import java.io.*;
import java.util.Scanner; 
public class ASumados{
	public static void main (String[] args){
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader (in);
	int numero1,numero2,resultado;
	
	try{
		System.out.println("Introduce un numero");
		numero1=Integer.parseInt(br.readLine());
		System.out.println("Introduce otro numero");
		numero2=Integer.parseInt(br.readLine());
		resultado=numero1+numero2;
		System.out.println("El resultado es: "+resultado);
		in.close();
		}catch (Exception e) {e.printStackTrace();}

	}//fin main
}//fin ejemplo lectura
