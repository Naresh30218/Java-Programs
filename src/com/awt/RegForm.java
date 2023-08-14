package com.awt;
import java.awt.*;
import javax.swing.*;
public class RegForm {
	RegForm(){
		JFrame f = new JFrame();
		JPanel p1 = new JPanel();
		JLabel l = new JLabel("Aadhar Registration Form");
		JLabel l1 = new JLabel("Enter Name");
		JLabel l2 = new JLabel("Enter PhoneNo");
		JLabel l3 = new JLabel("Enter Address");
		JTextField t1 = new JTextField(25);
		JTextField t2 = new JTextField(10);
		JTextArea t3 = new JTextArea(3,30);
		JButton b1 = new JButton("Submit");
		b1.setLocation(300,350 );
//		b1.setSize(80, 50);
//		b1.setBounds(50, 80, 80, 80);
		f.setSize(400, 500);
//		f.setLayout(new BorderLayout());
		f.setLayout(new FlowLayout());
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		
		
		f.add(b1);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new RegForm();
	}

}
