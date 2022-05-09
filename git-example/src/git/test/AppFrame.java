package git.test;

import javax.swing.JFrame;

public class AppFrame extends JFrame{

	public AppFrame() {
		this.setTitle("MyFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,900);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		System.out.println("New line.");
		System.out.println("New line.");
	}
	
}
