package TermProject;
//package TermProject;

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
   
   Timer t1, t2, t3, t4, t5, t6;
   TimerTask T1, T2, T3, T4, T5 ,T6;

   JLabel alert;
   
   Timer timer;
   TimerTask timertask;
   
   BufferedImage image;
   
   int i = 0;
   
   JButton[] btn;
   
   JButton b_start;
   JLabel warning;
   
   ImageIcon cat11, cat22,cat33,cat44, cat55, cat66;
   


   
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
	      alert.setFont(new Font("HY나무B", Font.BOLD, 28));
	      alert.setForeground(new Color(174, 127, 92));
	      alert.setHorizontalAlignment(JLabel.CENTER);
	     
	      
	      p_alert.add(alert);
	      
	      ip = new JPanel();
	      
	      ip.setBackground(new Color(0xf7f1e3));
	      
	      warning = new JLabel("※시작한 이후에는 색상이 변경되지 않습니다.");
	      warning.setFont(new Font("HY나무B", Font.PLAIN, 20));
	      warning.setForeground(Color.red);
	      warning.setHorizontalAlignment(JLabel.CENTER);
	     
	      
	      b_start = new JButton("시작하기");
	      b_start.setFont(new Font("HY나무B", Font.PLAIN, 30));
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

	      cat1 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat0.png");
	  	 ImageIcon cat2 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat2.png");
		 ImageIcon cat3 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat3.png");
		 ImageIcon cat4 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat4.png");
		 ImageIcon cat5 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat0.png");

	      cat11 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat11.jpg");
	      cat22 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat22.jpg");
	      cat33 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat33.jpg");
	      cat44 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat44.jpg");
	      cat55 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat55.jpg");
		  cat66 = new ImageIcon("C:\\Users\\KIMAHHYUN\\Desktop\\JAVA\\Test\\src\\cat66.jpg");
	      
	   
	     
	      ImageIcon chgimg = new ImageIcon(cat1.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH));
	      ImageIcon chgimg1 = new ImageIcon(cat2.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH));
		  ImageIcon chgimg2= new ImageIcon(cat3.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH));
		  ImageIcon chgimg3 = new ImageIcon(cat4.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH));
		  ImageIcon chgimg4 = new ImageIcon(cat5.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH));
		  ImageIcon chgimg5 = new ImageIcon(cat1.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH));
	      
	      
	      ipp = new JLabel(chgimg);
	     
	      ip.add(ipp);
	      
	      
	      btn = new JButton[6];

	      
	      p_cat.add(p_alert, BorderLayout.NORTH);
	      p_cat.add(ip, BorderLayout.CENTER);
	      
	      
	      
	      add(p_cat, BorderLayout.WEST);
	      
	      btn[0] = new JButton("밥 주러가기");
	      btn[1] = new JButton("간식 주러가기");
	      btn[2] = new JButton("목욕시키기");
	      btn[3] = new JButton("화장실 청소하기");
	      btn[4] = new JButton("놀아주기");
		  btn[5] = new JButton("물주러가기");
	      
	      btn[0].setBackground(new Color(221, 252, 211));
	      btn[1].setBackground(new Color(211, 252, 221));
	      btn[2].setBackground(new Color(211, 252, 242));
	      btn[3].setBackground(new Color(211, 242, 252));
	      btn[4].setBackground(new Color(211, 221, 252));
		  btn[5].setBackground(new Color(211, 231, 242));
	      
	      btn[0].setFont(new Font("HY나무B", Font.PLAIN, 15));
	      btn[1].setFont(new Font("HY나무B", Font.PLAIN, 15));
	      btn[2].setFont(new Font("HY나무B", Font.PLAIN, 15));
	      btn[3].setFont(new Font("HY나무B", Font.PLAIN, 15));
	      btn[4].setFont(new Font("HY나무B", Font.PLAIN, 15));
		  btn[5].setFont(new Font("HY나무B", Font.PLAIN, 15));
	      
	     /*Timer start = new Timer();
	      TimerTask startTimer = new TimerTask() {

			@Override
			public void run() {
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				

		  //cat1 = new ImageIcon("cat1.png");
	
				
				i++;
				
				i = i % 4;
				
				start.cancel();
			}
	    	  
	      };
	      
	      start.schedule(startTimer, 1000, 5000);*/

	      
	      t1 =new Timer(true);
	      T1 = new TimerTask() {
	    	  public void run() {
	    		  ipp.setIcon(chgimg);
	    	  }
	      };
	      
	      t2 =new Timer(true);
	      T2 = new TimerTask() {
	    	  public void run() {
	    		  ipp.setIcon(chgimg1);
	    	  }
	      };
	      
	      t3 =new Timer(true);
	      T3 = new TimerTask() {
	    	  public void run() {
	    		  ipp.setIcon(chgimg2);
	    	  }
	      };
	      
	      t4 =new Timer(true);
	      T4 = new TimerTask() {
	    	  public void run() {
	    		  ipp.setIcon(chgimg3);
	    	  }
	      };
	      
	      t5 =new Timer(true);
	      T5 = new TimerTask() {
	    	  public void run() {
	    		  ipp.setIcon(chgimg4);
	    	  }
	      };
		 t6 =new Timer(true);
	      T6 = new TimerTask() {
	    	  public void run() {
	    		  ipp.setIcon(chgimg5);
	    	  }
	      };	      

	      
	      btn[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ipp.setIcon(cat11);
		    		alert.setText("야옹! 맛있다~");
					t1.schedule(T1, 5000);
		
				}
	    });
	      btn[1].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ipp.setIcon(cat22);
		    		alert.setText("야옹! 간식 최고~얏호!");
					t2.schedule(T2, 5000);

				}
	  });
	      btn[2].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ipp.setIcon(cat55);
		    		alert.setText("야옹! 시원해냥");
					t3.schedule(T3, 5000);

				}
	  });
	      btn[3].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ipp.setIcon(cat44);
		    		alert.setText("야옹! 깨끗해냥~");
					t4.schedule(T4, 5000);
				
				}
	  });
	      btn[4].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ipp.setIcon(cat33);
		    		alert.setText("야옹! 노는게 제일 좋아~");
					t5.schedule(T5, 5000);
				}
	  });
	   btn[5].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ipp.setIcon(cat66);
		    		alert.setText("야옹! 역시 물이 최고야~");
					t6.schedule(T6, 5000);
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
		  p_button.add(btn[5]);

	      
	     
	      
	      
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
	               
	               String[] message = {"야옹 야옹 (밥 주세요!)", "야옹 야옹(물 주세요!)", "야옹 야옹 (간식 주세요!)", "야옹 ! (놀아줘)", "야옹 야옹 (냄새나!)", "야옹 야옹 (화장실이 지저분해)"};
	               
	                  
	               System.out.println(message[i]);
	               
	               alert.setText(message[i]);
	               
	               i++;
	               
	               i = i % 6;
	               
	            }
	            
	         };
	         
	         
	         timer.schedule(timertask, 1000, 15000);
	         
	         
	         
	         //timer.cancel() : 중지
	         // 재시작 불가하니 함수 재작해서 새로 타이머 정의 하는 것이 restart
	         //or purge(): 이 타이머의 작업 대기열에서 취소 된 모든 작업을 제거합니다.
	   };
}
	   
	   
	   