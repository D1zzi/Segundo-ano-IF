package exemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			ServerSocket servidor = new ServerSocket(82);
			Socket cliente = servidor.accept();
			PrintWriter saida = new PrintWriter(cliente.getOutputStream());
			BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			Scanner leitor = new Scanner(System.in);

			Thread remetente = new Thread(new Runnable() {
				public void run() {
					while (true) {
						String mensagem = leitor.nextLine();
						saida.println(mensagem);
						saida.flush();
					}
				}
			});

			remetente.start();

			Thread receptor = new Thread(new Runnable() {
				public void run() {
					try {
						String mensagem = entrada.readLine();
						while (mensagem != null) {
							System.out.println("Cliente: " + mensagem);
							mensagem = entrada.readLine();
						}

						System.out.println("Cliente offline.");

						saida.close();
						cliente.close();
						servidor.close();

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});

			receptor.start();
			
			System.out.println("Servidor online.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}