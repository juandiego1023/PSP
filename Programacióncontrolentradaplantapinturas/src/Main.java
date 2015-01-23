

public class Main {

	public static void main(String[] args) {
		Estacion estacion=new Estacion(5);
		Coche vehiculos[]=new Coche[10];
		vehiculos[0] = new Coche(estacion,2737);
		vehiculos[1] = new Coche(estacion,1234);
		vehiculos[2] = new Coche(estacion,5678);
		vehiculos[3] = new Coche(estacion,9087);
		vehiculos[4] = new Coche(estacion,7629);
		vehiculos[5] = new Coche(estacion,7119);
		vehiculos[6] = new Coche(estacion,7633);
		vehiculos[7] = new Coche(estacion,7644);
		vehiculos[8] = new Coche(estacion,5529);
		vehiculos[9] = new Coche(estacion,6629);
		
		
		for(int i=0;i<10;i++){
			vehiculos[i].start();
		}
		
	}
	
	
	
}