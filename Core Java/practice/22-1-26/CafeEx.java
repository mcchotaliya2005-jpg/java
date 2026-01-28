package com.a22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class CafeEx extends WindowAdapter implements ActionListener
{
	JFrame frame;
	JLabel l1;
	JCheckBox chk1,chk2,chk3;
	JButton btn1;
	int total = 0;
	
	public CafeEx() 
	{
		frame = new JFrame("Cafe Ordering System");
		
		l1 = new JLabel("Menu");
		l1.setBounds(192, 10, 46, 14);

		chk1 = new JCheckBox("Pizza - Rs. 100");
		chk1.setBounds(167, 40, 130, 23);
		
		chk2 = new JCheckBox("Burger - Rs. 70");
		chk2.setBounds(167, 80, 130, 23);
		
		chk3 = new JCheckBox("Coffee - Rs. 120");
		chk3.setBounds(167, 120, 130, 23);
		
		btn1 = new JButton("Order");
		btn1.setBounds(167, 160, 130, 23);
		
		btn1.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(this);
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	
	@Override
	public void windowClosing(WindowEvent e) 
	{
		int a = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
		if(a==0)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		//System.out.println(a);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		StringBuilder builder = new StringBuilder();
		
		if(e.getSource()==btn1)
		{
			if(chk1.isSelected())
			{
				builder.append("\n Pizza Rs. 100");
				total+=100;
			}
			if(chk2.isSelected())
			{
				builder.append("\n Burger Rs. 70");
				total+=70;
			}
			if(chk3.isSelected())
			{
				builder.append("\n Coffee Rs. 120");
				total+=120;
			}
			builder.append("\n "+total);
			JOptionPane.showMessageDialog(frame,"\n Total Bill is :"+builder.toString());
		}
		
	}
	
}