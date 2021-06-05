package TermProject;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import java.io.IOException;

import javax.swing.ImageIcon;


import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;


public class Cattab extends JFrame{
	JLabel colorchange, catraise, catraise1;
	JPanel color, raise;
	static int i;



	
 public Cattab() throws IOException, InterruptedException{
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  createTabbedPane();
	  setTitle("냥이를 키워보자");
	  setSize(700, 450);
	    
	  setVisible(true);
	 }
	 
	 
	 public void createTabbedPane() throws IOException, InterruptedException{
	  JTabbedPane catpane = new JTabbedPane();
	  add(catpane);
	  //p_button n = new p_button();
	  

	  
	  colorchange = new JLabel("냥이 색상을 선택하세요!", SwingConstants.CENTER);
	  colorchange.setBackground(new Color(0xf7f1e3));
	  colorchange.setFont(new Font("HY나무B", Font.BOLD, 20));
	  color = new JPanel();
	  color.setLayout(new BorderLayout());
	
	  color.add(colorchange,BorderLayout.NORTH);
	  ChangeColor n = new ChangeColor();
	  color.add(n);
	  color.setBackground(new Color(0xf7f1e3));
	  
	  catpane.addTab("냥이의 색을 바꿔보자", color);
	  
	  
	 
	
 
  
	  
	  raise = new JPanel();
	  
	 
	  RaisingCat r = new RaisingCat();
	  

	 
	  //catraise1 = new JLabel("귀여운 냥이를 키워보세요!");
	  //catraise1.setFont(new Font("a피노키오B", Font.BOLD, 20));
	 // catraise1.setHorizontalAlignment(JLabel.CENTER);
	  
	  raise.setLayout(new BorderLayout());
	  //raise.add(catraise1,BorderLayout.NORTH);
	  raise.add(r);
	
	  
	  catpane.addTab("냥이를 키워보자", raise);
	  
	
	 }

	 public static void main(String[] ar) throws IOException, InterruptedException{
	  new Cattab();
	 }
}

