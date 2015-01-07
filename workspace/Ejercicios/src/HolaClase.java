import java.awt.*;
import javax.swing.*;

public class HolaClase extends JFrame{


	public static void main(String[] args) {
		
		HolaClase marco = new HolaClase();
		int ancho, alto;
		marco.setSize(500, 200);
		marco.setLocation(0, 0);
		marco.setTitle("HolaClase");
		
		marco.setDefaultCloseOperation(marco.EXIT_ON_CLOSE);
		
		// Creación de los botones
		JButton boton[] = new JButton[9];
		for (int i=0;i<9;i++)
		   boton[i] = new JButton(Integer.toString(i));

		// Colocación en el contenedor
		marco.setLayout (new GridLayout (3,3));  // 3 filas y 3 columnas
		for (int i=0;i<9;i++)
		    marco.add (boton[i]);  // Añade los botones de 1 en 1
		
		
		
		marco.setVisible(true);
		
		

		

	}

}
