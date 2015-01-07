
public class Hilo extends Thread{

	//propiedades
	private int contador;
	
	//me declaro vble utilizare de flag 
	private volatile boolean stopRequested = false; //volatile pueden acceder a ella varios hilos
	
	//constructor
	Hilo (int x){
		this.contador=x;
	}
	
	
	
	//run	
	public void run(){
		try {
			while (!stopRequested){
				try{
					Thread.sleep(100);
				}catch (InterruptedException e){e.printStackTrace();}
				repaint();
				
				if(!izquierda)	
					contador=contador-10;
				if(izquierda)
					contador=contador+10;
				if(contador<=0 ){
					izquierda=true;
				}
				else{
					if (contador>=ancho-20)
						izquierda=false;				
				}
					
				
					
				
				
			}//fin while
		}catch (InterruptedException e){
			System.out.println("Ha ocurrido una excepcion");
		}
				
	}
	
	public void requestStop() {
		  stopRequested = true;
		}
	
	 public void interrumpir(){
		 interrupt();
	 }
	
	public int getcontador(){
		return contador;
	}
		
}

