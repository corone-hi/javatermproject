package TermProject;
//package TermProject;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics.*;
import java.awt.color.*;
import java.awt.event.*;
import java.util.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class ChangeColor extends JPanel implements ActionListener{
	static int gray = new Color(221, 221, 221).getRGB();
	static int ivory = new Color(255, 244, 235).getRGB();
	static int orange = new Color(255, 171, 102).getRGB();
	static int purple = new Color(209, 151, 233).getRGB();

	//JButton b_gray, b_ivory, b_purple, b_orange;
	
	JButton[] btn;
	BufferedImage[] catImg;
	
	JPanel p_button, p_img;
	
	Image changeImg;
	ImageIcon grayicon, ivoryicon, purpleicon, orangeicon;
	JLabel ipp;
	
	Image ig, iv, ip, io;
	
	public ChangeColor() throws IOException, InterruptedException {
		
		/*
		RaisingCat cat = new RaisingCat();
		
		cat.one = changeIvory(cat.one);
		
		*/
		
		setLayout(new BorderLayout());
		setBackground(new Color(0xf7f1e3));
		
		catImg = new BufferedImage[5]; 
		catImg[0] = ImageIO.read(new File("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat0.png"));
		catImg[1] = ImageIO.read(new File("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat1.png"));
		catImg[2] = ImageIO.read(new File("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat2.png"));
		catImg[3] = ImageIO.read(new File("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat3.png"));
		catImg[4] = ImageIO.read(new File("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat4.png"));
		
		ig = ImageIO.read(new File("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\gray.png"));
		iv = ImageIO.read(new File("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\ivory.png"));
		ip = ImageIO.read(new File("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\purple.png"));
		io = ImageIO.read(new File("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\orange.png"));
		
		p_button = new JPanel();
		p_button.setLayout(new GridLayout(2,2,10,30));
		p_button.setBackground(new Color(0xf7f1e3));
		
		btn = new JButton[4];
		
		btn[0] = new JButton("회색");
		btn[0].addActionListener(this);
		btn[1] = new JButton("아이보리");
		btn[1].addActionListener(this);
		btn[2] = new JButton("오렌지");
		btn[2].addActionListener(this);
		btn[3] = new JButton("보라");
		btn[3].addActionListener(this);
		
		
		btn[0].setBackground(new Color(217, 217, 217));
		btn[1].setBackground(new Color(255, 255, 235));
		btn[2].setBackground(new Color(255, 179, 102));
		btn[3].setBackground(new Color(217, 179, 255));
		
		
		btn[0].setFont(new Font("HY나무B", Font.PLAIN, 15));
		btn[1].setFont(new Font("HY나무B", Font.PLAIN, 15));
		btn[2].setFont(new Font("HY나무B", Font.PLAIN, 15));
		btn[3].setFont(new Font("HY나무B", Font.PLAIN, 15));
		
		
		p_button.add(btn[0]);
		p_button.add(btn[1]);
		p_button.add(btn[2]);
		p_button.add(btn[3]);
		
		
		
		p_img = new JPanel();
		
		p_img.setBackground(new Color(0xf7f1e3));
		/*
		
		changeImg = catImg[0].getScaledInstance(350,250,Image.SCALE_SMOOTH);
	    changeicon = new ImageIcon(changeImg);
	    ipp = new JLabel(changeicon);
		
	    
		
		changeImg = ig.getScaledInstance(350,250,Image.SCALE_SMOOTH);
	    changeicon = new ImageIcon(changeImg);
	    ipp = new JLabel(changeicon);
	    p_img.add(ipp);
		*/
	    
		changeImg = ig.getScaledInstance(350,250,Image.SCALE_SMOOTH);
	    grayicon = new ImageIcon(changeImg);
	    
	    changeImg = iv.getScaledInstance(350,250,Image.SCALE_SMOOTH);
	    ivoryicon = new ImageIcon(changeImg);
	    
	    changeImg = io.getScaledInstance(350,250,Image.SCALE_SMOOTH);
	    orangeicon = new ImageIcon(changeImg);
	    
	    changeImg = ip.getScaledInstance(350,250,Image.SCALE_SMOOTH);
	    purpleicon = new ImageIcon(changeImg);
	    
	    
	    
	    ipp = new JLabel(grayicon);
	    p_img.add(ipp);
	   
		add(p_button, BorderLayout.EAST);
		add(p_img, BorderLayout.CENTER);
		

		
	}
	

	
	
	public void changeGray(BufferedImage[] image) {
		for(int i = 0; i < 5; i++) {	
			int width = image[i].getWidth();
			int height = image[i].getHeight();
			
			for(int w = 0; w < width; w++) {
				for(int h = 0; h< height; h++) {
					
					/*if(new Color(image.getRGB(w,h)).getRed() == 221 ) {
						image.setRGB(w, h, ivory);
						
					}else */
						
					if (image[i].getRGB(w, h) == (gray)) {
						image[i].setRGB(w, h, gray);
					}else if(image[i].getRGB(w, h) == (ivory)) {
						image[i].setRGB(w, h, gray);
					}else if(image[i].getRGB(w, h) == (purple)) {
						image[i].setRGB(w, h, gray);
					}
					else if(image[i].getRGB(w, h) == (orange)) {
						image[i].setRGB(w, h, gray);
					}
				}
			}
			
			//return image;
			try {
				ImageIO.write(image[i], "png", new File("cat"+i+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
	}
	
	public void changeIvory(BufferedImage[] image) {
		for(int i = 0; i < 5; i++) {	
			int width = image[i].getWidth();
			int height = image[i].getHeight();
			
			for(int w = 0; w < width; w++) {
				for(int h = 0; h< height; h++) {
					
					/*if(new Color(image.getRGB(w,h)).getRed() == 221 ) {
						image.setRGB(w, h, ivory);
						
					}else */
						
					if (image[i].getRGB(w, h) == (gray)) {
						image[i].setRGB(w, h, ivory);
					}else if(image[i].getRGB(w, h) == (ivory)) {
						image[i].setRGB(w, h, ivory);
					}else if(image[i].getRGB(w, h) == (purple)) {
						image[i].setRGB(w, h, ivory);
					}
					else if(image[i].getRGB(w, h) == (orange)) {
						image[i].setRGB(w, h, ivory);
					}
				}
			}
			
			//return image;
			try {
				ImageIO.write(image[i], "png", new File("cat"+i+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void changeOrange(BufferedImage[] image) {
		for(int i = 0; i < 5; i++) {	
			int width = image[i].getWidth();
			int height = image[i].getHeight();
			
			for(int w = 0; w < width; w++) {
				for(int h = 0; h< height; h++) {
					
					/*if(new Color(image.getRGB(w,h)).getRed() == 221 ) {
						image.setRGB(w, h, ivory);
						
					}else */
						
					if (image[i].getRGB(w, h) == (gray)) {
						image[i].setRGB(w, h, orange);
					}else if(image[i].getRGB(w, h) == (ivory)) {
						image[i].setRGB(w, h, orange);
					}else if(image[i].getRGB(w, h) == (purple)) {
						image[i].setRGB(w, h, orange);
					}
					else if(image[i].getRGB(w, h) == (orange)) {
						image[i].setRGB(w, h, orange);
					}
				}
			}
			
			//return image;
			try {
				ImageIO.write(image[i], "png", new File("cat"+i+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void changePurple(BufferedImage[] image) {
		for(int i = 0; i < 5; i++) {	
			int width = image[i].getWidth();
			int height = image[i].getHeight();
			
			for(int w = 0; w < width; w++) {
				for(int h = 0; h< height; h++) {
					
					/*if(new Color(image.getRGB(w,h)).getRed() == 221 ) {
						image.setRGB(w, h, ivory);
						
					}else */
						
					if (image[i].getRGB(w, h) == (gray)) {
						image[i].setRGB(w, h, purple);
					}else if(image[i].getRGB(w, h) == (ivory)) {
						image[i].setRGB(w, h, purple);
					}else if(image[i].getRGB(w, h) == (purple)) {
						image[i].setRGB(w, h, purple);
					}
					else if(image[i].getRGB(w, h) == (orange)) {
						image[i].setRGB(w, h, purple);
					}
				}
			}
			
			//return image;
			try {
				ImageIO.write(image[i], "png", new File("cat"+i+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//String command = e.getActionCommand("회색");
		
		if(e.getSource() == btn[0]) {
			changeGray(catImg);
			ipp.setIcon(grayicon);
			
		}else if(e.getSource() == btn[1]) {
			changeIvory(catImg);
			ipp.setIcon(ivoryicon);
			
		}else if(e.getSource() == btn[2]) {
			changeOrange(catImg);
			ipp.setIcon(orangeicon);
			
		}else if(e.getSource() == btn[3]) {
			changePurple(catImg);
			ipp.setIcon(purpleicon);
			
		}
		
	}

	
	
	
}
