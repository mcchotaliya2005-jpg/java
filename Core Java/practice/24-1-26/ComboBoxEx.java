package com.a24;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx 
{
	JFrame frame;
	JComboBox cb;
	String city []= {"Rajkot","Baroda","Surat"};
	ComboBoxEx()
	{
		frame = new JFrame();
		
		cb = new JComboBox(city);
		//cb.setBounds(100, 100, 100, 0);
		
		frame.add(cb);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ComboBoxEx();
	}
}