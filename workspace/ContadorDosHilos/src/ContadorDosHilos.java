import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ContadorDosHilos extends Applet implements Runnable, ActionListener{
	//Propiedades
		private Thread h,h2;
		private Font fuente;
		long CONTADOR=1;
		long CONTADOR2=3;
		private boolean parar,parar2;
		private Button b1,b2; //botones del Applet
		
		
		public void start(){
			
			h=new Thread(this);
			h.start();
			h2=new Thread(this);
			h2.start();
			
		}	
		
		
		
		
		//método init
		public void init(){
			
			setBackground(Color.yellow);//color de fondo
			setSize(400,200);
			
			//añado botón 1 y su listener
			add(b1=new Button("Parar contador 1"));
			b1.addActionListener(this);
					
			//añado botón 2 y su listener
			add(b2=new Button("Parar contador 2"));
			b2.addActionListener(this);
			
			fuente=new Font("Verdana",Font.BOLD,26); //tipo de letra
		}
		

		public void run() {
			//inicializo parar a falso
			parar=false;
			parar2=false;
			
			//recojo hiloActual
			Thread hiloActual=Thread.currentThread();
			
			while (h==hiloActual || h2==hiloActual){
				try{
					Thread.sleep(100);
				}catch (InterruptedException e){e.printStackTrace();}
				repaint();
				if(h!=null)	
					CONTADOR++;
				if(h2!=null)
					CONTADOR2++;
			}//fin while
			
		}//fin run
		
		
		public void paint(Graphics g){
			g.setFont(fuente);
			g.drawString("HILO 1: "+Long.toString((long)CONTADOR), 80, 100); //escribe contador
			g.drawString("HILO 2: "+Long.toString((long)CONTADOR2), 80, 150); //escribe contador
			
		}
		
		
		//parar controlar pulsación botones	
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==b1){ //parada
					h=null;
			}
			if (e.getSource()==b2){ //parada
					h2=null;
			}
			
			
		}//actionperformed
		
		public void stop(){
			
			h=null;
			h2=null;
		}

		





}

