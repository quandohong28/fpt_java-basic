package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame{
	private static final long serialVersionUID = 1L;
	private CounterModel counterModel;
	private JButton button_up;
	private JButton button_down;
	private JLabel label_value;
	
	
	
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
	}
	
	public void init() {
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		
		ActionListener ac = new CounterListener(this);
		
		button_up = new JButton("UP");
		button_up.addActionListener(ac);
		
		button_down = new JButton("DOWN");
		button_down.addActionListener(ac);
		label_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);
		
		JPanel jpanel = new JPanel();
		
		jpanel.setLayout(new BorderLayout());
		jpanel.add(button_up, BorderLayout.WEST);
		jpanel.add(label_value, BorderLayout.CENTER);
		jpanel.add(button_down, BorderLayout.EAST);
		
		this.add(jpanel);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void increment() {
		this.counterModel.increment();
		this.label_value.setText(this.counterModel.getValue()+"");
	}
	
	public void decrement() {
		this.counterModel.decrement();
		this.label_value.setText(this.counterModel.getValue()+"");
	}
}
