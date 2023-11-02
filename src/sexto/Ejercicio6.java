package sexto;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Ejercicio6 extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnEsquina;
	private JButton btnCentro ;
	private JButton btnAgrandar;
	private JButton btnAchicar;
	private JTextField etiNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 frame = new Ejercicio6();
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
	public Ejercicio6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(62, 179, 117, 29);
		btnEsquina.addActionListener(this);
		btnEsquina.addMouseListener(this);
		contentPane.add(btnEsquina);
		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(258, 179, 117, 29);
		btnCentro.addActionListener(this);
		btnCentro.addMouseListener(this);
		contentPane.add(btnCentro);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(62, 224, 117, 29);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
		contentPane.add(btnAgrandar);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(258, 224, 117, 29);
		btnAchicar.addActionListener(this);
		btnAchicar.addMouseListener(this);
		contentPane.add(btnAchicar);
		
		etiNombre = new JTextField();
		etiNombre.setForeground(new Color(253, 253, 253));
		etiNombre.setBackground(new Color(0, 0, 0));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setBounds(153, 80, 117, 38);
		contentPane.add(etiNombre);
		etiNombre.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnEsquina) {
			etiNombre.setLocation(320,0);
			
		}else if(e.getSource() == btnCentro) {
			etiNombre.setLocation(170,50);
			
		}else if(e.getSource() == btnAchicar) {
			etiNombre.setSize(60,60); 
			
		}else if(e.getSource() == btnAgrandar) {
			etiNombre.setSize(100,100);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == btnEsquina) {
			btnEsquina.setSize(105, 30);
		} else if (e.getSource() == btnCentro) {
			btnCentro.setSize(105, 30);
		} else if (e.getSource() == btnAgrandar) {
			btnAgrandar.setSize(105, 30);
		} else if (e.getSource() == btnAchicar) {
			btnAchicar.setSize(105, 30);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == btnEsquina) {
			btnEsquina.setSize(120, 30);
		} else if (e.getSource() == btnCentro) {
			btnCentro.setSize(120, 30);
		} else if (e.getSource() == btnAgrandar) {
			btnAgrandar.setSize(120, 30);
		} else if (e.getSource() == btnAchicar) {
			btnAchicar.setSize(120, 30);
		}
	}
}
