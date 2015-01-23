
public class Estacion{
	
		//atributos
		private int capacidad=5;
		
		public Estacion (int numero){
			
			capacidad=numero;
		}

		public synchronized int salir(int matricula){
			capacidad ++;
			notifyAll();
			
			return capacidad;
		}
		
		public synchronized int entrar(int valor){
			if(capacidad==0) { 
				System.out.println("No hay espacio suficiente");
				try {
					wait();
				}catch (InterruptedException e){};
			
			}	
			notifyAll();
			capacidad-=1;
			
			return capacidad; 
		}
		
		public synchronized int leer(){	
			notifyAll();
			return capacidad;
		}
}
