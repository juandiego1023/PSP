import java.awt.*;
import javax.swing.*;

public class Validar extends JFrame{
	public Validar() {
	}

	public static void main(String[] args) {
		Validar marco = new Validar();
		int ancho, alto;
		marco.setSize(500, 200);
		marco.setLocation(0, 0);
		marco.setTitle("Validación");
		
		marco.setDefaultCloseOperation(marco.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		marco.getContentPane().add(panel);
		afegirComponentes(panel);
		marco.setVisible(true);
		

	}
	
	private static void afegirComponentes(JPanel panel){
		
		panel.setLayout(null);
		
		JLabel etiqUser = new JLabel("Usuario");
		etiqUser.setBounds(10,15,80,15);
		panel.add(etiqUser);
	
		
		JTextField textUser = new JTextField(20);
		textUser.setBounds(110,10,180,25);
		panel.add(textUser);
		
		
		JLabel etiqPass = new JLabel("Password");
		etiqPass.setBounds(10,50,100,15);
		panel.add(etiqPass);
	
		

		JPasswordField textPass = new JPasswordField(20);
		textPass.setBounds(110,45,180,25);
		panel.add(textPass);
		
		
		JButton botonLogin = new JButton("Login");
		botonLogin.setBounds(35,85,110,25);
		panel.add(botonLogin);
		
		
		JButton botonRegistrar = new JButton("Registrar");
		botonRegistrar.setBounds(180,85,115,25);
		panel.add(botonRegistrar);
		
	}

}
