package segundo;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class Ejercicio2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	JLabel etiTexto1,etiTexto2;
	JButton btnTraspasa1, btnTraspasa2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
        txtTexto.setBounds(20, 20, 200, 30);
        getContentPane().add(txtTexto);

        etiTexto1 = new JLabel();
        etiTexto1.setBounds(20, 70, 200, 30);
        getContentPane().add(etiTexto1);

        etiTexto2 = new JLabel();
        etiTexto2.setBounds(20, 120, 200, 30);
        getContentPane().add(etiTexto2);

        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa1.setBounds(240, 70, 120, 30);
        btnTraspasa1.addActionListener(this);
        getContentPane().add(btnTraspasa1);

        btnTraspasa2 = new JButton("Traspasa 2");
        btnTraspasa2.setBounds(240, 120, 120, 30);
        btnTraspasa2.addActionListener(this);
        getContentPane().add(btnTraspasa2);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == btnTraspasa1) {
	            String texto = txtTexto.getText();
	            etiTexto1.setText(texto);
	        } else if (e.getSource() == btnTraspasa2) {
	            String texto = txtTexto.getText();
	            etiTexto2.setText(texto);
	        }
	}
}


