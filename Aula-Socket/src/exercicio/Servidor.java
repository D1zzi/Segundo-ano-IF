package exercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Servidor {

	private JFrame frame;
	private JTextField textFieldTextoServidor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servidor window = new Servidor();
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
	public Servidor() {
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
		
		textFieldTextoServidor = new JTextField();
		textFieldTextoServidor.setBounds(10, 388, 365, 28);
		frame.getContentPane().add(textFieldTextoServidor);
		textFieldTextoServidor.setColumns(10);
		
		JButton btnEnviarServidor = new JButton("Enviar");
		btnEnviarServidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					ServerSocket servidor = new ServerSocket(82);
					Socket cliente = servidor.accept();
					PrintWriter saida = new PrintWriter(cliente.getOutputStream());
					BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
					Scanner leitor = new Scanner(System.in);

					while (true) {
							String mensagem = textFieldTextoServidor.getText();
							textAreaChat.append(mensagem);
					}

					try {
						String mensagem = entrada.readLine();
						while (mensagem != null) {
							textAreaChat.append("Cliente: " + mensagem);
							mensagem = entrada.readLine();
						}

						textAreaChat.append("Cliente offline.");

						saida.close();
						cliente.close();
						servidor.close();

					} catch (IOException e) {
						e.printStackTrace();
					}
					
					textAreaChat.append("Servidor online.");

				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		btnEnviarServidor.setBounds(385, 388, 89, 28);
		frame.getContentPane().add(btnEnviarServidor);
	}

}
