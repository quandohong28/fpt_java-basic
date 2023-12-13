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
	private JButton button_reset;
	private JLabel label_value;
	
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
	}
	
	public void init() {
		this.setTitle("Counter");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new CounterListener(this);
		
		button_up = new JButton("UP");
		button_up.addActionListener(ac);
		
		button_down = new JButton("DOWN");
		button_down.addActionListener(ac);
		
		button_reset = new JButton("RESET");
		button_reset.addActionListener(ac);
		
		label_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);
		
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new BorderLayout(12, 12));
		
		jpanel.add(button_up, BorderLayout.WEST);
		jpanel.add(button_down, BorderLayout.EAST);
		jpanel.add(label_value, BorderLayout.CENTER);
		jpanel.add(button_reset, BorderLayout.SOUTH);
		
		this.add(jpanel);
		
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
	
	public void reset() {
		this.counterModel.reset();
		this.label_value.setText(this.counterModel.getValue()+"");
	}
}
