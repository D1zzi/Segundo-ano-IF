package exercícios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Exr02 {

	private JFrame frame;
	private JTextField textFieldTexto;
	private JTextField textFieldResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exr02 window = new Exr02();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exr02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldTexto = new JTextField();
		textFieldTexto.setFont(new Font("Arial", Font.PLAIN, 13));
		textFieldTexto.setBounds(40, 72, 347, 20);
		frame.getContentPane().add(textFieldTexto);
		textFieldTexto.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Frase");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setBounds(41, 52, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnAnalisar = new JButton("Analisar");
		btnAnalisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String frase = textFieldTexto.getText();
				String caracter = frase.replace(" ", "");
				String[] palavras = frase.split(" ");
				
				textFieldResultado.setText(caracter.length() + " caracteres e " + palavras.length + " palavras");
			}
		});
		btnAnalisar.setFont(new Font("Arial", Font.PLAIN, 13));
		btnAnalisar.setBounds(40, 103, 89, 23);
		frame.getContentPane().add(btnAnalisar);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setFont(new Font("Arial", Font.PLAIN, 13));
		textFieldResultado.setColumns(10);
		textFieldResultado.setBounds(40, 137, 347, 20);
		frame.getContentPane().add(textFieldResultado);
	}
}
