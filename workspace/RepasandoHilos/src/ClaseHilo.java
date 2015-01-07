
public class ClaseHilo{

	public static void main(String args[]){
		
		RepasandoHilos rp = new RepasandoHilos(0, 10);
		RepasandoHilos rp2 = new RepasandoHilos(100, 10);
		RepasandoHilos rp3 = new RepasandoHilos(200, 10);
		
		rp.start();
		rp2.start();
		rp3.start();
		
		while(true){
			System.out.println("Hilo1");
			rp.Pintar();
			System.out.println("Hilo2");
			rp2.Pintar();
			System.out.println("Hilo3");
			rp3.Pintar();
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
		
		}
		//rp2.stop();
	
	}

}
