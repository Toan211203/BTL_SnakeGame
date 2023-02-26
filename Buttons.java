package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons extends JFrame implements ActionListener{
	
	JButton button1, button2, button3;
	
	
	Buttons(){
		
		
		
		button1 = new JButton();
		button1.setBounds(200, 200, 200, 40);
		button1.addActionListener(this);
		button1.setText("New game");
		button1.setFocusable(false);
		button1.setFont(new Font("Ink Free",Font.BOLD,15));
		button1.setForeground(Color.green);
		button1.setBackground(Color.black);
		
		button2= new JButton();
		button2.setBounds(200,400,200,40);
		button2.addActionListener(this);
		button2.setText("Exit");
		button2.setFocusable(false);
		button2.setFont(new Font("Ink Free",Font.BOLD,15));
		button2.setForeground(Color.green);
		button2.setBackground(Color.black);
		
		button3= new JButton();
		button3.setBounds(200,400,200,40);
		button3.addActionListener(this);
		button3.setText("Restart?");
		button3.setFocusable(false);
		button3.setFont(new Font("Ink Free",Font.BOLD,20));
		button3.setForeground(Color.green);
		button3.setBackground(Color.black);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		this.setLayout(null);
		this.pack();
		this.setTitle("Snaek gaem!");
		this.setResizable(false);
		this.setSize(600, 600);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
		this.add(button1);
		this.add(button2);
		
		Background img = new Background();
		this.add(img);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
//			System.out.println("nubs");
			 new GameFrame();
		}
		if(e.getSource()==button2) {
			System.exit(0);
		}
		if(e.getSource()==button3) {
			 new GameFrame();
		}	}
}
