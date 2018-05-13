import java.awt.*;
import javax.swing.*;

public class Game {
	
	private static void createWindow() {
		JFrame frame = new JFrame ("2D Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel text = new JLabel ("Hello", SwingConstants.CENTER);
		text.setPreferredSize(new Dimension(300, 100));
		frame.getContentPane().add(text, BorderLayout.CENTER);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}


	// Main
	public static void main (String[] args) {
		createWindow();
	}

}
