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
	  setTitle("���̸� Ű������");
	  setSize(700, 450);
	    
	  setVisible(true);
	 }
	 
	 
	 public void createTabbedPane() throws IOException, InterruptedException{
	  JTabbedPane catpane = new JTabbedPane();
	  add(catpane);
	  //p_button n = new p_button();
	  

	  
	  colorchange = new JLabel("���� ������ �����ϼ���!", SwingConstants.CENTER);
	  colorchange.setBackground(new Color(0xf7f1e3));
	  colorchange.setFont(new Font("HY����B", Font.BOLD, 20));
	  color = new JPanel();
	  color.setLayout(new BorderLayout());
	
	  color.add(colorchange,BorderLayout.NORTH);
	  ChangeColor n = new ChangeColor();
	  color.add(n);
	  color.setBackground(new Color(0xf7f1e3));
	  
	  catpane.addTab("������ ���� �ٲ㺸��", color);
	  
	  
	 
	
 
  
	  
	  raise = new JPanel();
	  
	 
	  RaisingCat r = new RaisingCat();
	  

	 
	  //catraise1 = new JLabel("�Ϳ��� ���̸� Ű��������!");
	  //catraise1.setFont(new Font("a�ǳ�Ű��B", Font.BOLD, 20));
	 // catraise1.setHorizontalAlignment(JLabel.CENTER);
	  
	  raise.setLayout(new BorderLayout());
	  //raise.add(catraise1,BorderLayout.NORTH);
	  raise.add(r);
	
	  
	  catpane.addTab("���̸� Ű������", raise);
	  
	
	 }

	 public static void main(String[] ar) throws IOException, InterruptedException{
	  new Cattab();
	 }
}

