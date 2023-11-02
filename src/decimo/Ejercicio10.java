package decimo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ejercicio10 extends JFrame  implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JButton btnConcatena ;
	private JLabel etiTexto ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio10 frame = new Ejercicio10();
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
	public Ejercicio10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(135, 52, 183, 29);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setBounds(135, 90, 183, 29);
		contentPane.add(txtPalabra2);
		txtPalabra2.setColumns(10);
		
		btnConcatena = new JButton("Concatenar");
		btnConcatena.setBounds(169, 150, 125, 29);
		contentPane.add(btnConcatena);
		btnConcatena.addActionListener(this);
		
		etiTexto = new JLabel("");
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setBounds(121, 212, 225, 16);
		contentPane.add(etiTexto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnConcatena ) {
			
			String palabra1 = txtPalabra1.getText(); 
			String palabra2 = txtPalabra2.getText();
			
			etiTexto.setText(palabra1 + palabra2);
			
		}
		
	}

}


