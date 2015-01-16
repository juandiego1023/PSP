import java.io.* ;
import java.net.* ;
import java.util.Scanner;
//Servidor espera conexiones a las que atenderá con un segundo socket
//Servidor saludará con frase "Hola cliente"
class Servidor {

//puerto espera conexiones
static final int PUERTO=5000;
String entradaTeclado = "";

	public Servidor( ) {

		try {
			//crea socket y espera
			ServerSocket skServidor = new ServerSocket( PUERTO );
			//Defino el objeto escaner
		    Scanner entradaEscaner = new Scanner (System.in);
			System.out.println("Esperando conexión... " );
			System.out.println("Conectado" );
			System.out.println("Empiezas a hablar tu" );
			

			for (int numCli=0;numCli<2;numCli++){
				//Primitiva accept() crea nuevo socket skCliente
				//skCliente atiene al cliente
				Socket skCliente = skServidor.accept(); // Crea objeto

				//System.out.println("Sirvo al cliente " );
				//asocio flujo salida de datos al socket
				InputStream aux2 = skCliente.getInputStream();
				OutputStream aux = skCliente.getOutputStream();
				
				//asocio flujo de datos flujo de tipo DataOutputStream 
				DataOutputStream flujo= new DataOutputStream( aux );
				DataInputStream flujo2 = new DataInputStream( aux2 );
				
				do{
				//escribo
				entradaTeclado = entradaEscaner.nextLine ();
				flujo.writeUTF( entradaTeclado );
				System.out.println( flujo2.readUTF() );

				}while(entradaTeclado!="a");
				//cierro conexión
				skCliente.close();
			}//fin for
			System.out.println("Cerrando conexión");

		} catch( Exception e ) {

	System.out.println( e.getMessage() );

	}

}

public static void main( String[] arg ) {

new Servidor();

}

}


