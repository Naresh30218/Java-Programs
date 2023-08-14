package com.awt;

import javax.swing.*;

public class JBtn {
	JBtn(){
		JFrame f = new JFrame();
		JButton b = new JButton("JBTN");
		b.setBounds(50, 80, 80, 50);
		f.add(b);
		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JBtn();

	}

}
