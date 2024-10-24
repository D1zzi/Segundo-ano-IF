package exercícios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exr01 {

	private JFrame frmExerccio;
	private JTextField textFieldNumA;
	private JTextField textFieldNumB;
	private JTextField textFieldSoma;
	private JTextField textFieldMulti;
	private JTextField textFieldSub;
	private JTextField textFieldDiv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exr01 window = new Exr01();
					window.frmExerccio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exr01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExerccio = new JFrame();
		frmExerccio.setTitle("Exerc\u00EDcio #01");
		frmExerccio.setBounds(100, 100, 500, 350);
		frmExerccio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExerccio.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero A");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(40, 32, 94, 14);
		frmExerccio.getContentPane().add(lblNewLabel);
		
		JLabel lblNmeroB = new JLabel("N\u00FAmero B");
		lblNmeroB.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNmeroB.setBounds(246, 34, 94, 14);
		frmExerccio.getContentPane().add(lblNmeroB);
		
		textFieldNumA = new JTextField();
		textFieldNumA.setBounds(40, 57, 86, 20);
		frmExerccio.getContentPane().add(textFieldNumA);
		textFieldNumA.setColumns(10);
		
		textFieldNumB = new JTextField();
		textFieldNumB.setBounds(246, 59, 86, 20);
		frmExerccio.getContentPane().add(textFieldNumB);
		textFieldNumB.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textFieldNumA.getText());
				int b = Integer.parseInt(textFieldNumB.getText());
				int contSoma = a + b;
				int contSub = a - b;
				int contMulti = a * b;
				int contDiv = a / b;
				textFieldSoma.setText(""+contSoma);
				textFieldSub.setText(""+contSub);
				textFieldMulti.setText(""+contMulti);
				textFieldDiv.setText(""+contDiv);
			}
		});
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 15));
		btnCalcular.setBounds(144, 106, 89, 23);
		frmExerccio.getContentPane().add(btnCalcular);
		
		JLabel lblSoma = new JLabel("Soma");
		lblSoma.setFont(new Font("Arial", Font.PLAIN, 17));
		lblSoma.setBounds(40, 158, 94, 14);
		frmExerccio.getContentPane().add(lblSoma);
		
		JLabel lblNewLabel_1_1 = new JLabel("Diferen\u00E7a");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(246, 160, 94, 14);
		frmExerccio.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Multiplica\u00E7\u00E3o");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1_1_1.setBounds(40, 213, 94, 14);
		frmExerccio.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Divis\u00E3o");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1_1_1_1.setBounds(246, 215, 94, 14);
		frmExerccio.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textFieldSoma = new JTextField();
		textFieldSoma.setColumns(10);
		textFieldSoma.setBounds(40, 183, 86, 20);
		frmExerccio.getContentPane().add(textFieldSoma);
		
		textFieldMulti = new JTextField();
		textFieldMulti.setColumns(10);
		textFieldMulti.setBounds(40, 237, 86, 20);
		frmExerccio.getContentPane().add(textFieldMulti);
		
		textFieldSub = new JTextField();
		textFieldSub.setColumns(10);
		textFieldSub.setBounds(246, 185, 86, 20);
		frmExerccio.getContentPane().add(textFieldSub);
		
		textFieldDiv = new JTextField();
		textFieldDiv.setColumns(10);
		textFieldDiv.setBounds(246, 237, 86, 20);
		frmExerccio.getContentPane().add(textFieldDiv);
	}
}
