package cuarto;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ejercicio4 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	JLabel lblNombre, lblCiudad, txtFrase;
	JButton btnAceptar,btnActivar,btnDesactivar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 frame = new Ejercicio4();
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
	public Ejercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(76, 64, 64, 20);
		contentPane.add(lblNombre);
		
		lblCiudad = new JLabel("Ciudad");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCiudad.setBounds(76, 127, 64, 17);
		contentPane.add(lblCiudad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(188, 66, 160, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(188, 127, 160, 20);
		contentPane.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		txtFrase = new JLabel("");
		txtFrase.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFrase.setBounds(142, 179, 172, 20);
		contentPane.add(txtFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(0, 0, 0));
		btnAceptar.setBounds(36, 227, 89, 23);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBackground(new Color(0, 0, 0));
		btnActivar.setBounds(168, 227, 89, 23);
		btnActivar.addActionListener(this);
		contentPane.add(btnActivar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBackground(new Color(0, 0, 0));
		btnDesactivar.setBounds(299, 227, 89, 23);
		btnDesactivar.addActionListener(this);
		contentPane.add(btnDesactivar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			String Nombre = txtNombre.getText();
			String Ciudad = txtCiudad.getText();
			txtFrase.setText("Usted se llama "+Nombre+" y vive en "+Ciudad);
		} else if(e.getSource() == btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		} else if(e.getSource() == btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
		}
	}
	
	

}

