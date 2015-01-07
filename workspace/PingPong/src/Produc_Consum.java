public class Produc_Consum{
	public static void main(String[] args) {
		Cola cola=new Cola();
		Consumidor p=new Consumidor(cola,1);
		Productor c=new Productor(cola,1);
		p.start();
		c.start();	
		
	}
	


}
