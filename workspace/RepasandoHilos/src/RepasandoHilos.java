
public class RepasandoHilos extends Thread {
	
	int cont1;
	//int cont2;
	int inc1;
	//int inc2;

	
	
	public RepasandoHilos(int conta1,int incr1){
		
		cont1=conta1;
		//cont2=conta2;
		inc1=incr1;
		//inc2=incr2;

	
	}

	public void run() {

		while (true) 
			{ 
			cont1 += inc1;
			//cont2 += inc2;
			

				try {
					Thread.sleep(1000);
				}catch (InterruptedException e){}
			}
		
	}
	public void Pintar(){
		
		System.out.println(cont1);
		//System.out.println(cont2);
	}

	

}
