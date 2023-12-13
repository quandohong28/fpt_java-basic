package fisrt_window;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("First App");
		jf.setSize(400, 600);
		jf.setLocation(300, 100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}
}
