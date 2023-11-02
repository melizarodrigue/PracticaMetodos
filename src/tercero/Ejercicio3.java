package tercero;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class Ejercicio3 extends JFrame implements KeyListener, ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	private JButton btnVaciar;
	JLabel etiTexto;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBackground(new Color(255, 255, 255));
		txtTexto.setBounds(118, 37, 209, 37);
		contentPane.add(txtTexto);
		txtTexto.addKeyListener(this);
		txtTexto.setColumns(10);
		
		etiTexto = new JLabel("");
		etiTexto.setBackground(new Color(187, 41, 218));
		etiTexto.setBounds(118, 94, 209, 30);
		contentPane.add(etiTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setBackground(new Color(187, 41, 218));
		btnVaciar.setBounds(171, 146, 89, 23);
		btnVaciar.addActionListener(this);
		contentPane.add(btnVaciar);
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == txtTexto) {
            String texto = txtTexto.getText();
            etiTexto.setText(texto);
        }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVaciar) {
			txtTexto.setText("");
			etiTexto.setText("");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}


