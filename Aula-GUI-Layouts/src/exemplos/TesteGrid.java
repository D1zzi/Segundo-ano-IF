package exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TesteGrid {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteGrid window = new TesteGrid();
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
	public TesteGrid() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 2, 10, 10));
		
		JButton btnNewButton_1 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton);
	}

}
