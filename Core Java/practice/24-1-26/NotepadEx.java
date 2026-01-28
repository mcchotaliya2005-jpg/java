package com.a24;

import javax.swing.*;    
import java.awt.event.*; 

public class NotepadEx implements ActionListener
{
	JFrame f;    
	JMenuBar mb;    
	JMenu file,edit,help;    
	JMenuItem cut,copy,paste,selectAll;    
	JTextArea ta;
	
	public NotepadEx() 
	{
		f=new JFrame();    
		
		cut=new JMenuItem("cut");    
		copy=new JMenuItem("copy");    
		paste=new JMenuItem("paste");    
		selectAll=new JMenuItem("selectAll");  
		
		mb=new JMenuBar();    
		file=new JMenu("File");    
		edit=new JMenu("Edit");    
		help=new JMenu("Help"); 
		    
		edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);   
		 
		mb.add(file);mb.add(edit);mb.add(help);    
		
		ta=new JTextArea();    
		ta.setBounds(5,5,360,320);   
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		
		f.add(mb);
		f.add(ta);    
		f.setJMenuBar(mb);  
		f.setLayout(null);    
		f.setSize(400,400);    
		f.setVisible(true);    
	}
	
	public static void main(String[] args) 
	{
		new NotepadEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==cut)
		{
			ta.cut();
		}
		if(e.getSource()==copy)
		{
			ta.copy();
		}
		if(e.getSource()==paste)
		{
			ta.paste();
		}
		if(e.getSource()==selectAll)
		{
			ta.selectAll();
		}
		
	}
}