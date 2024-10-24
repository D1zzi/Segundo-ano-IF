package exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class App01 {

	private JFrame frmPrimeiroApp;
	private JTextField textFieldNome;
	private JLabel lblSaida;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App01 window = new App01();
					window.frmPrimeiroApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrimeiroApp = new JFrame();
		frmPrimeiroApp.getContentPane().setBackground(Color.DARK_GRAY);
		frmPrimeiroApp.setResizable(false);
		frmPrimeiroApp.setTitle("Primeiro App");
		frmPrimeiroApp.setBounds(100, 100, 800, 350);
		frmPrimeiroApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrimeiroApp.getContentPane().setLayout(null);
		
		JLabel lblFalaMeuBom = new JLabel("Fala meu bom, manda seu nome:\r\n");
		lblFalaMeuBom.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblFalaMeuBom.setBounds(25, 11, 282, 40);
		frmPrimeiroApp.getContentPane().add(lblFalaMeuBom);
		
		textFieldNome = new JTextField();
		textFieldNome.setBackground(Color.GRAY);
		textFieldNome.setFont(new Font("Arial", Font.PLAIN, 15));
		textFieldNome.setBounds(20, 49, 287, 24);
		frmPrimeiroApp.getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(textFieldNome.getText());
				lblSaida.setText("Olá " + textFieldNome.getText());
			}
		});
		btnOK.setFont(new Font("Arial", Font.BOLD, 20));
		btnOK.setBounds(20, 84, 89, 23);
		frmPrimeiroApp.getContentPane().add(btnOK);
		
		lblSaida = new JLabel("");
		lblSaida.setForeground(Color.BLUE);
		lblSaida.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSaida.setBounds(25, 270, 330, 24);
		frmPrimeiroApp.getContentPane().add(lblSaida);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(366, 11, 418, 283);
		frmPrimeiroApp.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(textFieldNome.getText() + "\n"); // Não apaga tudo
			}
		});
		btnAdicionar.setFont(new Font("Arial", Font.BOLD, 20));
		btnAdicionar.setBounds(131, 84, 143, 23);
		frmPrimeiroApp.getContentPane().add(btnAdicionar);
	}
}
