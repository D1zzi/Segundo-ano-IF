package jogo;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.CardLayout;

public class Jogo {

	private Timer timer = new Timer();
	private int milissegundos = 800;
	
	private JButton[][] botoesA;
	private JButton[][] botoesB;
	private int[][] tabuleiroA;
	private int[][] tabuleiroB;
	
	private int[][] tabuleiroA1 = {
			{1,1,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,0,0,1,1,1,0,0,0},
			{0,0,0,0,0,1,1,1,0,0}			
	};
	
	private int[][] tabuleiroA2 = {
			{0,1,1,0,1,0,1,0,1,1},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,0},
			{1,1,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0}			
	};
	
	private int[][] tabuleiroA3 = {
			{1,0,0,0,0,0,0,0,0,0},
			{0,1,1,0,0,0,0,0,0,0},
			{0,0,0,1,1,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,0,0,0},
			{0,0,0,0,0,0,0,1,1,0},
			{1,1,1,1,0,0,0,0,0,1}			
	};
	
	private int[][] tabuleiroA4 = {
			{0,0,0,0,0,0,0,0,0,1},
			{0,0,0,1,1,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,0,0,0,0,1,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,1,1,1,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,0},
			{1,1,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,1,0,0}			
	};
	
	private int[][] tabuleiroA5 = {
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,1,0,0,0,0,0,0},
			{1,1,1,0,0,0,0,1,1,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{1,1,1,0,0,1,1,1,1,0}			
	};
	
	private int[][][] tabuleirosA = {
			tabuleiroA1,
			tabuleiroA2,
			tabuleiroA3,
			tabuleiroA4,
			tabuleiroA5
	};
	
	private int[][] tabuleiroB1 = {
			{1,1,1,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,1,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,0,0,0,1,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,0},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,0},
			{0,1,0,0,0,0,0,0,0,0}			
	};
	
	private int[][] tabuleiroB2 = {
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,0,0,0,0,0,1,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,1,1,1,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,1},
			{0,0,0,0,1,0,0,0,0,0},
			{0,0,0,1,1,1,1,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,0,0,0,1,1,0},
			{0,0,0,0,0,0,0,0,0,0}			
	};
	
	private int[][] tabuleiroB3 = {
			{0,0,0,1,0,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,1,1},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,0,0,0},
			{1,1,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,0}			
	};
	
	private int[][] tabuleiroB4 = {
			{0,1,1,1,1,0,1,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,1,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,0,0},
			{0,0,1,0,0,0,0,0,0,0},
			{0,0,0,1,1,1,0,0,0,0}			
	};
	
	private int[][] tabuleiroB5 = {
			{0,0,0,1,1,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{1,1,1,1,0,0,0,1,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,0,0},
			{0,1,0,0,0,0,0,0,0,0},
			{0,0,0,1,1,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{1,1,1,1,0,0,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0}			
	};
	
	private int[][][] tabuleirosB = {
			tabuleiroB1,
			tabuleiroB2,
			tabuleiroB3,
			tabuleiroB4,
			tabuleiroB5
	};
	
	private int pontuacaoA;
	private int pontuacaoB;
	
	private ImageIcon newIcon;
	
	private JFrame frmJuego;
	private JPanel painelA;
	private JPanel painelB;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jogo window = new Jogo();
					window.frmJuego.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Jogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJuego = new JFrame();
		frmJuego.setBounds(100, 100, 800, 650);
		frmJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// inicia os extremos
        botoesA = new JButton[10][10];
        botoesB = new JButton[10][10];
        pontuacaoA = 0;
    	pontuacaoB = 0;
    	
    	Random rand = new Random();
    	int indice = rand.nextInt(5);
    	int indice2 = rand.nextInt(5);
    	
    	tabuleiroB = tabuleirosB[indice];
    	tabuleiroA = tabuleirosA[indice2];
        
        // inicia os dois paineis
        painelA = new JPanel(new GridLayout(10, 10));
        painelB = new JPanel(new GridLayout(10, 10));
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                botoesA[i][j] = new JButton();
                botoesB[i][j] = new JButton();
                
                // adiciona botões 10x10 nos arrays bidimensionais
                
                int linha = i;
                int coluna = j;
                
                // adiciona o clique dos botões
                botoesA[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	jogadaA(linha, coluna);
                    	botoesA[linha][coluna].setEnabled(false);
                    }
                });
                
                botoesB[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jogadaB(linha, coluna);
                        botoesB[linha][coluna].setEnabled(false);
                    }
                });

                painelA.add(botoesA[i][j]);
                painelB.add(botoesB[i][j]);
            }
        }
        
        frmJuego.getContentPane().removeAll();
        frmJuego.getContentPane().setLayout(new CardLayout(0, 0));
        frmJuego.getContentPane().add(painelA);
        frmJuego.getContentPane().add(painelB);
		
	}
	
	private void jogadaA(int linha, int coluna) {
		
		int temp = 0;
		if(tabuleiroA[linha][coluna] == 1) {
			colocarImagem("/imagens/barco.png",botoesA,linha,coluna,botoesA[linha][coluna].getWidth(), botoesA[linha][coluna].getHeight());
			pontuacaoA++;
			temp = 1;
		}else {
			colocarImagem("/imagens/mar.png",botoesA,linha,coluna,botoesA[linha][coluna].getWidth(), botoesA[linha][coluna].getHeight());
		}
		
		if(pontuacaoA == 20) {
			JOptionPane.showMessageDialog(frmJuego, "Jogador A venceu!");
		}else if(temp == 0){
			
			TimerTask tarefa = new TimerTask() {
			    @Override
			    public void run() {
			        trocarTabuleiro(painelB,"Tabuleiro B");
			    }
			};
			
			timer.schedule(tarefa, milissegundos);
		}
		
	}
	
	private void jogadaB(int linha, int coluna) {
		
		// sistema de pontuação
		int temp = 0;
		if(tabuleiroB[linha][coluna] == 1) {
			//botoesB[linha][coluna].setBackground(new Color(138,27,37)); // vermelho == barco
			colocarImagem("/imagens/barco.png",botoesB,linha,coluna,botoesB[linha][coluna].getWidth(), botoesB[linha][coluna].getHeight());
			pontuacaoB++;
			temp = 1;
		}else {
			//botoesB[linha][coluna].setBackground(new Color(173,234,234));  // azul == mar
			colocarImagem("/imagens/mar.png",botoesB,linha,coluna,botoesB[linha][coluna].getWidth(), botoesB[linha][coluna].getHeight());
		}
		
		
		// verificar se ganhou
		if(pontuacaoB == 20) {
			JOptionPane.showMessageDialog(frmJuego, "Jogador B venceu!");
		}else if (temp == 0){
			
			
			TimerTask tarefa = new TimerTask() {
			    @Override
			    public void run() {
			        trocarTabuleiro(painelA,"Tabuleiro A");
			    }
			};
			
			timer.schedule(tarefa, milissegundos);
			
		}
		
	}
	
	private void trocarTabuleiro(JPanel painel, String nome) {
		
		frmJuego.getContentPane().removeAll();
		frmJuego.getContentPane().add(painel);
		frmJuego.getContentPane().repaint();
		frmJuego.getContentPane().revalidate();
		frmJuego.setTitle(nome);
		
	}
	
	private void colocarImagem(String path, JButton[][] botao, int linha, int coluna, int newWidth, int newHeight) {
		
	    ImageIcon botaoIcon = new ImageIcon(Jogo.class.getResource(path));
	    
	    // Redimensiona as imagens para as dimensões desejadas
	    Image img = botaoIcon.getImage();
	    Image newImg = img.getScaledInstance((newWidth+1), (newHeight+1), java.awt.Image.SCALE_SMOOTH);
	    newIcon = new ImageIcon(newImg);
	    
	    // Define o ícone redimensionado para o botão
	    botao[linha][coluna].setIcon(newIcon);
	    botao[linha][coluna].setDisabledIcon(newIcon);
	}
	
}