package octavo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Ejercicio8 extends JFrame  implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnVerde;
	private JButton btnTrasparente;
	private JButton btnFondoVerde;
	private JButton btnFondoRojo;
	private JButton btnFondoAzul;
	private JButton btnOpaca;
	private JTextField etiNombre;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio8 frame = new Ejercicio8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	public Ejercicio8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAzul = new JButton("Azul");
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAzul.setBounds(25, 127, 117, 29);
		contentPane.add(btnAzul);
		btnAzul.addActionListener(this);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(25, 168, 117, 29);
		contentPane.add(btnVerde);
		btnVerde.addActionListener(this);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(25, 209, 117, 29);
		contentPane.add(btnRojo);
		btnRojo.addActionListener(this);
		
		btnTrasparente = new JButton("Transparente");
		btnTrasparente.setBounds(165, 156, 117, 29);
		contentPane.add(btnTrasparente);
		btnTrasparente.addActionListener(this);
		
		btnFondoVerde = new JButton("Fondo verde");
		btnFondoVerde.setBounds(294, 168, 117, 29);
		contentPane.add(btnFondoVerde);
		btnFondoVerde.addActionListener(this);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setBounds(294, 209, 117, 29);
		contentPane.add(btnFondoRojo);
		btnFondoRojo.addActionListener(this);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setBounds(294, 127, 117, 29);
		contentPane.add(btnFondoAzul);
		btnFondoAzul.addActionListener(this);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setBounds(165, 197, 117, 29);
		contentPane.add(btnOpaca);
		
		etiNombre = new JTextField();
		etiNombre.setBounds(162, 52, 130, 26);
		contentPane.add(etiNombre);
		etiNombre.setColumns(10);
		btnOpaca.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnAzul) {
			etiNombre.setForeground(Color.blue);
			
		}else if(e.getSource() == btnVerde) {
			etiNombre.setForeground(Color.green);
			
		}else if(e.getSource() == btnRojo) {
			etiNombre.setForeground(Color.red);
		
		}else if(e.getSource() == btnTrasparente) {
			etiNombre.setOpaque(false);
		
		}else if(e.getSource() == btnFondoVerde) {
			etiNombre.setBackground(Color.green);
		
		}else if(e.getSource() == btnFondoRojo) {
			etiNombre.setBackground(Color.red);
		
		}else if(e.getSource() == btnFondoAzul) {
			etiNombre.setBackground(Color.blue);
		
		}else if(e.getSource() == btnOpaca) {
			etiNombre.setOpaque(true);
		}
	}
}

