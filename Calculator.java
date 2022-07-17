package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField monitor;
	
	double first;
	double second;
	double result;
	String operation=null;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 288, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		monitor = new JTextField();
		monitor.setFont(new Font("Tahoma", Font.BOLD, 18));
		monitor.setBounds(10, 15, 254, 70);
		frame.getContentPane().add(monitor);
		monitor.setColumns(10);
		
		JButton btn_B = new JButton("\uF0E7");
		btn_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(monitor.getText().length()>0) {
					StringBuilder str=new StringBuilder(monitor.getText());
					str.deleteCharAt(monitor.getText().length()-1);
					backSpace=str.toString();
					monitor.setText(backSpace);
				}
			}
		});
		btn_B.setFont(new Font("Wingdings", Font.BOLD, 17));
		btn_B.setBounds(10, 101, 56, 52);
		frame.getContentPane().add(btn_B);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=monitor.getText()+btn_7.getText();
				monitor.setText(number);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_7.setBounds(10, 163, 56, 52);
		frame.getContentPane().add(btn_7);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=monitor.getText()+btn_4.getText();
				monitor.setText(number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_4.setBounds(10, 225, 56, 52);
		frame.getContentPane().add(btn_4);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=monitor.getText()+btn_1.getText();
				monitor.setText(number);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_1.setBounds(10, 287, 56, 52);
		frame.getContentPane().add(btn_1);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=monitor.getText()+btn_0.getText();
				monitor.setText(number);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_0.setBounds(10, 349, 56, 52);
		frame.getContentPane().add(btn_0);
		
		JButton btn_C = new JButton("C");
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monitor.setText(null);
				operation=null;
			}
		});
		btn_C.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_C.setBounds(76, 101, 56, 52);
		frame.getContentPane().add(btn_C);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=monitor.getText()+btn_8.getText();
				monitor.setText(number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_8.setBounds(76, 163, 56, 52);
		frame.getContentPane().add(btn_8);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=monitor.getText()+btn_5.getText();
				monitor.setText(number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_5.setBounds(76, 225, 56, 52);
		frame.getContentPane().add(btn_5);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=monitor.getText()+btn_2.getText();
				monitor.setText(number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_2.setBounds(76, 287, 56, 52);
		frame.getContentPane().add(btn_2);
		
		JButton btn_point = new JButton(".");
		btn_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String check=monitor.getText();
				int flag=0;
				for(int i=0;i<check.length();i++) {
					if(check.charAt(i)=='.') {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					String number=monitor.getText()+btn_point.getText();
					monitor.setText(number);
				}
			}
		});
		btn_point.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_point.setBounds(76, 349, 56, 52);
		frame.getContentPane().add(btn_point);
		
		JButton btn_00 = new JButton("00");
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=monitor.getText()+btn_00.getText();
				monitor.setText(number);
			}
		});
		btn_00.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_00.setBounds(142, 101, 56, 52);
		frame.getContentPane().add(btn_00);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=monitor.getText()+btn_9.getText();
				monitor.setText(number);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_9.setBounds(142, 163, 56, 52);
		frame.getContentPane().add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=monitor.getText()+btn_6.getText();
				monitor.setText(number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_6.setBounds(142, 225, 56, 52);
		frame.getContentPane().add(btn_6);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=monitor.getText()+btn_3.getText();
				monitor.setText(number);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_3.setBounds(142, 287, 56, 52);
		frame.getContentPane().add(btn_3);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operation==null) {
					return;
				}
				second=Double.parseDouble(monitor.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
				}
				monitor.setText(answer);
				operation=null;
			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_equal.setBounds(142, 349, 56, 52);
		frame.getContentPane().add(btn_equal);
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(monitor.getText());
				monitor.setText("");
				operation="+";
			}
		});
		btn_add.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_add.setBounds(208, 101, 56, 52);
		frame.getContentPane().add(btn_add);
		
		JButton btn_subtract = new JButton("-");
		btn_subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(monitor.getText());
				monitor.setText("");
				operation="-";
			}
		});
		btn_subtract.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_subtract.setBounds(208, 163, 56, 52);
		frame.getContentPane().add(btn_subtract);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(monitor.getText());
				monitor.setText("");
				operation="*";
			}
		});
		btn_multiply.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_multiply.setBounds(208, 225, 56, 52);
		frame.getContentPane().add(btn_multiply);
		
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(monitor.getText());
				monitor.setText("");
				operation="/";
			}
		});
		btn_divide.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_divide.setBounds(208, 287, 56, 52);
		frame.getContentPane().add(btn_divide);
		
		JButton btn_percentage = new JButton("%");
		btn_percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(monitor.getText());
				monitor.setText("");
				operation="%";
			}
		});
		btn_percentage.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_percentage.setBounds(208, 349, 56, 52);
		frame.getContentPane().add(btn_percentage);
	}
}
