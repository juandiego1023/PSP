
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PelotaHilo extends Applet implements Runnable, ActionListener{
	//Propiedades
		private Thread h;
		private Font fuente;
		int contador;
		private boolean parar;
		private Button b1,b2,b3; //botones del Applet
		private volatile boolean stopRequested = false;
		
		
		public void start(){
			h=new Thread(this);
			h.start();
		}	
		
		
		
		
		//método init
		public void init(){
			setBackground(Color.yellow);//color de fondo
			//setSize(400,400);
			
			//añado botón 1 y su listener
			add(b1=new Button("Parar pelota"));
			b1.addActionListener(this);
			
			add(b2=new Button("Parar pelota Flag"));
			b2.addActionListener(this);
			
			add(b3=new Button("Parar pelota Interrupt"));
			b3.addActionListener(this);
			
			fuente=new Font("Verdana",Font.BOLD,26); //tipo de letra
		}
		

		public void run() {
			//inicializo parar a falso
			parar=false;
			
			//recojo hiloActual
			Thread hiloActual=Thread.currentThread();
			
			int ancho = Integer.parseInt(this.getParameter("WIDTH")); 
			int alto = Integer.parseInt(this.getParameter("HEIGHT")); 
			
			contador = ancho-20;
			
			boolean izquierda = false;
			
			while (h==hiloActual && !parar && !stopRequested){
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
			
		}//fin run
		
		
		public void paint(Graphics g){ 
			 
			 g.setFont(fuente); 
			 
			 g.setColor(Color.black); 
			 
			 g.fillArc(contador,100,20,20,0,360); //dibujo pelota
			 
			} 
		
		public void interrumpir(){
			// interrupt();
		 }
		public void requestStop() {
			  stopRequested = true;
			}
		//parar controlar pulsación botones	
		public void actionPerformed(ActionEvent e) {

			
			if (e.getSource()==b1){ //parada
					h=null;
			}
			
			if (e.getSource()==b2){ //parada Flag
				b1.setLabel("Finalizado Flag");
				h.requestStop();
			}
			
			if (e.getSource()==b3){ //parada Interrupt
				b2.setLabel("Finalizado hilo con interrrupt");
				h.interrumpir();
			}
			
			
		}//actionperformed
		
		public void stop(){
			
			h=null;
		}

		





}

