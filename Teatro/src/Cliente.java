
import java.io.*;
import java.net.*;
import java.util.Scanner;

class Cliente {
	//nombre  máquina y puerto
	static final String HOST = "localhost";
	static final int PUERTO=5000;
	String entradaTeclado = "";
	
	public Cliente( ) {
		try{
			//se crea el socket
			Socket skCliente = new Socket(HOST, PUERTO);
			
			//recojo flujo de datos del socket
			InputStream aux = skCliente.getInputStream();
			OutputStream aux2 = skCliente.getOutputStream();
			//asocio flujo de datos flujo de tipo DataInputStream		
			DataInputStream flujo = new DataInputStream( aux );
			DataOutputStream flujo2= new DataOutputStream( aux2 );
			//Defino el objeto escaner
		    Scanner entradaEscaner = new Scanner (System.in);
		    
			
			do{
			//Capturamos cadena del flujo con readUTF y muestro
			System.out.println( flujo.readUTF() );
			System.out.println( flujo.readUTF() );
			System.out.println( flujo.readUTF() );
			System.out.println( flujo.readUTF() );
			System.out.println( flujo.readUTF() );
			System.out.println( flujo.readUTF() );
			System.out.println( flujo.readUTF() );
			
			entradaTeclado = entradaEscaner.nextLine ();
			flujo2.writeUTF( entradaTeclado);

			}while(!entradaTeclado.equals("a"));
			
			//Cierro el socket
			skCliente.close();
			
		}catch(Exception e) {
		System.out.println( e.getMessage() );
	}
	}
public static void main(String[] arg) {
new Cliente();
}
}
