package com.a22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class RestaurantSystem {

    public static void main(String[] args) {
        new LoginPage();
    }
}

// -------------------- LOGIN PAGE --------------------

class LoginPage extends JFrame {

    JTextField txtUser;
    JPasswordField txtPass;
    JCheckBox showPass;
    JButton btnLogin;

    LoginPage() {
        setTitle("Login Page");
        setSize(350, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblUser = new JLabel("Username:");
        lblUser.setBounds(30, 30, 100, 25);
        add(lblUser);

        txtUser = new JTextField();
        txtUser.setBounds(130, 30, 150, 25);
        add(txtUser);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(30, 70, 100, 25);
        add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setBounds(130, 70, 150, 25);
        add(txtPass);

        showPass = new JCheckBox("Show Password");
        showPass.setBounds(130, 100, 150, 25);
        add(showPass);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(110, 140, 100, 30);
        add(btnLogin);

        // Show/Hide Logic
        showPass.addActionListener(e -> {
            if (showPass.isSelected()) {
                txtPass.setEchoChar((char) 0);
            } else {
                txtPass.setEchoChar('*');
            }
        });

        // Login Button
        btnLogin.addActionListener(e -> {
            String user = txtUser.getText();
            String pass = new String(txtPass.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {

                // Input Dialog before 2nd Page
                String tableNo = JOptionPane.showInputDialog(this, "Enter Table No:");

                if (tableNo != null && !tableNo.isEmpty()) {
                    new OrderPage(tableNo);
                    dispose();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Login!");
            }
        });

        setVisible(true);
    }
}

// -------------------- ORDER PAGE --------------------

class OrderPage extends JFrame {

    JTextField qty1, qty2;
    JLabel totalLabel;
    String tableNumber;

    OrderPage(String tableNo) {

        this.tableNumber = tableNo;

        setTitle("Order Page");
        setSize(400, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel tableLabel = new JLabel("Table No: " + tableNumber);
        tableLabel.setBounds(20, 10, 200, 25);
        add(tableLabel);

        JLabel item1 = new JLabel("Pizza (100 Rs):");
        item1.setBounds(30, 50, 150, 25);
        add(item1);

        qty1 = new JTextField();
        qty1.setBounds(200, 50, 100, 25);
        add(qty1);

        JLabel item2 = new JLabel("Burger (80 Rs):");
        item2.setBounds(30, 90, 150, 25);
        add(item2);

        qty2 = new JTextField();
        qty2.setBounds(200, 90, 100, 25);
        add(qty2);

        JButton btnTotal = new JButton("Calculate Total");
        btnTotal.setBounds(100, 140, 180, 30);
        add(btnTotal);

        totalLabel = new JLabel("Total: 0");
        totalLabel.setBounds(150, 180, 150, 25);
        add(totalLabel);

        JButton btnSave = new JButton("Save Order");
        btnSave.setBounds(120, 220, 150, 30);
        add(btnSave);

        // Total Calculation
        btnTotal.addActionListener(e -> {
            int q1 = Integer.parseInt(qty1.getText());
            int q2 = Integer.parseInt(qty2.getText());

            int total = (q1 * 100) + (q2 * 80);

            totalLabel.setText("Total: " + total);
        });

        // Save to File (Append Mode)
        btnSave.addActionListener(e -> {
            try {
                FileWriter fw = new FileWriter("orders.txt", true); // true = append
                fw.write("Table No: " + tableNumber + "\n");
                fw.write("Pizza Qty: " + qty1.getText() + "\n");
                fw.write("Burger Qty: " + qty2.getText() + "\n");
                fw.write(totalLabel.getText() + "\n");
                fw.write("-------------------------\n");
                fw.close();

                JOptionPane.showMessageDialog(this, "Order Saved Successfully!");

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        setVisible(true);
    }
}
