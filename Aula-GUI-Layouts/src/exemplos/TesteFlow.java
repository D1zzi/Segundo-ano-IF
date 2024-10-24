package exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class TesteFlow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteFlow window = new TesteFlow();
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
	public TesteFlow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_4 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_7 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_6 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_10 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_9_1 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_1);
		
		JButton btnNewButton_9_2 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_2);
		
		JButton btnNewButton_9 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_9_3 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_3);
		
		JButton btnNewButton_9_4 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_4);
		
		JButton btnNewButton_9_6 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_6);
		
		JButton btnNewButton_9_5 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_5);
		
		JButton btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_9_8 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_8);
		
		JButton btnNewButton_9_10 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_10);
		
		JButton btnNewButton_9_9 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_9);
		
		JButton btnNewButton_9_7 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_7);
		
		JButton btnNewButton_9_12 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_12);
		
		JButton btnNewButton_9_14 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_14);
		
		JButton btnNewButton_9_13 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_13);
		
		JButton btnNewButton_9_11 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_11);
		
		JButton btnNewButton_9_16 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_16);
		
		JButton btnNewButton_9_17 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_17);
		
		JButton btnNewButton_9_18 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_18);
		
		JButton btnNewButton_9_15 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_15);
		
		JButton btnNewButton_9_20 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_20);
		
		JButton btnNewButton_9_22 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_22);
		
		JButton btnNewButton_9_21 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_21);
		
		JButton btnNewButton_9_19 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_19);
		
		JButton btnNewButton_9_24 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_24);
		
		JButton btnNewButton_9_25 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_25);
		
		JButton btnNewButton_9_23 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_9_23);
	}

}
