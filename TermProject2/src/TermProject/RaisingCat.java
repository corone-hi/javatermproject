package TermProject;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics.*;
import java.awt.color.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.Timer;

public class RaisingCat extends JPanel{
   JPanel p_colorChange;
   JPanel p_cat, p_alert;
   JPanel p_button;
   
   private JLabel ipp;
   private JPanel ip;
   ImageIcon cat1;
   
   Timer t1, t2, t3, t4, t5;
   TimerTask T1, T2, T3, T4, T5;

   JLabel alert;
   
   Timer timer;
   TimerTask timertask;
   
   BufferedImage image;
   
   int i = 0;
   
   JButton[] btn;
   
   JButton b_start;
   JLabel warning;
   
   ImageIcon cat11, cat22,cat33,cat44, cat55;
   


   
   public RaisingCat() throws IOException {
	   
	      
	      setLayout(new BorderLayout());
	      
	      setBackground(new Color(0xf7f1e3));
	      
	      p_cat = new JPanel();
	      p_cat.setLayout(new BorderLayout());
	      p_cat.setBackground(new Color(0xf7f1e3));
	      
	      p_alert = new JPanel();
	      p_alert.setBackground(new Color(0xf7f1e3));
	     
	      alert = new JLabel();
	     
	      alert.setOpaque(true);
	      alert.setBackground(new Color(0xf7f1e3));
	      alert.setFont(new Font("HY����B", Font.BOLD, 28));
	      alert.setForeground(new Color(174, 127, 92));
	      alert.setHorizontalAlignment(JLabel.CENTER);
	     
	      
	      p_alert.add(alert);
	      
	      ip = new JPanel();
	      
	      ip.setBackground(new Color(0xf7f1e3));
	      
	      warning = new JLabel("�ؽ����� ���Ŀ��� ������ ������� �ʽ��ϴ�.");
	      warning.setFont(new Font("HY����B", Font.PLAIN, 20));
	      warning.setForeground(Color.red);
	      warning.setHorizontalAlignment(JLabel.CENTER);
	     
	      
	      b_start = new JButton("�����ϱ�");
	      b_start.setFont(new Font("HY����B", Font.PLAIN, 30));
	      b_start.setBackground(new Color(255, 222, 125));
	      
	      b_start.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == b_start) {
						b_start.setVisible(false);
						warning.setVisible(false);
						loading();
					}
				}
			});
	      
	      add(warning, BorderLayout.SOUTH);
	      add(b_start, BorderLayout.CENTER);
	      
	      
	      

	    
	 }
   
   
   	 public void loading() {
   		 
   		  setAlert();

	      cat1 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\TermProject2\\cat0.png");
	      cat11 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\TermProject2\\src\\cat11.jpg");
	      cat22 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\TermProject2\\src\\cat22.jpg");
	      cat33 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\TermProject2\\src\\cat33.jpg");
	      cat44 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\TermProject2\\src\\cat44.jpg");
	      cat55 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\TermProject2\\src\\cat55.jpg");
	      
	     
	      Image catimg = cat1.getImage();
	      Image changeImg = catimg.getScaledInstance(350, 300, Image.SCALE_SMOOTH);
	      ImageIcon chgimg = new ImageIcon(changeImg);
	      
	      
	      
	      ipp = new JLabel(chgimg);
	     
	      ip.add(ipp);
	      
	      
	      btn = new JButton[5];

	      
	      p_cat.add(p_alert, BorderLayout.NORTH);
	      p_cat.add(ip, BorderLayout.CENTER);
	      
	      
	      
	      add(p_cat, BorderLayout.WEST);
	      
	      btn[0] = new JButton("�� �ַ�����");
	      btn[1] = new JButton("���� �ַ�����");
	      btn[2] = new JButton("����Ű��");
	      btn[3] = new JButton("ȭ��� û���ϱ�");
	      btn[4] = new JButton("����ֱ�");
	      
	      btn[0].setBackground(new Color(221, 252, 211));
	      btn[1].setBackground(new Color(211, 252, 221));
	      btn[2].setBackground(new Color(211, 252, 242));
	      btn[3].setBackground(new Color(211, 242, 252));
	      btn[4].setBackground(new Color(211, 221, 252));
	      
	      btn[0].setFont(new Font("HY����B", Font.PLAIN, 15));
	      btn[1].setFont(new Font("HY����B", Font.PLAIN, 15));
	      btn[2].setFont(new Font("HY����B", Font.PLAIN, 15));
	      btn[3].setFont(new Font("HY����B", Font.PLAIN, 15));
	      btn[4].setFont(new Font("HY����B", Font.PLAIN, 15));
	      
	      Timer start = new Timer();
	      TimerTask startTimer = new TimerTask() {

			@Override
			public void run() {
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				cat1 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\TermProject2\\cat2.png");
				
				i++;
				
				i = i % 4;
				
				start.cancel();
			}
	    	  
	      };
	      
	      start.schedule(startTimer, 1000, 5000);

	      
	      t1 =new Timer();
	      T1 = new TimerTask() {
	    	  public void run() {
	    		  ipp.setIcon(chgimg);
	    	  }
	      };
	      
	      t2 =new Timer();
	      T2 = new TimerTask() {
	    	  public void run() {
	    		  ipp.setIcon(chgimg);
	    	  }
	      };
	      
	      t3 =new Timer();
	      T3 = new TimerTask() {
	    	  public void run() {
	    		  ipp.setIcon(chgimg);
	    	  }
	      };
	      
	      t4 =new Timer();
	      T4 = new TimerTask() {
	    	  public void run() {
	    		  ipp.setIcon(chgimg);
	    	  }
	      };
	      
	      t5 =new Timer();
	      T5 = new TimerTask() {
	    	  public void run() {
	    		  ipp.setIcon(chgimg);
	    	  }
	      };
	      

	      
	      btn[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ipp.setIcon(cat11);
		    		alert.setText("�߿�! ���ִ�~");
					t1.schedule(T1, 5000);
		
				}
	    });
	      btn[1].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ipp.setIcon(cat22);
		    		alert.setText("�߿�! ���� �ְ�~��ȣ!");
					t2.schedule(T2, 5000);

				}
	  });
	      btn[2].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ipp.setIcon(cat33);
		    		alert.setText("�߿�! �ÿ��س�");
					t3.schedule(T3, 5000);

				}
	  });
	      btn[3].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ipp.setIcon(cat44);
		    		alert.setText("�߿�! �����س�~");
					t4.schedule(T4, 5000);
				
				}
	  });
	      btn[4].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ipp.setIcon(cat55);
		    		alert.setText("�߿�! ��°� ���� ����~");
					t5.schedule(T5, 5000);
				}
	  });
	      
	      p_button = new JPanel();
	      p_button.setBackground(new Color(0xf7f1e3));
	      
	      p_button.setLayout(new GridLayout(3, 2,10,30));
	      p_button.add(btn[0]);
	      p_button.add(btn[1]);
	      p_button.add(btn[2]);
	      p_button.add(btn[3]);
	      p_button.add(btn[4]);

	      
	     
	      
	      
	      add(p_button, BorderLayout.EAST);
	      
	      
	     
	      
	      
	    
	      
	
   		 
   		 
   	 }
	   
	   /*
	         private void btnGuess1ActionPerformed(java.awt.event.ActionEvent evt) {    
	          timer.cancel();
	          TimerTask task = new TimerTask(){
	             private int i = 0;
	             public void run(){
	             if (i <= 20){
	               lblTimer.setText("" + i++);
	            }
	          }
	      };
	      timer = new Timer();
	      timer.scheduleAtFixedRate(task, 0, 1000);
	    */
	   
	   public void setAlert() {
	         timer = new Timer();
	         timertask  = new TimerTask() {
	            
	            @Override
	            public void run() {
	               
	               String[] message = {"�߿� �߿� (�� �ּ���!)", "�߿� �߿�(�� �ּ���!)", "�߿� �߿� (���� �ּ���!)", "�߿� ! (�����)", "�߿� �߿� (������!)", "�߿� �߿� (ȭ����� ��������)"};
	               
	                  
	               System.out.println(message[i]);
	               
	               alert.setText(message[i]);
	               
	               i++;
	               
	               i = i % 6;
	               
	            }
	            
	         };
	         
	         
	         timer.schedule(timertask, 2000, 15000);
	         
	         
	         
	         //timer.cancel() : ����
	         // ����� �Ұ��ϴ� �Լ� �����ؼ� ���� Ÿ�̸� ���� �ϴ� ���� restart
	         //or purge(): �� Ÿ�̸��� �۾� ��⿭���� ��� �� ��� �۾��� �����մϴ�.
	   };
}
	   
	   
	   