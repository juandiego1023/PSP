
public class Cuenta {
	//atributos
	private int saldo=50;
	
	//metodos
	//sacar


	public synchronized int meter(int valor){
		saldo=saldo+valor;
		notifyAll();
		
		return saldo;
	}
	
	public synchronized int sacar(int valor){
		if((saldo-valor)<0) { //si esta vacia
			System.out.println("No hay saldo suficiente");
			try {
				wait();
			}catch (InterruptedException e){};
		
		}	
		notifyAll();
		saldo=saldo-valor;
		
		return saldo; 
	}
	
	public synchronized int leer(){	
		notifyAll();
		return saldo;
	}
	

}
