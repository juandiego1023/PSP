class Productor extends Thread {
	private Cola cola;
	private int n;

	public Productor (Cola c, int n){
		cola=c;
		this.n=n;
	}
	
	public void run(){
		
		for (int i=0;i<5;i++){
			String valor="";
			if(i%2==0){
				cola.put("Ping");
				valor="Ping";
			}
			else{
				
				cola.put("Pong");
				valor="Pong";
			}
			System.out.println("Productor->"+valor);
			try {
				sleep(100);
			}catch (InterruptedException e){}
	 			
		}
	}

}
