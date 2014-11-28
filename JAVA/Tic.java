public class Tic extends Thread {
	//Propiedades --------------------------------
	private int hilo;

	//Constructor --------------------------------
	public Tic (int hilo){
		this.hilo=hilo;
	}//fin constructor
	
	//Método Run -----------------------------------
	public void run(){

		try {		
       			  sleep(1000);
			 } catch (InterruptedException e) {
                    }

		while (true){
	
	    	
		try {		
       			  sleep(2000);
			 } catch (InterruptedException e) {
                    }


			System.out.println ("TIC");

		}
	}//fin run
	

} //fin clase
