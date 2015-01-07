import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;


public class Ejer1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer1 frame = new Ejer1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejer1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(23, 34, 70, 15);
		contentPane.add(lblNombre);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setBounds(95, 32, 325, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton boton = new JButton("Boton");
		boton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNombre.setText("Holaaaaaaaa");
				System.out.println("*********");
			}
		});
		boton.setBounds(291, 209, 117, 25);
		contentPane.add(boton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 78, 243, 167);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(264, 78, -231, 156);
		contentPane.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(334, 102, 32, 24);
		contentPane.add(comboBox);
		
		JRadioButton rdbtnReadio = new JRadioButton("readio");
		rdbtnReadio.setBounds(274, 178, 149, 23);
		contentPane.add(rdbtnReadio);
	}
}
