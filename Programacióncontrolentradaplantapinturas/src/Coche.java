import java.util.Random; 


public class Coche extends Thread{
	
	private Estacion estacion;
	private int matricula;

	public Coche (Estacion esta, int numeroMatricula){
		estacion=esta;
		matricula=numeroMatricula;
	}
	
	
	public void run(){


				estacion.entrar(matricula); //ingresa
				System.out.println("Entra: "+matricula);
	 			try {
					sleep(6000);
				}catch (InterruptedException e){}
	 			
	 			estacion.salir(matricula); //
				System.out.println("Sale : "+matricula);
	 			try {
					sleep(100);
				}catch (InterruptedException e){}
	 			
	 			
	 			int capacidad=estacion.leer();
	 			System.out.println("Capacidad: "+capacidad);
			
		}
	
	
}
