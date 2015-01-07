
public class Main {

	public static void main(String[] args) {
		Cuenta cuenta=new Cuenta();
		Persona roberto=new Persona(cuenta,"Roberto");
		Persona maria=new Persona(cuenta,"Maria");
		
		roberto.start();
		maria.start();	
		
	}
	
	
	
}
