import java.awt.*;
import javax.swing.*;

public class Game {
	
	private static void createWindow() {
		JFrame frame = new JFrame ("2D Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(800, 800));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}


	// Main
	public static void main (String[] args) {
		createWindow();
	}

}
