package exercícios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exr03 {

	private JFrame frame;
	private JTextField textFieldDisciplina;
	private JTextField textFieldProfessor;
	private JTextField textFieldDia;
	private JTextField textFieldHorario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exr03 window = new Exr03();
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
	public Exr03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 708, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Disciplina");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 37, 73, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Professor");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 62, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dia");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 87, 73, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hor\u00E1rio");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 112, 73, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textFieldDisciplina = new JTextField();
		textFieldDisciplina.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldDisciplina.setBounds(93, 34, 139, 20);
		frame.getContentPane().add(textFieldDisciplina);
		textFieldDisciplina.setColumns(10);
		
		textFieldProfessor = new JTextField();
		textFieldProfessor.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldProfessor.setColumns(10);
		textFieldProfessor.setBounds(93, 59, 139, 20);
		frame.getContentPane().add(textFieldProfessor);
		
		textFieldDia = new JTextField();
		textFieldDia.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldDia.setColumns(10);
		textFieldDia.setBounds(93, 84, 139, 20);
		frame.getContentPane().add(textFieldDia);
		
		textFieldHorario = new JTextField();
		textFieldHorario.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldHorario.setColumns(10);
		textFieldHorario.setBounds(93, 109, 139, 20);
		frame.getContentPane().add(textFieldHorario);
		
		JTextArea textAreaPOG = new JTextArea();
		textAreaPOG.setBounds(242, 32, 257, 305);
		frame.getContentPane().add(textAreaPOG);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String disc = textFieldDisciplina.getText();
				String prof = textFieldProfessor.getText();
				String dia = textFieldDia.getText();
				String hora = textFieldHorario.getText();
				
				String frase = disc + " (" + prof + ") " + dia + " " + hora;
				
				textAreaPOG.setText(textAreaPOG.getText() + frase + "\n");
			}
		});
		btnInserir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnInserir.setBounds(90, 165, 89, 23);
		frame.getContentPane().add(btnInserir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaPOG.setText(null);
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnLimpar.setBounds(90, 211, 89, 23);
		frame.getContentPane().add(btnLimpar);
		
	}
}
