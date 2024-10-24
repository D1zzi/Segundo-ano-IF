package exemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			
			Socket cliente = new Socket("127.0.0.1", 82); // ip conectado + porta
			PrintWriter saida = new PrintWriter(cliente.getOutputStream());
			// PARTE 1: cria uma forma de output de mensagem para o "cliente"
			BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			// PARTE 2: usado como input do "servidor" quando na tela do "cliente"
			Scanner leitor = new Scanner(System.in);
			// lê, a gente não vai usar.
			
			// PARTE 1
			Thread remetente = new Thread(new Runnable() {
				// threads rodam simultaneamente
				// o runnnable apenas significa o começo da execução
				public void run() {
					while (true) {
						String mensagem = leitor.nextLine(); // pega a mensagem
						saida.println(mensagem); // imprime a mensagem
						saida.flush(); // limpa o cache da saida
					}
				}
			});

			remetente.start();
			// start chama a execução da thread

			// PARTE 2
			Thread receptor = new Thread(new Runnable() {
				// inicia a thread do receptor (é quando o cliente vai receber as mensagens do servidor)
				public void run() {
					try {
						String mensagem = entrada.readLine();
						// tá pegando uma linha do servidor pela "entrada" do BufferedReader
						while (mensagem != null) {
						// enquanto a mensagem tiver conteúdo
							System.out.println("Servidor: " + mensagem);
							// escreve o que o servidor já disse anteriormente
							mensagem = entrada.readLine();
							// lê a próxima linha das mensagens do servidor
						}

						System.out.println("Servidor offline.");
						saida.close();
						// como é executado com prioridade inferior, ele vai ficar rodando até os
						// textos do cliente serem todos executados, demarcado pelo close da saída do
						// fluxo de dados do cliente, assim terminando a parte por visão do cliente
						cliente.close();
						// cliente fecha

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});

			receptor.start();
			// prioridade de thread 2
			
			System.out.println("Cliente online.");

		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}