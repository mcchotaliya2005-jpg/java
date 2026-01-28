package com.a22;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ControlsEx implements ItemListener
{
	JFrame frame;
	JCheckBox chk1,chk2;
	JRadioButton rb1,rb2;
	
	public ControlsEx() 
	{
		frame = new JFrame();
		
		chk1 = new JCheckBox("Java");
		chk2 = new JCheckBox("Php");
		rb1 = new JRadioButton("Male");
		rb2 = new JRadioButton("Female");
		
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(rb1);
		frame.add(rb2);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ControlsEx();
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getSource()==chk1)
		{
			System.out.println("Java Clicked");
		}
		if(e.getSource()==chk2)
		{
			System.out.println("Php Clicked");
		}
		if(e.getSource()==rb1)
		{
			System.out.println("Male Clicked");
		}
		if(e.getSource()==rb2)
		{
			System.out.println("Female Clicked");
		}
		
	}
}