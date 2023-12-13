package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame{

	private static final long serialVersionUID = 1L;

	public MyCalculator() {
		this.setTitle("Calculator");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		
		JTextField textField = new JTextField(32);
		JPanel head = new JPanel();
		head.setLayout(new BorderLayout());
		head.add(textField, BorderLayout.CENTER);
		
		JButton btn_1 = new JButton("1");
		JButton btn_2 = new JButton("2");
		JButton btn_3 = new JButton("3");
		JButton btn_4 = new JButton("4");
		JButton btn_5 = new JButton("5");
		JButton btn_6 = new JButton("6");
		JButton btn_7 = new JButton("7");
		JButton btn_8 = new JButton("8");
		JButton btn_9 = new JButton("9");
		JButton btn_0 = new JButton("0");
		JButton btn_cong = new JButton("+");
		JButton btn_tru = new JButton("-");
		JButton btn_nhan = new JButton("x");
		JButton btn_chia = new JButton(":");
		JButton btn_ketqua = new JButton("=");
		JButton btn_xoa = new JButton("C");
		
		
		JPanel main = new JPanel();
		main.setLayout(new GridLayout(6, 3));
		
		main.add(btn_1);
		main.add(btn_2);
		main.add(btn_3);
		main.add(btn_4);
		main.add(btn_5);
		main.add(btn_6);
		main.add(btn_7);
		main.add(btn_8);
		main.add(btn_9);
		main.add(btn_0);
		main.add(btn_cong);
		main.add(btn_tru);
		main.add(btn_nhan);
		main.add(btn_chia);
		main.add(btn_ketqua);
		main.add(btn_xoa);
		
		this.setLayout(new BorderLayout());
		this.add(head, BorderLayout.NORTH);
		this.add(main, BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalculator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
