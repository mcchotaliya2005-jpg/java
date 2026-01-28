package com.a22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm implements ActionListener
{
	JFrame frame;
	JTextField tf1;
	JPasswordField tf2;
	JLabel l1,l2;
	JButton btn1;
	
	public LoginForm()
	{
		frame = new JFrame();//initialization
		
		tf1 = new JTextField();
		tf1.setBounds(120, 40, 200, 25);
		
		tf2 = new JPasswordField();
		tf2.setBounds(120, 90, 200, 25);
		
		
		
		l1 = new JLabel("Enter Email:");
		l1.setBounds(15, 40, 200, 25);
		
		l2 = new JLabel("Enter Password: ");
		l2.setBounds(15, 90, 200, 25);
		
		btn1 = new JButton("Login");
		btn1.setBounds(120, 150, 100, 25);
		
	
		
		btn1.addActionListener(this);
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(l1);
		frame.add(l2);
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);	
	}
	
	public static void main(String[] args) 
	{
		new LoginForm();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String a = tf1.getText().toString();
		String b = tf2.getText().toString();
		
		if(e.getSource()==btn1)
		{
			if(a.equals("a@gmail.com") && b.equals("1234"))
			{
				new CafeEx();
			}
			else
			{
				JOptionPane.showMessageDialog(frame,"\n Login Fail");

			}
		}
		
	}
}