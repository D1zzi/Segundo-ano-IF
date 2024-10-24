package exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TesteCard {

	private JFrame frame;
	private JPanel panel_azul;
	private JPanel panel_vermelho;
	private JPanel panel_amarelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteCard window = new TesteCard();
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
	public TesteCard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cores");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Azul");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(panel_azul);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Vermelho");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(panel_vermelho);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Amarelo");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(panel_amarelo);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel_azul = new JPanel();
		panel_azul.setBackground(new Color(100, 149, 237));
		frame.getContentPane().add(panel_azul, "name_4921890478500");
		
		panel_vermelho = new JPanel();
		panel_vermelho.setBackground(new Color(178, 34, 34));
		frame.getContentPane().add(panel_vermelho, "name_4940347122500");
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(panel_vermelho, popupMenu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Teste");
		popupMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Teste2");
		popupMenu.add(mntmNewMenuItem_4);
		
		panel_amarelo = new JPanel();
		panel_amarelo.setBackground(new Color(255, 215, 0));
		frame.getContentPane().add(panel_amarelo, "name_4942291158100");
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
