package chapter22;

import java.awt.Frame;

import javax.swing.JFrame;

import java.awt.Button;

public class Main2 {
	public static void main(String[] args) {
		
		Button btn1;
		
		Frame f = new Frame();
		btn1 = new Button("asd");
		
		f.setTitle("aw");
		f.add(btn1);
		
		
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
		JFrame j = new JFrame();
		j.setContentPane(j);
		
		
	}	
}