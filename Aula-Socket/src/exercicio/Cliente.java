package exercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Cliente {

	private JFrame frame;
	private JTextField textFieldTextoCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente window = new Cliente();
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
	public Cliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 500, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textAreaChat = new JTextArea();
		textAreaChat.setBounds(10, 11, 464, 366);
		frame.getContentPane().add(textAreaChat);
		
		textFieldTextoCliente = new JTextField();
		textFieldTextoCliente.setBounds(10, 388, 365, 28);
		frame.getContentPane().add(textFieldTextoCliente);
		textFieldTextoCliente.setColumns(10);
		
		JButton btnEnviarCliente = new JButton("Enviar");
		btnEnviarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Socket cliente = new Socket("127.0.0.1", 82);
					PrintWriter saida = new PrintWriter(cliente.getOutputStream());
					BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
					Scanner leitor = new Scanner(System.in);
					
						while (true) {
							String mensagem = textFieldTextoCliente.getText();
							textAreaChat.append(mensagem);
						}

						try {
							String mensagem = entrada.readLine();
							while (mensagem != null) {
								textAreaChat.append("Servidor: " + mensagem);
								mensagem = entrada.readLine();
							}

							textAreaChat.append("Servidor offline.");
							saida.close();
							cliente.close();

						} catch (IOException e1) {
							e1.printStackTrace();
						}
					
					textAreaChat.append("Cliente online.");

				
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		btnEnviarCliente.setBounds(385, 388, 89, 28);
		frame.getContentPane().add(btnEnviarCliente);
	}
}
