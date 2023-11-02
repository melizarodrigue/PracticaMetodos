package noveno;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Ejercicio9 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField textTercerTrimestre;
	JLabel lblPrimero, lblSegundo, lblTercero, etiNotaFinal, etiResultado;
	JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio9 frame = new Ejercicio9();
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
	public Ejercicio9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(35, 77, 111, 20);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setBounds(239, 77, 116, 20);
		contentPane.add(txtSegundoTrimestre);
		txtSegundoTrimestre.setColumns(10);
		
		textTercerTrimestre = new JTextField();
		textTercerTrimestre.setBounds(430, 77, 111, 20);
		contentPane.add(textTercerTrimestre);
		textTercerTrimestre.setColumns(10);
		
		lblPrimero = new JLabel("Primer Trimestre");
		lblPrimero.setBounds(35, 52, 111, 14);
		contentPane.add(lblPrimero);
		
		lblSegundo = new JLabel("Segundo Trimestre");
		lblSegundo.setBounds(239, 52, 116, 14);
		contentPane.add(lblSegundo);
		
		lblTercero = new JLabel("Tercer Trimestre");
		lblTercero.setBounds(430, 52, 111, 14);
		contentPane.add(lblTercero);
		
		etiNotaFinal = new JLabel(".");
		etiNotaFinal.setBounds(35, 168, 232, 20);
		contentPane.add(etiNotaFinal);
		
		etiResultado = new JLabel(".");
		etiResultado.setBounds(35, 199, 208, 20);
		contentPane.add(etiResultado);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setForeground(new Color(0, 0, 128));
		btnCalcular.setBackground(new Color(255, 255, 255));
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalcular.setBounds(252, 127, 89, 23);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
		
		//btnCalcular.addActionListener(new ActionListener() {
            //public void actionPerformed(ActionEvent e) {
                //calcularNotaFinal();
            //}
        //});
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		calcularNotaFinal();
	}
	
	private void calcularNotaFinal() {
		double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
		double nota2 = Double.parseDouble(txtPrimerTrimestre.getText());
		double nota3 = Double.parseDouble(txtPrimerTrimestre.getText());
		
		double notaFinal = (nota1 + nota2 + nota3) / 3;
        etiNotaFinal.setText("Nota Final: " + notaFinal);
        
        if (notaFinal < 5.0) {
            etiResultado.setText("Resultado: SUSPENSO");
            etiResultado.setForeground(Color.RED);
            etiNotaFinal.setForeground(Color.RED);
        } else {
            etiResultado.setText("Resultado: APROBADO");
            etiResultado.setForeground(Color.BLACK);
            etiNotaFinal.setForeground(Color.BLACK);
        }
	}
}

