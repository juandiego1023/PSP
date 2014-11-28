public class Tac extends Thread {
	//Propiedades --------------------------------
	private int hilo;

	//Constructor --------------------------------
	public Tac (int hilo){
		this.hilo=hilo;
	}//fin constructor
	
	//Método Run -----------------------------------
	public void run(){

		while (true){

		   try {		
       			  sleep(2000);
			 } catch (InterruptedException e) {
                    }


			System.out.println ("TAC");

		}
	}//fin run
	

} //fin clase
