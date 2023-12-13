package jpanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Caclculate extends JFrame {
	private static final long serialVersionUID = 1898620177293267065L;

	public Caclculate() {

	}

	public void showCaclculate() {
		String[] buttonValues = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", "/", "C", "=" };
		this.setSize(350, 600);
		this.setBackground(Color.BLACK);
		this.setTitle("Calculate");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField j = new JTextField();
		j.setSize(350, 100);
		this.add(j, BorderLayout.NORTH);
		for (int i = 0; i < buttonValues.length; i++) {
			JButton button = new JButton(buttonValues[i]);
			button.setBackground(new Color(240,240,241));
			this.add(button);

		}
		GridLayout g = new GridLayout(4, 3, 0, 10);
		this.setLayout(g);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Caclculate c = new Caclculate();
		c.showCaclculate();
	}

}
