package grid_layout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid extends JFrame {
	private static final long serialVersionUID = -1007131558016123258L;

	public Grid() {

	}

	public void showWindow() {
		GridLayout grLayout = new GridLayout(4, 4, 10, 20);

		for (int i = 0; i <= 10; i++) {
			JButton button = new JButton("button " + i);
			this.add(button);
		}

		this.setLayout(grLayout);

		this.setSize(400, 600);
		this.setTitle("Grid Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		Grid window = new Grid();
		window.showWindow();
	}
}
