package com.a20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {

    JTextField regNoField, nameField, batchField, deptField, addressField;
    JButton resetBtn, registerBtn, backBtn;

    public RegistrationForm() {

        setTitle("Create Profile");
        setSize(600, 500);
        setLocationRelativeTo(null); // center screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main Panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        // Title
        JLabel title = new JLabel("Registration Form");
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setBounds(200, 30, 300, 30);
        panel.add(title);

        // Labels
        JLabel regNo = new JLabel("Registration no :");
        regNo.setBounds(100, 100, 120, 25);
        panel.add(regNo);

        JLabel name = new JLabel("Student name :");
        name.setBounds(100, 140, 120, 25);
        panel.add(name);

        JLabel batch = new JLabel("Batch :");
        batch.setBounds(100, 180, 120, 25);
        panel.add(batch);

        JLabel dept = new JLabel("Department :");
        dept.setBounds(100, 220, 120, 25);
        panel.add(dept);

        JLabel address = new JLabel("Address :");
        address.setBounds(100, 260, 120, 25);
        panel.add(address);

        // TextFields
        regNoField = new JTextField();
        regNoField.setBounds(240, 100, 200, 25);
        panel.add(regNoField);

        nameField = new JTextField();
        nameField.setBounds(240, 140, 200, 25);
        panel.add(nameField);

        batchField = new JTextField();
        batchField.setBounds(240, 180, 200, 25);
        panel.add(batchField);

        deptField = new JTextField();
        deptField.setBounds(240, 220, 200, 25);
        panel.add(deptField);

        addressField = new JTextField();
        addressField.setBounds(240, 260, 200, 25);
        panel.add(addressField);

        // Buttons
        resetBtn = new JButton("Reset");
        resetBtn.setBounds(180, 320, 100, 35);
        panel.add(resetBtn);

        registerBtn = new JButton("Register");
        registerBtn.setBounds(320, 320, 100, 35);
        panel.add(registerBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(50, 380, 80, 30);
        panel.add(backBtn);

        // Add ActionListener
        resetBtn.addActionListener(this);
        registerBtn.addActionListener(this);
        backBtn.addActionListener(this);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetBtn) {
            regNoField.setText("");
            nameField.setText("");
            batchField.setText("");
            deptField.setText("");
            addressField.setText("");
        }

        if (e.getSource() == registerBtn) {
            JOptionPane.showMessageDialog(this, "Registration Successful!");
        }

        if (e.getSource() == backBtn) {
            JOptionPane.showMessageDialog(this, "Going Back...");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
