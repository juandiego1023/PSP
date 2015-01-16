import java.io.* ;
import java.net.* ;
import java.util.Scanner;
//Servidor espera conexiones a las que atenderá con un segundo socket
//Servidor saludará con frase "Hola cliente"
class Servidor {

//puerto espera conexiones
static final int PUERTO=5000;
String entradaTeclado = "";

public int lat1 = 4;//100Euros
public int lat2 = 4;//100Euros
public int vip1 = 3;//250Euros
public int vip2 = 3;//250Euros
public int gal = 8;//150Euros
public int cen = 54;//80Euros

	public Servidor( ) {
	

		try {
			//crea socket y espera
			ServerSocket skServidor = new ServerSocket( PUERTO );
			//Defino el objeto escaner
		    Scanner entradaEscaner = new Scanner (System.in);
			

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
					
			    flujo.writeUTF("Asientos disponibles: " );
			    flujo.writeUTF("lat1: "+lat1 );
			    flujo.writeUTF("lat2: "+lat2 );
			    flujo.writeUTF("vip1: "+vip1 );
			    flujo.writeUTF("vip2: "+vip2 );
			    flujo.writeUTF("gal: "+gal );
			    flujo.writeUTF("cen: "+cen );
				
			    flujo.writeUTF("Escoge tu localidad");
				String localidad=( flujo2.readUTF() );
				flujo.writeUTF("Cuantos asientos?");
				String numeroAsientos=( flujo2.readUTF() );

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



