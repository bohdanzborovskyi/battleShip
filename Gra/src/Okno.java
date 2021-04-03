import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
 
public class Okno extends JFrame {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		Main main = new Main();
		public static HashMap<String,Integer> ogranicz;
		public static HashMap<String,Integer> ogranicz2;
		public static JButton buttons[][];
		public static JButton buttons1[][];
		public static int plansza[][];
		static JRadioButton rdbtnCiolg,rdbtnSamolot,rdbtnStatek;
		public static ButtonGroup bg,bg1,bg2,wielkosc,polozenie;
		static int rodzaj,wielkosc1,polozenie1;
		public static ImageIcon trawa,wodas,statek,tank,samolot,trawaX,wodasX,statekX,tankX,samolotX;;
		public static int pole[][];
		public static int pole1[][];
		public static int pole2[][];
		public static int pole3[][];
		public static JLabel lblStatus;
		public static int rodzstrzal;
		public static int pam=0;
		public static int ilosc1,ilosc2;
		public static boolean fin=true;
		public static boolean game=true;
		public static int iloscgracz=30;
		public static int ilosckomp=30;
		public static int tab[][];
		public static JLabel Strzaly,Statki;
		public int strzaly=0;
		public static JButton btnNewButton;
		public Okno() 
		{
			//Tworzenie glownego pola
		getContentPane().setForeground(Color.RED);
		setSize(1600,800);
		setBackground(Color.RED);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(450,700));
		getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(22,14));
		buttons = new JButton[22][14];
		buttons1 = new JButton[22][14];
		bg1 = new ButtonGroup();
		bg2 = new ButtonGroup();
		ImageIcon wodas = new ImageIcon("res/woda.jpg");
		ImageIcon trawa = new ImageIcon("res/trawa.jpg");
		ImageIcon statek = new ImageIcon("res/statek.jpg");
		ImageIcon tank = new ImageIcon("res/panzer.jpg");
		ImageIcon samolot = new ImageIcon("res/samolot.jpg");
		ImageIcon wodasX = new ImageIcon("res/wodaX.jpg");
		ImageIcon trawaX = new ImageIcon("res/trawaX.jpg");
		ImageIcon statekX = new ImageIcon("res/statekX.jpg");
		ImageIcon tankX = new ImageIcon("res/panzerX.jpg");
		ImageIcon samolotX = new ImageIcon("res/samolotX.jpg");		
	//	ImageIcon wodas = new ImageIcon(new Main().getClass().getResource("woda.jpg"));
	//	ImageIcon trawa = new ImageIcon("C:\\Users\\Bogus\\Zbidya13\\Gra\\src\\res\\trawa.jpg");
	//	ImageIcon statek = new ImageIcon("C:\\Users\\Bogus\\Zbidya13\\Gra\\src\\res\\statek.jpg");
	//	ImageIcon tank = new ImageIcon("C:\\Users\\Bogus\\Zbidya13\\Gra\\src\\res\\panzer.jpg");
	//	ImageIcon samolot = new ImageIcon("C:\\Users\\Bogus\\Zbidya13\\Gra\\src\\res\\samolot.jpg");
	//	ImageIcon wodasX = new ImageIcon("C:\\Users\\Bogus\\Zbidya13\\Gra\\src\\res\\wodaX.jpg");
	//	ImageIcon trawaX = new ImageIcon("C:\\Users\\Bogus\\Zbidya13\\Gra\\src\\res\\trawaX.jpg");
	//	ImageIcon statekX = new ImageIcon("C:\\Users\\Bogus\\Zbidya13\\Gra\\src\\res\\statekX.jpg");
	//	ImageIcon tankX = new ImageIcon("C:\\Users\\Bogus\\Zbidya13\\Gra\\src\\res\\panzerX.jpg");
	//	ImageIcon samolotX = new ImageIcon("C:\\Users\\Bogus\\Zbidya13\\Gra\\src\\res\\samolotX.jpg");
		pole2=new int[24][16];
		pole=new int [24][16];
		pole1=new int [24][16];
		pole3 =new int[24][16];
		tab = new int [100][100];
		ogranicz = new HashMap<String,Integer>();
		ogranicz.put("Statek_1", 0);
		ogranicz.put("Statek_2", 0);
		ogranicz.put("Statek_3", 0);
		ogranicz.put("Statek_4", 0);
		ogranicz.put("Ciolg_1", 0);
		ogranicz.put("Ciolg_2", 0);
		ogranicz.put("Ciolg_3", 0);
		ogranicz.put("Ciolg_4", 0);
		ogranicz.put("Samolot_1",0);
		ogranicz.put("Samolot_2",0);
		ogranicz.put("Samolot_3",0);
		ogranicz.put("Samolot_4",0);
		
		ogranicz2 = new HashMap<String,Integer>();
		ogranicz2.put("Statek_1", 0);
		ogranicz2.put("Statek_2", 0);
		ogranicz2.put("Statek_3", 0);
		ogranicz2.put("Statek_4", 0);
		ogranicz2.put("Ciolg_1", 0);
		ogranicz2.put("Ciolg_2", 0);
		ogranicz2.put("Ciolg_3", 0);
		ogranicz2.put("Ciolg_4", 0);
		ogranicz2.put("Samolot_1",0);
		ogranicz2.put("Samolot_2",0);
		ogranicz2.put("Samolot_3",0);
		ogranicz2.put("Samolot_4",0);
		Ruch ruch = new Ruch();
		komputer komp = new komputer();
		rodzstrzal =0;
		ilosc1 =30;
		ilosc2=30;
		// Pole woda-ziemia
	    int	plansza [][] =  {
	            {0,0,0,0,0,0,0,0,1,1,1,1,0,0},
	            {0,0,0,0,0,0,0,1,1,1,1,0,0,0},
	            {0,0,0,0,0,0,0,1,1,1,0,0,0,0},
	            {0,0,0,0,0,0,1,1,1,0,0,0,0,0},
	            {0,0,0,0,0,0,1,1,1,0,0,0,0,0},
	            {0,0,0,0,0,1,1,1,1,1,0,0,0,0},
	            {0,0,0,0,0,1,1,1,1,1,0,0,0,0},
	            {0,0,0,0,1,1,1,1,1,1,1,0,0,0},
	            {0,0,0,0,1,1,1,1,1,1,1,0,0,0},
	            {0,0,0,0,1,1,1,1,1,1,1,0,0,0},
	            {0,0,0,0,1,1,1,1,1,1,1,0,0,0},
	            {0,0,0,0,0,0,0,0,1,1,1,1,0,0},
	            {0,0,0,0,0,0,0,1,1,1,1,0,0,0},
	            {0,0,0,0,0,0,1,1,1,1,0,0,0,0},
	            {0,0,0,0,0,0,1,1,1,1,0,0,0,0},
	            {0,0,0,0,0,1,1,1,1,1,0,0,0,0},
	            {0,0,0,1,1,1,1,1,1,0,0,0,0,0},
	            {0,0,0,1,1,1,1,1,0,0,0,0,0,0},
	            {0,0,1,1,1,0,0,0,0,0,0,0,0,0},
	            {1,1,1,1,1,0,0,0,0,0,0,0,0,0},
	            {1,1,1,1,0,0,0,0,0,0,0,0,0,0},
	            {1,1,1,1,0,0,0,0,0,0,0,0,0,0}
	           
	        };
	    copyPole();
	    for(int i=0;i<pole2.length;i++)
	    {
	    	for(int k=0;k<pole2[i].length;k++)
	    	{
	    		pole[i][k]=0;
	    	}
	    } 
	    for(int i=0;i<pole.length;i++)
	    {
	    	for(int k=0;k<pole[i].length;k++)
	    	{
	    		pole[i][k]=0;
	    	}
	    } 
	    for(int i=0;i<pole1.length;i++)
	    {
	    	for(int k=0;k<pole1[i].length;k++)
	    	{
	    		pole1[i][k]=0;
	    	}
	    } 
	    // Rysowanie pola gry
	    for(int i=0;i<plansza.length;i++)
        {
            for(int k=0;k<plansza[i].length;k++)
             {
            	buttons[i][k] = new JButton(i + "x" + k);
        		buttons[i][k].setBounds(10*k, 10*i, 10, 10);
        		panel.add(buttons[i][k]);
        		bg1.add(buttons[i][k]);
        		switch(plansza[i][k])
            	{
            		
            	case 0:
            		buttons[i][k].setIcon(trawa);
            		break;
            	case 1:
            		buttons[i][k].setIcon(wodas);
            		break;
            	}
             }
        }
	     
	    //Uzupelnienie pola technika
		   for(int i=0;i<plansza.length;i++)
	        {
	            for(int k=0;k<plansza[i].length;k++)
	             {
	            	  	int p=i;
	            		int p1=k;
	            		int s =i+1,s1=k+1;
	            		buttons[i][k].addActionListener(new ActionListener()
	            		{
							public void actionPerformed(ActionEvent e) 
							{
								
								if(rodzaj ==1)
								{
									switch(polozenie1)
									{
									case 1:
											if(wielkosc1 == 1)
											{
												if(buttons[p][p1].getIcon().equals(wodas) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1)  && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+1][s1]==0 || pole[s+1][s1]==1)  && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && pole [s][s1]==0)
												{
													if(ogranicz.get("Statek_1")<4)
													{
													pole [s-1][s1-1]=1;
													pole [s-1][s1]=1;
													pole [s-1][s1+1]=1;
													pole [s][s1-1]=1;
													pole [s][s1]=2;
													pole [s][s1+1]=1;
													pole [s+1][s1-1]=1;
													pole [s+1][s1]=1;
													pole [s+1][s1+1]=1;
													buttons[p][p1].setIcon(statek);
													ogranicz.put("Statek_1",ogranicz.get("Statek_1")+1);
													}
												}
											}
											else if(wielkosc1 == 2)
											{
												if(buttons[p][p1].getIcon().equals(wodas) && buttons[p][p1+1].getIcon().equals(wodas) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s-1][s1+2]==0 || pole[s-1][s1+2]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1]==0) && (pole[s][s1+1]==0) && (pole[s][s1+2]==0 || pole[s][s1+2]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+1][s1]==0 || pole[s+1][s1]==1) && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1+2]==0 || pole[s+1][s+2]==1))
												{
													if(ogranicz.get("Statek_2")<3)
													{
													pole[s-1][s1-1]=1;
													pole[s-1][s1]=1;
													pole[s-1][s1+1]=1;
													pole[s-1][s1+2]=1;
													pole[s][s1-1]=1;
													pole[s][s1]=2;
													pole[s][s1+1]=2;
													pole[s][s1+2]=1;
													pole[s+1][s1-1]=1;
													pole[s+1][s1]=1;
													pole[s+1][s1+1]=1;
													pole[s+1][s1+2]=1;
													buttons[p][p1].setIcon(statek);
													buttons[p][p1+1].setIcon(statek);
													ogranicz.put("Statek_2",ogranicz.get("Statek_2")+1);
													}
												}
											}
											else if(wielkosc1 == 3)
											{
												if(buttons[p][p1].getIcon().equals(wodas) && buttons[p][p1+1].getIcon().equals(wodas) &&  buttons[p][p1+2].getIcon().equals(wodas) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s-1][s1+2]==0 || pole[s-1][s1+2]==1) && (pole[s-1][s1+3]==0 || pole[s-1][s1+3]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1]==0) && (pole[s][s1+1]==0) && (pole[s][s1+2]==0) && (pole[s][s1+3]==0 || pole[s][s1+3]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1)  && (pole[s+1][s1]==0 || pole[s+1][s1]==1) &&  (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1+2]==0 || pole[s+1][s1+2]==1)  && (pole[s+1][s1+3]==0 || pole[s+1][s1+3]==1))
												{
													if(ogranicz.get("Statek_3")<2)
													{
													pole[s-1][s1-1]=1;
													pole[s-1][s1]=1;
													pole[s-1][s1+1]=1;
													pole[s-1][s1+2]=1;
													pole[s-1][s1+3]=1;
													pole[s][s1-1]=1;
													pole[s][s1]=2;
													pole[s][s1+1]=2;
													pole[s][s1+2]=2;
													pole[s][s1+3]=1;
													pole[s+1][s1-1]=1;
													pole[s+1][s1]=1;
													pole[s+1][s1+1]=1;
													pole[s+1][s1+2]=1;
													pole[s+1][s1+3]=1;
													buttons[p][p1].setIcon(statek);
													buttons[p][p1+1].setIcon(statek);
													buttons[p][p1+2].setIcon(statek);
													ogranicz.put("Statek_3",ogranicz.get("Statek_3")+1);
													}
												}
											}
											else if(wielkosc1 == 4)
											{
												if(buttons[p][p1].getIcon().equals(wodas) && buttons[p][p1+1].getIcon().equals(wodas) &&  buttons[p][p1+2].getIcon().equals(wodas) && buttons[p][p1+3].getIcon().equals(wodas) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s-1][s1+2]==0 || pole[s-1][s1+2]==1) && (pole[s-1][s1+3]==0 || pole[s-1][s1+3]==1) && (pole[s-1][s1+4]==0 || pole[s-1][s1+4]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1]==0) && (pole[s][s1+1]==0) && (pole[s][s1+2]==0) && (pole[s][s1+3]==0) && (pole[s][s1+4]==0 || pole[s][s1+4]==4) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1)  && (pole[s+1][s1]==0 || pole[s+1][s1]==1) &&  (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1+2]==0 || pole[s+1][s1+2]==1)  && (pole[s+1][s1+3]==0 || pole[s+1][s1+3]==1) &&  (pole[s+1][s1+4]==0 || pole[s+1][s1+4]==1))
												{
													if(ogranicz.get("Statek_4")<1)
													{
													pole[s-1][s1-1]=1;
													pole[s-1][s1]=1;
													pole[s-1][s1+1]=1;
													pole[s-1][s1+2]=1;
													pole[s-1][s1+3]=1;
													pole[s-1][s1+4]=1;
													pole[s][s1-1]=1;
													pole[s][s1]=2;
													pole[s][s1+1]=2;
													pole[s][s1+2]=2;
													pole[s][s1+3]=2;
													pole[s][s1+4]=1;
													pole[s+1][s1-1]=1;
													pole[s+1][s1]=1;
													pole[s+1][s1+1]=1;
													pole[s+1][s1+2]=1;
													pole[s+1][s1+3]=1;
													pole[s+1][s1+4]=1;
													buttons[p][p1].setIcon(statek);
													buttons[p][p1+1].setIcon(statek);
													buttons[p][p1+2].setIcon(statek);
													buttons[p][p1+3].setIcon(statek);
													ogranicz.put("Statek_4",ogranicz.get("Statek_4")+1);
													}
												}
											}
											break;
									case 2:
										if(wielkosc1 == 1)
										{
											if(buttons[p][p1].getIcon().equals(wodas) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1)  && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+1][s1]==0 || pole[s+1][s1]==1)  && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && pole [s][s1]==0)
											{
												while(ogranicz.get("Statek_1")<4)
												{
												pole [s-1][s1-1]=1;
												pole [s-1][s1]=1;
												pole [s-1][s1+1]=1;
												pole [s][s1-1]=1;
												pole [s][s1]=2;
												pole [s][s1+1]=1;
												pole [s+1][s1-1]=1;
												pole [s+1][s1]=1;
												pole [s+1][s1+1]=1;
												buttons[p][p1].setIcon(statek);
												druk();
												ogranicz.put("Statek_1",ogranicz.get("Statek_1")+1);
												}
											}
										} 
										else if(wielkosc1 == 2)
										{
											if(buttons[p][p1].getIcon().equals(wodas) && buttons[p+1][p1].getIcon().equals(wodas) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s][s1]==0) && (pole[s+1][s1]==0) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+2][s1-1]==0 || pole[s+2][s1-1]==1) && (pole[s+2][s1]==0) && (pole[s+2][s1+1]==0 || pole[s+2][s1+1]==1) )
											{
												if(ogranicz.get("Statek_2")<3)
												{
												pole[s-1][s1-1]=1;
												pole[s-1][s1]=1;
												pole[s-1][s1+1]=1;
												pole[s][s1-1]=1;
												pole[s][s1+1]=1;
												pole[s][s1]=2;
												pole[s+1][s1-1]=1;
												pole[s+1][s1]=2;
												pole[s+1][s1+1]=1;
												pole[s+2][s1-1]=1;
												pole[s+2][s1]=1;
												pole[s+2][s1+1]=1;
												buttons[p][p1].setIcon(statek);
												buttons[p+1][p1].setIcon(statek);
												ogranicz.put("Statek_2",ogranicz.get("Statek_2")+1);
												}
											}
										}
										else if(wielkosc1 == 3)
										{
											if(buttons[p][p1].getIcon().equals(wodas) && buttons[p+1][p1].getIcon().equals(wodas) && buttons[p+2][p1].getIcon().equals(wodas) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s][s1]==0) && (pole[s+1][s1]==0) && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+2][s1]==0)  && (pole[s+2][s1-1]==0 || pole[s+2][s1-1]==1)  && (pole[s+2][s1+1]==0 || pole[s+2][s1+1]==1)&& (pole[s+3][s1-1]==0 || pole[s+3][s1-1]==1) && (pole[s+3][s1+1]==0 || pole[s+3][s1+1]==1) && pole[s+3][s1]==0 )
											{
												if(ogranicz.get("Statek_3")<2)
												{
												pole[s-1][s1-1]=1;
												pole[s-1][s1]=1;
												pole[s-1][s1+1]=1;
												pole[s][s1-1]=1;
												pole[s][s1+1]=1;
												pole[s][s1]=2;
												pole[s+1][s1-1]=1;
												pole[s+1][s1]=2;
												pole[s+1][s1+1]=1;
												pole[s+2][s1-1]=1;
												pole[s+2][s1]=2;
												pole[s+2][s1+1]=1;
												pole[s+3][s1-1]=1;
												pole[s+3][s1]=1;
												pole[s+3][s1+1]=1;
												buttons[p][p1].setIcon(statek);
												buttons[p+1][p1].setIcon(statek);
												buttons[p+2][p1].setIcon(statek);
												ogranicz.put("Statek_3",ogranicz.get("Statek_3")+1);
												}
											}
										}
										else if(wielkosc1 == 4)
										{
											if(buttons[p][p1].getIcon().equals(wodas) && buttons[p+1][p1].getIcon().equals(wodas) && buttons[p+2][p1].getIcon().equals(wodas) &&  buttons[p+3][p1].getIcon().equals(wodas) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s][s1]==0) && (pole[s+1][s1]==0) && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+2][s1]==0)  && (pole[s+2][s1-1]==0 || pole[s+2][s1-1]==1) && (pole[s+2][s1+1]==0 || pole[s+2][s1+1]==1)&& (pole[s+3][s1-1]==0 || pole[s+3][s1-1]==1) && (pole[s+3][s1+1]==0 || pole[s+3][s1+1]==1) && pole[s+3][s1]==0 && (pole[s+4][s1-1]==0 || pole[s+4][s1-1]==1) &&  (pole[s+4][s1+1]==0 || pole[s+4][s1+1]==1)&& (pole[s+4][s1]==0 || pole[s+4][s1]==1) )
											{
												if(ogranicz.get("Statek_4")<1)
												{
												pole[s-1][s1-1]=1;
												pole[s-1][s1]=1;
												pole[s-1][s1+1]=1;
												pole[s][s1-1]=1;
												pole[s][s1+1]=1;
												pole[s][s1]=2;
												pole[s+1][s1-1]=1;
												pole[s+1][s1]=2;
												pole[s+1][s1+1]=1;
												pole[s+2][s1-1]=1;
												pole[s+2][s1]=2;
												pole[s+2][s1+1]=1;
												pole[s+3][s1-1]=1;
												pole[s+3][s1]=2;
												pole[s+3][s1+1]=1;
												pole[s+4][s1+1]=1;
												pole[s+4][s1-1]=1;
												pole[s+4][s1]=1;
												buttons[p][p1].setIcon(statek);
												buttons[p+1][p1].setIcon(statek);
												buttons[p+2][p1].setIcon(statek);
												buttons[p+3][p1].setIcon(statek);
												ogranicz.put("Statek_4",ogranicz.get("Statek_4")+1);
												}
											}
										}
										break;
									}
									
								}
								else if(rodzaj==2)
								{
									switch(polozenie1)
									{
										case 1:
											if(wielkosc1 == 1)
											{
												if(buttons[p][p1].getIcon().equals(trawa) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1)  && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+1][s1]==0 || pole[s+1][s1]==1)  && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && pole [s][s1]==0)
												{
													if(ogranicz.get("Ciolg_1")<4)
													{
													pole [s-1][s1-1]=1;
													pole [s-1][s1]=1;
													pole [s-1][s1+1]=1;
													pole [s][s1-1]=1;
													pole [s][s1]=3;
													pole [s][s1+1]=1;
													pole [s+1][s1-1]=1;
													pole [s+1][s1]=1;
													pole [s+1][s1+1]=1;
													buttons[p][p1].setIcon(tank);
													ogranicz.put("Ciolg_1",ogranicz.get("Ciolg_1")+1);
													}
												}
												
											}
											else if(wielkosc1 == 2)
											{
												if(buttons[p][p1].getIcon().equals(trawa) && buttons[p][p1+1].getIcon().equals(trawa) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s-1][s1+2]==0 || pole[s-1][s1+2]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1)  && (pole[s][s1]==0) && (pole[s][s1+1]==0) && (pole[s][s1+2]==0 || pole[s][s1+2]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+1][s1]==0 || pole[s+1][s1]==1) && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1+2]==0 || pole[s+1][s+2]==1))
												{
													if(ogranicz.get("Ciolg_2")<3)
													{
													pole[s-1][s1-1]=1;
													pole[s-1][s1]=1;
													pole[s-1][s1+1]=1;
													pole[s-1][s1+2]=1;
													pole[s][s1-1]=1;
													pole[s][s1]=3;
													pole[s][s1+1]=3;
													pole[s][s1+2]=1;
													pole[s+1][s1-1]=1;
													pole[s+1][s1]=1;
													pole[s+1][s1+1]=1;
													pole[s+1][s1+2]=1;
													buttons[p][p1].setIcon(tank);
													buttons[p][p1+1].setIcon(tank);
													ogranicz.put("Ciolg_2",ogranicz.get("Ciolg_2")+1);
													}
												}
											}
											else if(wielkosc1 == 3)
											{
												if(buttons[p][p1].getIcon().equals(trawa) && buttons[p][p1+1].getIcon().equals(trawa) &&  buttons[p][p1+2].getIcon().equals(trawa) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s-1][s1+2]==0 || pole[s-1][s1+2]==1) && (pole[s-1][s1+3]==0 || pole[s-1][s1+3]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1]==0) && (pole[s][s1+1]==0) && (pole[s][s1+2]==0) && (pole[s][s1+3]==0 || pole[s][s1+3]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1)  && (pole[s+1][s1]==0 || pole[s+1][s1]==1) &&  (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1+2]==0 || pole[s+1][s1+2]==1)  && (pole[s+1][s1+3]==0 || pole[s+1][s1+3]==1))
												{
													if(ogranicz.get("Ciolg_3")<2)
													{
													pole[s-1][s1-1]=1;
													pole[s-1][s1]=1;
													pole[s-1][s1+1]=1;
													pole[s-1][s1+2]=1;
													pole[s-1][s1+3]=1;
													pole[s][s1-1]=1;
													pole[s][s1]=3;
													pole[s][s1+1]=3;
													pole[s][s1+2]=3;
													pole[s][s1+3]=1;
													pole[s+1][s1-1]=1;
													pole[s+1][s1]=1;
													pole[s+1][s1+1]=1;
													pole[s+1][s1+2]=1;
													pole[s+1][s1+3]=1;
													buttons[p][p1].setIcon(tank);
													buttons[p][p1+1].setIcon(tank);
													buttons[p][p1+2].setIcon(tank);
													ogranicz.put("Ciolg_3",ogranicz.get("Ciolg_3")+1);
													}
												}
											}
											else if(wielkosc1 == 4)
											{
												if(buttons[p][p1].getIcon().equals(trawa) && buttons[p][p1+1].getIcon().equals(trawa) &&  buttons[p][p1+2].getIcon().equals(trawa) && buttons[p][p1+3].getIcon().equals(trawa) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s-1][s1+2]==0 || pole[s-1][s1+2]==1) && (pole[s-1][s1+3]==0 || pole[s-1][s1+3]==1) && (pole[s-1][s1+4]==0 || pole[s-1][s1+4]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1]==0) && (pole[s][s1+1]==0) && (pole[s][s1+2]==0) && (pole[s][s1+3]==0) && (pole[s][s1+4]==0 || pole[s][s1+4]==4) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1)  && (pole[s+1][s1]==0 || pole[s+1][s1]==1) &&  (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1+2]==0 || pole[s+1][s1+2]==1)  && (pole[s+1][s1+3]==0 || pole[s+1][s1+3]==1) &&  (pole[s+1][s1+4]==0 || pole[s+1][s1+4]==1))
												{
													if(ogranicz.get("Ciolg_4")<1)
													{
													pole[s-1][s1-1]=1;
													pole[s-1][s1]=1;
													pole[s-1][s1+1]=1;
													pole[s-1][s1+2]=1;
													pole[s-1][s1+3]=1;
													pole[s-1][s1+4]=1;
													pole[s][s1-1]=1;
													pole[s][s1]=3;
													pole[s][s1+1]=3;
													pole[s][s1+2]=3;
													pole[s][s1+3]=3;
													pole[s][s1+4]=1;
													pole[s+1][s1-1]=1;
													pole[s+1][s1]=1;
													pole[s+1][s1+1]=1;
													pole[s+1][s1+2]=1;
													pole[s+1][s1+3]=1;
													pole[s+1][s1+4]=1;
													buttons[p][p1].setIcon(tank);
													buttons[p][p1+1].setIcon(tank);
													buttons[p][p1+2].setIcon(tank);
													buttons[p][p1+3].setIcon(tank);
													ogranicz.put("Ciolg_4",ogranicz.get("Ciolg_4")+1);
													}
												}
											}
											break;
										case 2:
											if(wielkosc1== 1)
											{
												if(buttons[p][p1].getIcon().equals(trawa) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1)  && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+1][s1]==0 || pole[s+1][s1]==1)  && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && pole [s][s1]==0)
												{
													if(ogranicz.get("Ciolg_1")<4)
													{
													pole [s-1][s1-1]=1;
													pole [s-1][s1]=1;
													pole [s-1][s1+1]=1;
													pole [s][s1-1]=1;
													pole [s][s1]=3;
													pole [s][s1+1]=1;
													pole [s+1][s1-1]=1;
													pole [s+1][s1]=1;
													pole [s+1][s1+1]=1;
													buttons[p][p1].setIcon(tank);
													ogranicz.put("Ciolg_1",ogranicz.get("Ciolg_1")+1);
													}
												}							
								          }
											else if(wielkosc1 == 2)
											{
												if(buttons[p][p1].getIcon().equals(trawa) && buttons[p+1][p1].getIcon().equals(trawa) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s][s1]==0) && (pole[s+1][s1]==0) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+2][s1-1]==0 || pole[s+2][s1-1]==1) && (pole[s+2][s1]==0 || pole[s+2][s1]==1) && (pole[s+2][s1+1]==0 || pole[s+2][s1+1]==1) )
												{
													if(ogranicz.get("Ciolg_2")<3)
													{
													pole[s-1][s1-1]=1;
													pole[s-1][s1]=1;
													pole[s-1][s1+1]=1;
													pole[s][s1-1]=1;
													pole[s][s1+1]=1;
													pole[s][s1]=3;
													pole[s+1][s1-1]=1;
													pole[s+1][s1]=3;
													pole[s+1][s1+1]=1;
													pole[s+2][s1-1]=1;
													pole[s+2][s1]=1;
													pole[s+2][s1+1]=1;
													buttons[p][p1].setIcon(tank);
													buttons[p+1][p1].setIcon(tank);
													ogranicz.put("Ciolg_2",ogranicz.get("Ciolg_2")+1);
													}
												}
											}
											else if(wielkosc1 == 3)
											{
												if(buttons[p][p1].getIcon().equals(trawa) && buttons[p+1][p1].getIcon().equals(trawa) && buttons[p+2][p1].getIcon().equals(trawa) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s][s1]==0) && (pole[s+1][s1]==0) && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+2][s1]==0) && (pole[s+2][s1-1]==0 || pole[s+2][s1-1]==1)  && (pole[s+2][s1+1]==0 || pole[s+2][s1+1]==1)&& (pole[s+3][s1-1]==0 || pole[s+3][s1-1]==1) && (pole[s+3][s1+1]==0 || pole[s+3][s1+1]==1) && (pole[s+3][s1]==0 || pole[s+3][s1]==1) )
												{
													if(ogranicz.get("Ciolg_3")<2)
													{
													pole[s-1][s1-1]=1;
													pole[s-1][s1]=1;
													pole[s-1][s1+1]=1;
													pole[s][s1-1]=1;
													pole[s][s1+1]=1;
													pole[s][s1]=3;
													pole[s+1][s1-1]=1;
													pole[s+1][s1]=3;
													pole[s+1][s1+1]=1;
													pole[s+2][s1-1]=1;
													pole[s+2][s1]=3;
													pole[s+2][s1+1]=1;
													pole[s+3][s1-1]=1;
													pole[s+3][s1]=1;
													pole[s+3][s1+1]=1;
													buttons[p][p1].setIcon(tank);
													buttons[p+1][p1].setIcon(tank);
													buttons[p+2][p1].setIcon(tank);
													ogranicz.put("Ciolg_3",ogranicz.get("Ciolg_3")+1);
													}
												}
											}
											else if(wielkosc1 == 4)
											{
												if(buttons[p][p1].getIcon().equals(trawa) && buttons[p+1][p1].getIcon().equals(trawa) && buttons[p+2][p1].getIcon().equals(trawa) &&  buttons[p+3][p1].getIcon().equals(trawa) && (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s][s1]==0) && (pole[s+1][s1]==0) && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+2][s1]==0)  && (pole[s+2][s1-1]==0 || pole[s+2][s1-1]==1) && (pole[s+2][s1+1]==0 || pole[s+2][s1+1]==1)&& (pole[s+3][s1-1]==0 || pole[s+3][s1-1]==1) && (pole[s+3][s1+1]==0 || pole[s+3][s1+1]==1) && pole[s+3][s1]==0 && (pole[s+4][s1-1]==0 || pole[s+4][s1-1]==1) &&  (pole[s+4][s1+1]==0 || pole[s+4][s1+1]==1)&& (pole[s+4][s1]==0 || pole[s+4][s1]==1) )
												{
													if(ogranicz.get("Ciolg_4")<1)
													{
													pole[s-1][s1-1]=1;
													pole[s-1][s1]=1;
													pole[s-1][s1+1]=1;
													pole[s][s1-1]=1;
													pole[s][s1+1]=1;
													pole[s][s1]=3;
													pole[s+1][s1-1]=1;
													pole[s+1][s1]=3;
													pole[s+1][s1+1]=1;
													pole[s+2][s1-1]=1;
													pole[s+2][s1]=3;
													pole[s+2][s1+1]=1;
													pole[s+3][s1-1]=1;
													pole[s+3][s1]=3;
													pole[s+3][s1+1]=1;
													pole[s+4][s1+1]=1;
													pole[s+4][s1-1]=1;
													pole[s+4][s1]=1;
													buttons[p][p1].setIcon(tank);
													buttons[p+1][p1].setIcon(tank);
													buttons[p+2][p1].setIcon(tank);
													buttons[p+3][p1].setIcon(tank);
													ogranicz.put("Ciolg_4",ogranicz.get("Ciolg_4")+1);
													}
												}
											}
											break;
									}
								}
								else if(rodzaj==3)
								{
									switch(polozenie1)
									{
									case 1:
										if(wielkosc1==1)
										{
											if((pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1)  && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+1][s1]==0 || pole[s+1][s1]==1)  && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && pole [s][s1]==0)
											{
												if(ogranicz.get("Samolot_1")<4)
												{
												pole [s-1][s1-1]=1;
												pole [s-1][s1]=1;
												pole [s-1][s1+1]=1;
												pole [s][s1-1]=1;
												pole [s][s1]=4;
												pole [s][s1+1]=1;
												pole [s+1][s1-1]=1;
												pole [s+1][s1]=1;
												pole [s+1][s1+1]=1;
												buttons[p][p1].setIcon(samolot);
												ogranicz.put("Samolot_1",ogranicz.get("Samolot_1")+1);
												}
											}
										}
										else if(wielkosc1 == 2)
										{
											if((pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s-1][s1+2]==0 || pole[s-1][s1+2]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1)  && (pole[s][s1]==0) && (pole[s][s1+1]==0) && (pole[s][s1+2]==0 || pole[s][s1+2]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+1][s1]==0 || pole[s+1][s1]==1) && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1+2]==0 || pole[s+1][s+2]==1))
											{
												if(ogranicz.get("Samolot_2")<3)
												{
												pole[s-1][s1-1]=1;
												pole[s-1][s1]=1;
												pole[s-1][s1+1]=1;
												pole[s-1][s1+2]=1;
												pole[s][s1-1]=1;
												pole[s][s1]=4;
												pole[s][s1+1]=4;
												pole[s][s1+2]=1;
												pole[s+1][s1-1]=1;
												pole[s+1][s1]=1;
												pole[s+1][s1+1]=1;
												pole[s+1][s1+2]=1;
												buttons[p][p1].setIcon(samolot);
												buttons[p][p1+1].setIcon(samolot);
												ogranicz.put("Samolot_2",ogranicz.get("Samolot_2")+1);
												}
											}
										}
										else if(wielkosc1 == 3)
										{
											if((pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s-1][s1+2]==0 || pole[s-1][s1+2]==1) && (pole[s-1][s1+3]==0 || pole[s-1][s1+3]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1]==0) && (pole[s][s1+1]==0) && (pole[s][s1+2]==0) && (pole[s][s1+3]==0 || pole[s][s1+3]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1)  && (pole[s+1][s1]==0 || pole[s+1][s1]==1) &&  (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1+2]==0 || pole[s+1][s1+2]==1)  && (pole[s+1][s1+3]==0 || pole[s+1][s1+3]==1))
											{
												if(ogranicz.get("Samolot_3")<2)
												{
												pole[s-1][s1-1]=1;
												pole[s-1][s1]=1;
												pole[s-1][s1+1]=1;
												pole[s-1][s1+2]=1;
												pole[s-1][s1+3]=1;
												pole[s][s1-1]=1;
												pole[s][s1]=4;
												pole[s][s1+1]=4;
												pole[s][s1+2]=4;
												pole[s][s1+3]=1;
												pole[s+1][s1-1]=1;
												pole[s+1][s1]=1;
												pole[s+1][s1+1]=1;
												pole[s+1][s1+2]=1;
												pole[s+1][s1+3]=1;
												buttons[p][p1].setIcon(samolot);
												buttons[p][p1+1].setIcon(samolot);
												buttons[p][p1+2].setIcon(samolot); 
												ogranicz.put("Samolot_3",ogranicz.get("Samolot_3")+1);
												}
											}
										}
										else if(wielkosc1 == 4)
										{
											if((pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s-1][s1+2]==0 || pole[s-1][s1+2]==1) && (pole[s-1][s1+3]==0 || pole[s-1][s1+3]==1) && (pole[s-1][s1+4]==0 || pole[s-1][s1+4]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1]==0) && (pole[s][s1+1]==0) && (pole[s][s1+2]==0) && (pole[s][s1+3]==0) && (pole[s][s1+4]==0 || pole[s][s1+4]==4) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1)  && (pole[s+1][s1]==0 || pole[s+1][s1]==1) &&  (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1+2]==0 || pole[s+1][s1+2]==1)  && (pole[s+1][s1+3]==0 || pole[s+1][s1+3]==1) &&  (pole[s+1][s1+4]==0 || pole[s+1][s1+4]==1))
											{
												if(ogranicz.get("Samolot_4")<1)
												{
												pole[s-1][s1-1]=1;
												pole[s-1][s1]=1;
												pole[s-1][s1+1]=1;
												pole[s-1][s1+2]=1;
												pole[s-1][s1+3]=1;
												pole[s-1][s1+4]=1;
												pole[s][s1-1]=1;
												pole[s][s1]=4;
												pole[s][s1+1]=4;
												pole[s][s1+2]=4;
												pole[s][s1+3]=4;
												pole[s][s1+4]=1;
												pole[s+1][s1-1]=1;
												pole[s+1][s1]=1;
												pole[s+1][s1+1]=1;
												pole[s+1][s1+2]=1;
												pole[s+1][s1+3]=1;
												pole[s+1][s1+4]=1;
												buttons[p][p1].setIcon(samolot);
												buttons[p][p1+1].setIcon(samolot);
												buttons[p][p1+2].setIcon(samolot);
												buttons[p][p1+3].setIcon(samolot);
												ogranicz.put("Samolot_4",ogranicz.get("Samolot_4")+1);
												}
											}
										}
										break;
									case 2:
										if(wielkosc1==1)
										{
											if((pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1)  && (pole[s][s1]==0) && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+1][s1]==0 || pole[s+1][s1]==1)  && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) )
											{
												if(ogranicz.get("Samolot_1")<4)
												{
												pole [s-1][s1-1]=1;
												pole [s-1][s1]=1;
												pole [s-1][s1+1]=1;
												pole [s][s1-1]=1;
												pole [s][s1]=4;
												pole [s][s1+1]=1;
												pole [s+1][s1-1]=1;
												pole [s+1][s1]=1;
												pole [s+1][s1+1]=1;
												buttons[p][p1].setIcon(samolot);
												ogranicz.put("Samolot_1",ogranicz.get("Samolot_1")+1);
												}
											}
											
										}
										else if(wielkosc1 == 2)
										{
											if((pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s][s1]==0) && (pole[s+1][s1]==0) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+2][s1-1]==0 || pole[s+2][s1-1]==1) && (pole[s+2][s1]==0 || pole[s+2][s1]==1) && (pole[s+2][s1+1]==0 || pole[s+2][s1+1]==1) )
											{
												if(ogranicz.get("Samolot_2")<3)
												{
												pole[s-1][s1-1]=1;
												pole[s-1][s1]=1;
												pole[s-1][s1+1]=1;
												pole[s][s1-1]=1;
												pole[s][s1+1]=1;
												pole[s][s1]=4;
												pole[s+1][s1-1]=1;
												pole[s+1][s1]=4;
												pole[s+1][s1+1]=1;
												pole[s+2][s1-1]=1;
												pole[s+2][s1]=1;
												pole[s+2][s1+1]=1;
												buttons[p][p1].setIcon(samolot);
												buttons[p+1][p1].setIcon(samolot);
												ogranicz.put("Samolot_2",ogranicz.get("Samolot_2")+1);
												}
											}
										}
										else if(wielkosc1 == 3)
										{
											if((pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s][s1]==0) && (pole[s+1][s1]==0) && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+2][s1]==0) && (pole[s+2][s1-1]==0 || pole[s+2][s1-1]==1)  && (pole[s+2][s1+1]==0 || pole[s+2][s1+1]==1)&& (pole[s+3][s1-1]==0 || pole[s+3][s1-1]==1) && (pole[s+3][s1+1]==0 || pole[s+3][s1+1]==1) && (pole[s+3][s1]==0 || pole[s+3][s1]==1) )
											{
												if(ogranicz.get("Samolot_3")<2)
												{
												pole[s-1][s1-1]=1;
												pole[s-1][s1]=1;
												pole[s-1][s1+1]=1;
												pole[s][s1-1]=1;
												pole[s][s1+1]=1;
												pole[s][s1]=4;
												pole[s+1][s1-1]=1;
												pole[s+1][s1]=4;
												pole[s+1][s1+1]=1;
												pole[s+2][s1-1]=1;
												pole[s+2][s1]=4;
												pole[s+2][s1+1]=1;
												pole[s+3][s1-1]=1;
												pole[s+3][s1]=1;
												pole[s+3][s1+1]=1;
												buttons[p][p1].setIcon(samolot);
												buttons[p+1][p1].setIcon(samolot);
												buttons[p+2][p1].setIcon(samolot);
												ogranicz.put("Samolot_3",ogranicz.get("Samolot_3")+1);
												}
											}
										}
										else if(wielkosc1 == 4)
										{
											if( (pole[s-1][s1-1]==0 || pole[s-1][s1-1]==1) && (pole[s-1][s1]==0 || pole[s-1][s1]==1) && (pole[s-1][s1+1]==0 || pole[s-1][s1+1]==1) && (pole[s][s1-1]==0 || pole[s][s1-1]==1) && (pole[s][s1+1]==0 || pole[s][s1+1]==1) && (pole[s][s1]==0) && (pole[s+1][s1]==0) && (pole[s+1][s1+1]==0 || pole[s+1][s1+1]==1) && (pole[s+1][s1-1]==0 || pole[s+1][s1-1]==1) && (pole[s+2][s1]==0)  && (pole[s+2][s1-1]==0 || pole[s+2][s1-1]==1) && (pole[s+2][s1+1]==0 || pole[s+2][s1+1]==1)&& (pole[s+3][s1-1]==0 || pole[s+3][s1-1]==1) && (pole[s+3][s1+1]==0 || pole[s+3][s1+1]==1) && pole[s+3][s1]==0 && (pole[s+4][s1-1]==0 || pole[s+4][s1-1]==1) &&  (pole[s+4][s1+1]==0 || pole[s+4][s1+1]==1)&& (pole[s+4][s1]==0 || pole[s+4][s1]==1) )
											{
												if(ogranicz.get("Samolot_4")<1)
												{
												pole[s-1][s1-1]=1;
												pole[s-1][s1]=1;
												pole[s-1][s1+1]=1;
												pole[s][s1-1]=1;
												pole[s][s1+1]=1;
												pole[s][s1]=4;
												pole[s+1][s1-1]=1;
												pole[s+1][s1]=4;
												pole[s+1][s1+1]=1;
												pole[s+2][s1-1]=1;
												pole[s+2][s1]=4;
												pole[s+2][s1+1]=1;
												pole[s+3][s1-1]=1;
												pole[s+3][s1]=4;
												pole[s+3][s1+1]=1;
												pole[s+4][s1+1]=1;
												pole[s+4][s1-1]=1;
												pole[s+4][s1]=1;
												buttons[p][p1].setIcon(samolot);
												buttons[p+1][p1].setIcon(samolot);
												buttons[p+2][p1].setIcon(samolot);
												buttons[p+3][p1].setIcon(samolot);
												ogranicz.put("Samolot_4",ogranicz.get("Samolot_4")+1);
												}
											}
										}
										break;
									}
								}
								else if(rodzaj==4)
								{
									
									Strzaly.setText("Strzaly: " + Integer.toString(strzaly));
									strzaly++;
									switch(rodzstrzal)
									{
									case 1:
										{
											game=true;
											buttons[Ruch.getKor1()][Ruch.kor2].setIcon(statekX);
											buttons[Ruch.getKor1()][Ruch.kor2].repaint();
											panel.repaint();
											komp.music2();
											ruch.graj();
											
										}break;
									case 2:
										{
											game=true;
											buttons[Ruch.getKor1()][Ruch.kor2].setIcon(tankX);
											buttons[Ruch.getKor1()][Ruch.kor2].repaint();
											panel.repaint();
											komp.music2();
											ruch.graj();
										}break;
									case 3:
										{
											game=true;
											buttons[Ruch.getKor1()][Ruch.kor2].setIcon(samolotX);
											buttons[Ruch.getKor1()][Ruch.kor2].repaint();
											panel.repaint();
											komp.music2();
											ruch.graj();
										}break;
									case 4:
										{
											buttons[Ruch.getKor1()][Ruch.kor2].setIcon(trawaX);
											buttons[Ruch.getKor1()][Ruch.kor2].repaint();
											panel.repaint();
											komp.music();	
											
					        				if(Thread.currentThread().isAlive()==true)
					        				{
											Thread thread = new Thread()
					        				{
					        				    public void run()
					        				    {
					        				    	
					        				    	komp.grajkomp();
					        				    }
					        				  };
				        					
				        					thread.start();
					        				}
											//btnNewButton.doClick();
										}break;
									case 5:
										{
											buttons[Ruch.getKor1()][Ruch.kor2].setIcon(wodasX);
											buttons[Ruch.getKor1()][Ruch.kor2].repaint();
											panel.repaint();
											komp.music3();
											
					        				if(Thread.currentThread().isAlive()==true)
					        				{
											Thread thread = new Thread()
					        				{
					        				    public void run()
					        				    {
					        				    	
					        				    	komp.grajkomp();
					        				    }
					        				  };
				        					
				        					thread.start();
					        				}
											
											//btnNewButton.doClick();
										}break;
									}
								}
							}	            			
	            		});	            	
	            	}                
	        }
		
		
		   
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension (450,700));
		getContentPane().add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(22,14));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		panel_2.setForeground(Color.BLACK);
		getContentPane().add(panel_2, BorderLayout.CENTER);
		//Dodanie przycisku generujacego dodawanie techniki wojennej
		JButton dodajSt = new JButton("Dodaj");
		dodajSt.setVerticalAlignment(SwingConstants.TOP);
		dodajSt.setHorizontalAlignment(SwingConstants.LEADING);
		dodajSt.setAlignmentY(Component.TOP_ALIGNMENT);
		dodajSt.setSize(40, 80);
		
		//Przyciski do wyboru rodzaju techniki
		JRadioButton rdbtnCiolg = new JRadioButton("Panzer");
		rdbtnCiolg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				rodzaj=2;
			}		
		});
		
		JRadioButton rdbtnSamolot = new JRadioButton("Samolot");
		rdbtnSamolot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				rodzaj=3;
			}
		});
		
		JRadioButton rdbtnStatek = new JRadioButton("Statek");
		rdbtnStatek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rodzaj=1;
			}
		});
		
		
		bg = new ButtonGroup();
		bg.add(rdbtnStatek);
		bg.add(rdbtnSamolot);
		bg.add(rdbtnCiolg);
		
		JLabel lblNewLabel = new JLabel("Rodzaj techniki");
		
		JRadioButton radioButton = new JRadioButton("4");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				wielkosc1 = 4;
			}
		});
		
		JRadioButton radioButton_1 = new JRadioButton("3");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				wielkosc1 = 3;
			}
		});
		
		JRadioButton radioButton_2 = new JRadioButton("2");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				wielkosc1 = 2;
			}
		});
		
		JRadioButton radioButton_3 = new JRadioButton("1");
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				wielkosc1 = 1;
			}
		});
		
		JLabel lblWielkosc = new JLabel("Wielkosc");
		
		wielkosc = new ButtonGroup();
		wielkosc.add(radioButton);
		wielkosc.add(radioButton_1);
		wielkosc.add(radioButton_2);
		wielkosc.add(radioButton_3);
		
		JRadioButton rdbtnVertical = new JRadioButton("Vertical");
		rdbtnVertical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				polozenie1 = 2;
			}
		});
		
		JRadioButton rdbtnHorizontal = new JRadioButton("Horizontal");
		rdbtnHorizontal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				polozenie1 = 1;
			}
		});
		
		polozenie = new ButtonGroup();
		
		polozenie.add(rdbtnHorizontal);
		polozenie.add(rdbtnVertical);
		
		JLabel lblPolozenie = new JLabel("Polozenie");
		
		JButton btnPoleKomp = new JButton("Pole komp.");
		btnPoleKomp.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				komp.music1();
				generuj();	
				
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLUE);
		
	    lblStatus = new JLabel("");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		btnNewButton = new JButton("Graj");
		btnNewButton.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				
				try
				{
			    
				Statki.setText("Statki: " + iloscgracz);
				ruch.graj();
				
				
				komp.grajkomp();
				
				}catch(ArrayIndexOutOfBoundsException ex)
				{
			
				}catch(NullPointerException eer)
				{
					
				}
				
				
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton.setBackground(Color.RED);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			    
				komputer komp1 = new komputer();	
				Okno okno1 = new Okno();
				okno1.druk();
				komp1.music4();
			}
		});
		
		JButton btnZapisz = new JButton("Zapisz");
		btnZapisz.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				komp.zapiszDoPliku();
			}
		});
		
		Strzaly = new JLabel("Strzaly:");
		
		Statki = new JLabel("Statki:");
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(81)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(btnRestart)
								.addComponent(btnPoleKomp)
								.addComponent(btnZapisz))
							.addPreferredGap(ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
							.addComponent(dodajSt))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(48)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(Strzaly)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblStatus)
									.addPreferredGap(ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_panel_2.createSequentialGroup()
											.addComponent(lblPolozenie)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(rdbtnHorizontal))
										.addGroup(gl_panel_2.createSequentialGroup()
											.addComponent(lblWielkosc)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(radioButton_3)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(radioButton_2)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(radioButton_1))
										.addGroup(gl_panel_2.createSequentialGroup()
											.addComponent(lblNewLabel)
											.addGap(18)
											.addComponent(rdbtnStatek)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(rdbtnSamolot)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnCiolg)
										.addComponent(radioButton)
										.addComponent(rdbtnVertical)))
								.addComponent(Statki))))
					.addGap(36))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(110)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(77, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(320, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(277))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(dodajSt)
						.addComponent(btnPoleKomp))
					.addGap(33)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnCiolg)
						.addComponent(rdbtnSamolot)
						.addComponent(rdbtnStatek)
						.addComponent(lblNewLabel)
						.addComponent(lblStatus))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(radioButton_1)
						.addComponent(radioButton)
						.addComponent(radioButton_2)
						.addComponent(radioButton_3)
						.addComponent(lblWielkosc))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnVertical)
						.addComponent(rdbtnHorizontal)
						.addComponent(lblPolozenie))
					.addGap(15)
					.addComponent(btnRestart)
					.addGap(38)
					.addComponent(btnZapisz)
					.addGap(71)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(Strzaly))
					.addGap(12)
					.addComponent(Statki)
					.addGap(42))
		);
		
		JLabel lblNewLabel_1 = new JLabel("Develop by ZBodya13");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setForeground(Color.RED);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblBattleship = new JLabel("BATTLESHIP");
		lblBattleship.setFont(new Font("Snap ITC", Font.PLAIN, 59));
		lblBattleship.setBackground(new Color(240, 240, 240));
		lblBattleship.setForeground(Color.RED);
		lblBattleship.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_3.add(lblBattleship);
		panel_2.setLayout(gl_panel_2);

       	
		dodajSt.addActionListener(new ActionListener()
		{
			
				public void actionPerformed(ActionEvent e)
				{					
					
					dodajTechnike(rodzaj);
					
					
				}});
		
		
		
		//Uzupelnienie drugiego pola woda-ziemia
		
		
		for(int i=0;i<plansza.length;i++)
        {
            for(int k=0;k<plansza[i].length;k++)
             {
            	buttons1[i][k] = new JButton(i + "x" + k);
        		buttons1[i][k].setBounds(700+10*k, 10*i, 10, 10);
        		panel_1.add(buttons1[i][k]);
        		bg2.add(buttons1[i][k]);
        		switch(plansza[i][k])
            	{
            		
            	case 0:
            		buttons1[i][k].setIcon(trawa);
            		break;
            	case 1:
            		buttons1[i][k].setIcon(wodas);
            		break;
            	}
             }
        }
		   for(int i=0;i<plansza.length;i++)
	        {
	            for(int k=0;k<plansza[i].length;k++)
	             {
	            	  	int p=i;
	            		int p1=k;
	            		int s =i+1,s1=k+1;
	            		buttons1[i][k].addActionListener(new ActionListener()
	            		{
							public void actionPerformed(ActionEvent e) 
							{
								
								if(rodzaj ==1)
								{
									switch(polozenie1)
									{
									case 1:
											if(wielkosc1 == 1)
											{
												if(buttons1[p][p1].getIcon().equals(wodas) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1)  && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1)  && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && pole1[s][s1]==0)
													{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1;
													pole1[s-1][s1+1]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1]=2;
													pole1[s][s1+1]=1;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=1;
													pole1[s+1][s1+1]=1;
												//	buttons1[p][p1].setIcon(statek);
													ogranicz2.put("Statek_1", ogranicz2.get("Statek_1")+1);
													
												}
											}
											else if(wielkosc1 == 2)
											{
												if(buttons1[p][p1].getIcon().equals(wodas) && buttons1[p][p1+1].getIcon().equals(wodas) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s-1][s1+2]==0 || pole1[s-1][s1+2]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1]==0) && (pole1[s][s1+1]==0) && (pole1[s][s1+2]==0 || pole1[s][s1+2]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1) && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1+2]==0 || pole1[s+1][s+2]==1))
												{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1;
													pole1[s-1][s1+1]=1;
													pole1[s-1][s1+2]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1]=2;
													pole1[s][s1+1]=2;
													pole1[s][s1+2]=1;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=1;
													pole1[s+1][s1+1]=1;
													pole1[s+1][s1+2]=1;
												//	buttons1[p][p1].setIcon(statek);
												//	buttons1[p][p1+1].setIcon(statek);
													ogranicz2.put("Statek_2", ogranicz2.get("Statek_2")+1);
												}
											}
											else if(wielkosc1 == 3)
											{
												if(buttons1[p][p1].getIcon().equals(wodas) && buttons1[p][p1+1].getIcon().equals(wodas) &&  buttons1[p][p1+2].getIcon().equals(wodas) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s-1][s1+2]==0 || pole1[s-1][s1+2]==1) && (pole1[s-1][s1+3]==0 || pole1[s-1][s1+3]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1]==0) && (pole1[s][s1+1]==0) && (pole1[s][s1+2]==0) && (pole1[s][s1+3]==0 || pole1[s][s1+3]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1)  && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1) &&  (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1+2]==0 || pole1[s+1][s1+2]==1)  && (pole1[s+1][s1+3]==0 || pole1[s+1][s1+3]==1))
												{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1;
													pole1[s-1][s1+1]=1;
													pole1[s-1][s1+2]=1;
													pole1[s-1][s1+3]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1]=2;
													pole1[s][s1+1]=2;
													pole1[s][s1+2]=2;
													pole1[s][s1+3]=1;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=1;
													pole1[s+1][s1+1]=1;
													pole1[s+1][s1+2]=1;
													pole1[s+1][s1+3]=1;
												//	buttons1[p][p1].setIcon(statek);
												//	buttons1[p][p1+1].setIcon(statek);
												//	buttons1[p][p1+2].setIcon(statek);
													ogranicz2.put("Statek_3", ogranicz2.get("Statek_3")+1);
												}
											}
											else if(wielkosc1 == 4)
											{
												if(buttons1[p][p1].getIcon().equals(wodas) && buttons1[p][p1+1].getIcon().equals(wodas) &&  buttons1[p][p1+2].getIcon().equals(wodas) && buttons1[p][p1+3].getIcon().equals(wodas) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s-1][s1+2]==0 || pole1[s-1][s1+2]==1) && (pole1[s-1][s1+3]==0 || pole1[s-1][s1+3]==1) && (pole1[s-1][s1+4]==0 || pole1[s-1][s1+4]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1]==0) && (pole1[s][s1+1]==0) && (pole1[s][s1+2]==0) && (pole1[s][s1+3]==0) && (pole1[s][s1+4]==0 || pole1[s][s1+4]==4) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1)  && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1) &&  (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1+2]==0 || pole1[s+1][s1+2]==1)  && (pole1[s+1][s1+3]==0 || pole1[s+1][s1+3]==1) &&  (pole1[s+1][s1+4]==0 || pole1[s+1][s1+4]==1))
												{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1; 
													pole1[s-1][s1+1]=1;
													pole1[s-1][s1+2]=1;
													pole1[s-1][s1+3]=1;
													pole1[s-1][s1+4]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1]=2;
													pole1[s][s1+1]=2;
													pole1[s][s1+2]=2;
													pole1[s][s1+3]=2;
													pole1[s][s1+4]=1;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=1;
													pole1[s+1][s1+1]=1;
													pole1[s+1][s1+2]=1;
													pole1[s+1][s1+3]=1;
													pole1[s+1][s1+4]=1;
												//	buttons1[p][p1].setIcon(statek);
												//	buttons1[p][p1+1].setIcon(statek);
												//	buttons1[p][p1+2].setIcon(statek);
												//	buttons1[p][p1+3].setIcon(statek);
													ogranicz2.put("Statek_4", ogranicz2.get("Statek_4")+1);
												}
											}
											break;
									case 2:
										if(wielkosc1 == 1)
										{
											if(buttons1[p][p1].getIcon().equals(wodas) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1)  && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1)  && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && pole1[s][s1]==0)
											{
											pole1 [s-1][s1-1]=1;
											pole1 [s-1][s1]=1;
											pole1 [s-1][s1+1]=1;
											pole1 [s][s1-1]=1;
											pole1 [s][s1]=2;
											pole1 [s][s1+1]=1;
											pole1 [s+1][s1-1]=1;
											pole1 [s+1][s1]=1;
											pole1 [s+1][s1+1]=1;
										//	buttons1[p][p1].setIcon(statek);
											ogranicz2.put("Statek_1", ogranicz2.get("Statek_1")+1);
											
										}
										} 
										else if(wielkosc1 == 2)
										{
											if(buttons1[p][p1].getIcon().equals(wodas) && buttons1[p+1][p1].getIcon().equals(wodas) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s][s1]==0) && (pole1[s+1][s1]==0) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+2][s1-1]==0 || pole1[s+2][s1-1]==1) && (pole1[s+2][s1]==0) && (pole1[s+2][s1+1]==0 || pole1[s+2][s1+1]==1) )
											{
												pole1[s-1][s1-1]=1;
												pole1[s-1][s1]=1;
												pole1[s-1][s1+1]=1;
												pole1[s][s1-1]=1;
												pole1[s][s1+1]=1;
												pole1[s][s1]=2;
												pole1[s+1][s1-1]=1;
												pole1[s+1][s1]=2;
												pole1[s+1][s1+1]=1;
												pole1[s+2][s1-1]=1;
												pole1[s+2][s1]=1;
												pole1[s+2][s1+1]=1;
											//	buttons1[p][p1].setIcon(statek);
											//	buttons1[p+1][p1].setIcon(statek);
												ogranicz2.put("Statek_2", ogranicz2.get("Statek_2")+1);
											}
										}
										else if(wielkosc1 == 3)
										{
											if(buttons1[p][p1].getIcon().equals(wodas) && buttons1[p+1][p1].getIcon().equals(wodas) && buttons1[p+2][p1].getIcon().equals(wodas) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s][s1]==0) && (pole1[s+1][s1]==0) && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+2][s1]==0)  && (pole1[s+2][s1-1]==0 || pole1[s+2][s1-1]==1)  && (pole1[s+2][s1+1]==0 || pole1[s+2][s1+1]==1)&& (pole1[s+3][s1-1]==0 || pole1[s+3][s1-1]==1) && (pole1[s+3][s1+1]==0 || pole1[s+3][s1+1]==1) && pole1[s+3][s1]==0 )
											{
												pole1[s-1][s1-1]=1;
												pole1[s-1][s1]=1;
												pole1[s-1][s1+1]=1;
												pole1[s][s1-1]=1;
												pole1[s][s1+1]=1;
												pole1[s][s1]=2;
												pole1[s+1][s1-1]=1;
												pole1[s+1][s1]=2;
												pole1[s+1][s1+1]=1;
												pole1[s+2][s1-1]=1;
												pole1[s+2][s1]=2;
												pole1[s+2][s1+1]=1;
												pole1[s+3][s1-1]=1;
												pole1[s+3][s1]=1;
												pole1[s+3][s1+1]=1;
										//	    buttons1[p][p1].setIcon(statek);
										//	    buttons1[p+1][p1].setIcon(statek);
										//		buttons1[p+2][p1].setIcon(statek);
												ogranicz2.put("Statek_3", ogranicz2.get("Statek_3")+1);
											}
										}
										else if(wielkosc1 == 4)
										{
											if(buttons1[p][p1].getIcon().equals(wodas) && buttons1[p+1][p1].getIcon().equals(wodas) && buttons1[p+2][p1].getIcon().equals(wodas) &&  buttons1[p+3][p1].getIcon().equals(wodas) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s][s1]==0) && (pole1[s+1][s1]==0) && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+2][s1]==0)  && (pole1[s+2][s1-1]==0 || pole1[s+2][s1-1]==1) && (pole1[s+2][s1+1]==0 || pole1[s+2][s1+1]==1)&& (pole1[s+3][s1-1]==0 || pole1[s+3][s1-1]==1) && (pole1[s+3][s1+1]==0 || pole1[s+3][s1+1]==1) && pole1[s+3][s1]==0 && (pole1[s+4][s1-1]==0 || pole1[s+4][s1-1]==1) &&  (pole1[s+4][s1+1]==0 || pole1[s+4][s1+1]==1)&& (pole1[s+4][s1]==0 || pole1[s+4][s1]==1) )
											{
												pole1[s-1][s1-1]=1;
												pole1[s-1][s1]=1;
												pole1[s-1][s1+1]=1;
												pole1[s][s1-1]=1;
												pole1[s][s1+1]=1;
												pole1[s][s1]=2;
												pole1[s+1][s1-1]=1;
												pole1[s+1][s1]=2;
												pole1[s+1][s1+1]=1;
												pole1[s+2][s1-1]=1;
												pole1[s+2][s1]=2;
												pole1[s+2][s1+1]=1;
												pole1[s+3][s1-1]=1;
												pole1[s+3][s1]=2;
												pole1[s+3][s1+1]=1;
												pole1[s+4][s1+1]=1;
												pole1[s+4][s1-1]=1;
												pole1[s+4][s1]=1;
										//		buttons1[p][p1].setIcon(statek);
										//		buttons1[p+1][p1].setIcon(statek);
										//		buttons1[p+2][p1].setIcon(statek);
										//		buttons1[p+3][p1].setIcon(statek);
												ogranicz2.put("Statek_4", ogranicz2.get("Statek_4")+1);
											}
										}
										break;
									}
									
								}
								else if(rodzaj==2)
								{
									switch(polozenie1)
									{
										case 1:
											if(wielkosc1 == 1)
											{
												if(buttons1[p][p1].getIcon().equals(trawa) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1)  && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1)  && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && pole1[s][s1]==0)
												{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1;
													pole1[s-1][s1+1]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1]=3;
													pole1[s][s1+1]=1;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=1;
													pole1[s+1][s1+1]=1;
												//	buttons1[p][p1].setIcon(tank);
													ogranicz2.put("Ciolg_1", ogranicz2.get("Ciolg_1")+1);
												}
												
											}
											else if(wielkosc1 == 2)
											{
												if(buttons1[p][p1].getIcon().equals(trawa) && buttons1[p][p1+1].getIcon().equals(trawa) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s-1][s1+2]==0 || pole1[s-1][s1+2]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1)  && (pole1[s][s1]==0) && (pole1[s][s1+1]==0) && (pole1[s][s1+2]==0 || pole1[s][s1+2]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1) && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1+2]==0 || pole1[s+1][s+2]==1))
												{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1;
													pole1[s-1][s1+1]=1;
													pole1[s-1][s1+2]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1]=3;
													pole1[s][s1+1]=3;
													pole1[s][s1+2]=1;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=1;
													pole1[s+1][s1+1]=1;
													pole1[s+1][s1+2]=1;
												//	buttons1[p][p1].setIcon(tank);
												//	buttons1[p][p1+1].setIcon(tank);
													ogranicz2.put("Ciolg_2", ogranicz2.get("Ciolg_2")+1);
												}
											}
											else if(wielkosc1 == 3)
											{
												if(buttons1[p][p1].getIcon().equals(trawa) && buttons1[p][p1+1].getIcon().equals(trawa) &&  buttons1[p][p1+2].getIcon().equals(trawa) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s-1][s1+2]==0 || pole1[s-1][s1+2]==1) && (pole1[s-1][s1+3]==0 || pole1[s-1][s1+3]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1]==0) && (pole1[s][s1+1]==0) && (pole1[s][s1+2]==0) && (pole1[s][s1+3]==0 || pole1[s][s1+3]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1)  && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1) &&  (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1+2]==0 || pole1[s+1][s1+2]==1)  && (pole1[s+1][s1+3]==0 || pole1[s+1][s1+3]==1))
												{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1;
													pole1[s-1][s1+1]=1;
													pole1[s-1][s1+2]=1;
													pole1[s-1][s1+3]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1]=3;
													pole1[s][s1+1]=3;
													pole1[s][s1+2]=3;
													pole1[s][s1+3]=1;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=1;
													pole1[s+1][s1+1]=1;
													pole1[s+1][s1+2]=1;
													pole1[s+1][s1+3]=1;
												//	buttons1[p][p1].setIcon(tank);
												//	buttons1[p][p1+1].setIcon(tank);
												//	buttons1[p][p1+2].setIcon(tank);
													ogranicz2.put("Ciolg_3", ogranicz2.get("Ciolg_3")+1);
												}
											}
											else if(wielkosc1 == 4)
											{
												if(buttons1[p][p1].getIcon().equals(trawa) && buttons1[p][p1+1].getIcon().equals(trawa) &&  buttons1[p][p1+2].getIcon().equals(trawa) && buttons1[p][p1+3].getIcon().equals(trawa) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s-1][s1+2]==0 || pole1[s-1][s1+2]==1) && (pole1[s-1][s1+3]==0 || pole1[s-1][s1+3]==1) && (pole1[s-1][s1+4]==0 || pole1[s-1][s1+4]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1]==0) && (pole1[s][s1+1]==0) && (pole1[s][s1+2]==0) && (pole1[s][s1+3]==0) && (pole1[s][s1+4]==0 || pole1[s][s1+4]==4) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1)  && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1) &&  (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1+2]==0 || pole1[s+1][s1+2]==1)  && (pole1[s+1][s1+3]==0 || pole1[s+1][s1+3]==1) &&  (pole1[s+1][s1+4]==0 || pole1[s+1][s1+4]==1))
												{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1;
													pole1[s-1][s1+1]=1;
													pole1[s-1][s1+2]=1;
													pole1[s-1][s1+3]=1;
													pole1[s-1][s1+4]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1]=3;
													pole1[s][s1+1]=3;
													pole1[s][s1+2]=3;
													pole1[s][s1+3]=3;
													pole1[s][s1+4]=1;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=1;
													pole1[s+1][s1+1]=1;
													pole1[s+1][s1+2]=1;
													pole1[s+1][s1+3]=1;
													pole1[s+1][s1+4]=1;
												//	buttons1[p][p1].setIcon(tank);
												//	buttons1[p][p1+1].setIcon(tank);
												//	buttons1[p][p1+2].setIcon(tank);
												//	buttons1[p][p1+3].setIcon(tank);
													ogranicz2.put("Ciolg_4", ogranicz2.get("Ciolg_4")+1);
												}
											}
											break;
										case 2:
											if(wielkosc1== 1)
											{
												if(buttons1[p][p1].getIcon().equals(trawa) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1)  && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1)  && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && pole1[s][s1]==0)
												{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1;
													pole1[s-1][s1+1]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1]=3;
													pole1[s][s1+1]=1;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=1;
													pole1[s+1][s1+1]=1;
											//		buttons1[p][p1].setIcon(tank);
													ogranicz2.put("Ciolg_1", ogranicz2.get("Ciolg_1")+1);
												}						
								          }
											else if(wielkosc1 == 2)
											{
												if(buttons1[p][p1].getIcon().equals(trawa) && buttons1[p+1][p1].getIcon().equals(trawa) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s][s1]==0) && (pole1[s+1][s1]==0) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+2][s1-1]==0 || pole1[s+2][s1-1]==1) && (pole1[s+2][s1]==0 || pole1[s+2][s1]==1) && (pole1[s+2][s1+1]==0 || pole1[s+2][s1+1]==1) )
												{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1;
													pole1[s-1][s1+1]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1+1]=1;
													pole1[s][s1]=3;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=3;
													pole1[s+1][s1+1]=1;
													pole1[s+2][s1-1]=1;
													pole1[s+2][s1]=1;
													pole1[s+2][s1+1]=1;
												//	buttons1[p][p1].setIcon(tank);
												//	buttons1[p+1][p1].setIcon(tank);
													ogranicz2.put("Ciolg_2", ogranicz2.get("Ciolg_2")+1);
												}
											}
											else if(wielkosc1 == 3)
											{
												if(buttons1[p][p1].getIcon().equals(trawa) && buttons1[p+1][p1].getIcon().equals(trawa) && buttons1[p+2][p1].getIcon().equals(trawa) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s][s1]==0) && (pole1[s+1][s1]==0) && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+2][s1]==0) && (pole1[s+2][s1-1]==0 || pole1[s+2][s1-1]==1)  && (pole1[s+2][s1+1]==0 || pole1[s+2][s1+1]==1)&& (pole1[s+3][s1-1]==0 || pole1[s+3][s1-1]==1) && (pole1[s+3][s1+1]==0 || pole1[s+3][s1+1]==1) && (pole1[s+3][s1]==0 || pole1[s+3][s1]==1) )
												{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1;
													pole1[s-1][s1+1]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1+1]=1;
													pole1[s][s1]=3;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=3;
													pole1[s+1][s1+1]=1;
													pole1[s+2][s1-1]=1;
													pole1[s+2][s1]=3;
													pole1[s+2][s1+1]=1;
													pole1[s+3][s1-1]=1;
													pole1[s+3][s1]=1;
													pole1[s+3][s1+1]=1;
												//	buttons1[p][p1].setIcon(tank);
												//	buttons1[p+1][p1].setIcon(tank);
												//	buttons1[p+2][p1].setIcon(tank);
													ogranicz2.put("Ciolg_3", ogranicz2.get("Ciolg_3")+1);
												}
											}
											else if(wielkosc1 == 4)
											{
												if(buttons1[p][p1].getIcon().equals(trawa) && buttons1[p+1][p1].getIcon().equals(trawa) && buttons1[p+2][p1].getIcon().equals(trawa) &&  buttons1[p+3][p1].getIcon().equals(trawa) && (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s][s1]==0) && (pole1[s+1][s1]==0) && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+2][s1]==0)  && (pole1[s+2][s1-1]==0 || pole1[s+2][s1-1]==1) && (pole1[s+2][s1+1]==0 || pole1[s+2][s1+1]==1)&& (pole1[s+3][s1-1]==0 || pole1[s+3][s1-1]==1) && (pole1[s+3][s1+1]==0 || pole1[s+3][s1+1]==1) && pole1[s+3][s1]==0 && (pole1[s+4][s1-1]==0 || pole1[s+4][s1-1]==1) &&  (pole1[s+4][s1+1]==0 || pole1[s+4][s1+1]==1)&& (pole1[s+4][s1]==0 || pole1[s+4][s1]==1) )
												{
													pole1[s-1][s1-1]=1;
													pole1[s-1][s1]=1;
													pole1[s-1][s1+1]=1;
													pole1[s][s1-1]=1;
													pole1[s][s1+1]=1;
													pole1[s][s1]=3;
													pole1[s+1][s1-1]=1;
													pole1[s+1][s1]=3;
													pole1[s+1][s1+1]=1;
													pole1[s+2][s1-1]=1;
													pole1[s+2][s1]=3;
													pole1[s+2][s1+1]=1;
													pole1[s+3][s1-1]=1;
													pole1[s+3][s1]=3;
													pole1[s+3][s1+1]=1;
													pole1[s+4][s1+1]=1;
													pole1[s+4][s1-1]=1;
													pole1[s+4][s1]=1;
												//	buttons1[p][p1].setIcon(tank);
												//	buttons1[p+1][p1].setIcon(tank);
												//	buttons1[p+2][p1].setIcon(tank);
												//	buttons1[p+3][p1].setIcon(tank);
													ogranicz2.put("Ciolg_4", ogranicz2.get("Ciolg_4")+1);
												}
											}
											break;
									}
								}
								else if(rodzaj==3)
								{
									switch(polozenie1)
									{
									case 1:
										if(wielkosc1==1)
										{
											if((pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1)  && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1)  && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && pole1[s][s1]==0)
											{
												pole1 [s-1][s1-1]=1;
												pole1 [s-1][s1]=1;
												pole1 [s-1][s1+1]=1;
												pole1 [s][s1-1]=1;
												pole1 [s][s1]=4;
												pole1 [s][s1+1]=1;
												pole1 [s+1][s1-1]=1;
												pole1 [s+1][s1]=1;
												pole1 [s+1][s1+1]=1;
											//	buttons1[p][p1].setIcon(samolot);
												ogranicz2.put("Samolot_1", ogranicz2.get("Samolot_1")+1);
											}
										}
										else if(wielkosc1 == 2)
										{
											if((pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s-1][s1+2]==0 || pole1[s-1][s1+2]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1)  && (pole1[s][s1]==0) && (pole1[s][s1+1]==0) && (pole1[s][s1+2]==0 || pole1[s][s1+2]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1) && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1+2]==0 || pole1[s+1][s+2]==1))
											{
												pole1[s-1][s1-1]=1;
												pole1[s-1][s1]=1;
												pole1[s-1][s1+1]=1;
												pole1[s-1][s1+2]=1;
												pole1[s][s1-1]=1;
												pole1[s][s1]=4;
												pole1[s][s1+1]=4;
												pole1[s][s1+2]=1;
												pole1[s+1][s1-1]=1;
												pole1[s+1][s1]=1;
												pole1[s+1][s1+1]=1;
												pole1[s+1][s1+2]=1;
											//	buttons1[p][p1].setIcon(samolot);
											//	buttons1[p][p1+1].setIcon(samolot);
												ogranicz2.put("Samolot_2", ogranicz2.get("Samolot_2")+1);
											}
										}
										else if(wielkosc1 == 3)
										{
											if((pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s-1][s1+2]==0 || pole1[s-1][s1+2]==1) && (pole1[s-1][s1+3]==0 || pole1[s-1][s1+3]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1]==0) && (pole1[s][s1+1]==0) && (pole1[s][s1+2]==0) && (pole1[s][s1+3]==0 || pole1[s][s1+3]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1)  && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1) &&  (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1+2]==0 || pole1[s+1][s1+2]==1)  && (pole1[s+1][s1+3]==0 || pole1[s+1][s1+3]==1))
											{
												pole1[s-1][s1-1]=1;
												pole1[s-1][s1]=1;
												pole1[s-1][s1+1]=1;
												pole1[s-1][s1+2]=1;
												pole1[s-1][s1+3]=1;
												pole1[s][s1-1]=1;
												pole1[s][s1]=4;
												pole1[s][s1+1]=4;
												pole1[s][s1+2]=4;
												pole1[s][s1+3]=1;
												pole1[s+1][s1-1]=1;
												pole1[s+1][s1]=1;
												pole1[s+1][s1+1]=1;
												pole1[s+1][s1+2]=1;
												pole1[s+1][s1+3]=1;
											//	buttons1[p][p1].setIcon(samolot);
											//	buttons1[p][p1+1].setIcon(samolot);
											//	buttons1[p][p1+2].setIcon(samolot); 
												ogranicz2.put("Samolot_3", ogranicz2.get("Samolot_3")+1);
											}
										}
										else if(wielkosc1 == 4)
										{
											if((pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s-1][s1+2]==0 || pole1[s-1][s1+2]==1) && (pole1[s-1][s1+3]==0 || pole1[s-1][s1+3]==1) && (pole1[s-1][s1+4]==0 || pole1[s-1][s1+4]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1]==0) && (pole1[s][s1+1]==0) && (pole1[s][s1+2]==0) && (pole1[s][s1+3]==0) && (pole1[s][s1+4]==0 || pole1[s][s1+4]==4) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1)  && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1) &&  (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1+2]==0 || pole1[s+1][s1+2]==1)  && (pole1[s+1][s1+3]==0 || pole1[s+1][s1+3]==1) &&  (pole1[s+1][s1+4]==0 || pole1[s+1][s1+4]==1))
											{
												pole1[s-1][s1-1]=1;
												pole1[s-1][s1]=1;
												pole1[s-1][s1+1]=1;
												pole1[s-1][s1+2]=1;
												pole1[s-1][s1+3]=1;
												pole1[s-1][s1+4]=1;
												pole1[s][s1-1]=1;
												pole1[s][s1]=4;
												pole1[s][s1+1]=4;
												pole1[s][s1+2]=4;
												pole1[s][s1+3]=4;
												pole1[s][s1+4]=1;
												pole1[s+1][s1-1]=1;
												pole1[s+1][s1]=1;
												pole1[s+1][s1+1]=1;
												pole1[s+1][s1+2]=1;
												pole1[s+1][s1+3]=1;
												pole1[s+1][s1+4]=1;
											//	buttons1[p][p1].setIcon(samolot);
											//	buttons1[p][p1+1].setIcon(samolot);
											//	buttons1[p][p1+2].setIcon(samolot);
											//	buttons1[p][p1+3].setIcon(samolot);
												ogranicz2.put("Samolot_4", ogranicz2.get("Samolot_4")+1);
											}
										}
										break;
									case 2:
										if(wielkosc1==1)
										{
											if((pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1)  && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+1][s1]==0 || pole1[s+1][s1]==1)  && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && pole1[s][s1]==0)
											{
												pole1 [s-1][s1-1]=1;
												pole1 [s-1][s1]=1;
												pole1 [s-1][s1+1]=1;
												pole1 [s][s1-1]=1;
												pole1 [s][s1]=4;
												pole1 [s][s1+1]=1;
												pole1 [s+1][s1-1]=1;
												pole1 [s+1][s1]=1;
												pole1 [s+1][s1+1]=1;
											//	buttons1[p][p1].setIcon(samolot);
												ogranicz2.put("Samolot_1", ogranicz2.get("Samolot_1")+1);
											}
											
										}
										else if(wielkosc1 == 2)
										{
											if((pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s][s1]==0) && (pole1[s+1][s1]==0) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+2][s1-1]==0 || pole1[s+2][s1-1]==1) && (pole1[s+2][s1]==0 || pole1[s+2][s1]==1) && (pole1[s+2][s1+1]==0 || pole1[s+2][s1+1]==1) )
											{
												pole1[s-1][s1-1]=1;
												pole1[s-1][s1]=1;
												pole1[s-1][s1+1]=1;
												pole1[s][s1-1]=1;
												pole1[s][s1+1]=1;
												pole1[s][s1]=4;
												pole1[s+1][s1-1]=1;
												pole1[s+1][s1]=4;
												pole1[s+1][s1+1]=1;
												pole1[s+2][s1-1]=1;
												pole1[s+2][s1]=1;
												pole1[s+2][s1+1]=1;
											//	buttons1[p][p1].setIcon(samolot);
											//	buttons1[p+1][p1].setIcon(samolot);
												ogranicz2.put("Samolot_2", ogranicz2.get("Samolot_2")+1);
											}
										}
										else if(wielkosc1 == 3)
										{
											if((pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s][s1]==0) && (pole1[s+1][s1]==0) && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+2][s1]==0) && (pole1[s+2][s1-1]==0 || pole1[s+2][s1-1]==1)  && (pole1[s+2][s1+1]==0 || pole1[s+2][s1+1]==1)&& (pole1[s+3][s1-1]==0 || pole1[s+3][s1-1]==1) && (pole1[s+3][s1+1]==0 || pole1[s+3][s1+1]==1) && (pole1[s+3][s1]==0 || pole1[s+3][s1]==1) )
											{
												pole1[s-1][s1-1]=1;
												pole1[s-1][s1]=1;
												pole1[s-1][s1+1]=1;
												pole1[s][s1-1]=1;
												pole1[s][s1+1]=1;
												pole1[s][s1]=4;
												pole1[s+1][s1-1]=1;
												pole1[s+1][s1]=4;
												pole1[s+1][s1+1]=1;
												pole1[s+2][s1-1]=1;
												pole1[s+2][s1]=4;
												pole1[s+2][s1+1]=1;
												pole1[s+3][s1-1]=1;
												pole1[s+3][s1]=1;
												pole1[s+3][s1+1]=1;
											//	buttons1[p][p1].setIcon(samolot);
											//	buttons1[p+1][p1].setIcon(samolot);
											//	buttons1[p+2][p1].setIcon(samolot);
												ogranicz2.put("Samolot_3", ogranicz2.get("Samolot_3")+1);
											}
										}
										else if(wielkosc1 == 4)
										{
											if( (pole1[s-1][s1-1]==0 || pole1[s-1][s1-1]==1) && (pole1[s-1][s1]==0 || pole1[s-1][s1]==1) && (pole1[s-1][s1+1]==0 || pole1[s-1][s1+1]==1) && (pole1[s][s1-1]==0 || pole1[s][s1-1]==1) && (pole1[s][s1+1]==0 || pole1[s][s1+1]==1) && (pole1[s][s1]==0) && (pole1[s+1][s1]==0) && (pole1[s+1][s1+1]==0 || pole1[s+1][s1+1]==1) && (pole1[s+1][s1-1]==0 || pole1[s+1][s1-1]==1) && (pole1[s+2][s1]==0)  && (pole1[s+2][s1-1]==0 || pole1[s+2][s1-1]==1) && (pole1[s+2][s1+1]==0 || pole1[s+2][s1+1]==1)&& (pole1[s+3][s1-1]==0 || pole1[s+3][s1-1]==1) && (pole1[s+3][s1+1]==0 || pole1[s+3][s1+1]==1) && pole1[s+3][s1]==0 && (pole1[s+4][s1-1]==0 || pole1[s+4][s1-1]==1) &&  (pole1[s+4][s1+1]==0 || pole1[s+4][s1+1]==1)&& (pole1[s+4][s1]==0 || pole1[s+4][s1]==1) )
											{
												pole1[s-1][s1-1]=1;
												pole1[s-1][s1]=1;
												pole1[s-1][s1+1]=1;
												pole1[s][s1-1]=1;
												pole1[s][s1+1]=1;
												pole1[s][s1]=4;
												pole1[s+1][s1-1]=1;
												pole1[s+1][s1]=4;
												pole1[s+1][s1+1]=1;
												pole1[s+2][s1-1]=1;
												pole1[s+2][s1]=4;
												pole1[s+2][s1+1]=1;
												pole1[s+3][s1-1]=1;
												pole1[s+3][s1]=4;
												pole1[s+3][s1+1]=1;
												pole1[s+4][s1+1]=1;
												pole1[s+4][s1-1]=1;
												pole1[s+4][s1]=1;
											//	buttons1[p][p1].setIcon(samolot);
											//	buttons1[p+1][p1].setIcon(samolot);
											//	buttons1[p+2][p1].setIcon(samolot);
											//	buttons1[p+3][p1].setIcon(samolot);
												ogranicz2.put("Samolot_4", ogranicz2.get("Samolot_4")+1);
											}
										}
										break;
									}
									
									
									
								}
								else if(rodzaj==4) 
								{ 
									
									
				        			if(Okno.pole1[p+1][p1+1]==2)
				        			{
				        				//komp.music2();
				        				pam++;
				        				int s=p+1;
				        				int s1=p1+1;
				        				tab[pam][pam]=p+1;
				        				tab[pam][pam+1]=p1+1;
				        				// Trafil i wokol niego sa jeszcze cele
				        				if( (Okno.pole1[s][s1]!=1 && Okno.pole1[s][s1]!=0) && ((Okno.pole1[s-1][s1-1]!=1 && Okno.pole1[s-1][s1-1]!=0) || (Okno.pole1[s-1][s1]!=1 && Okno.pole1[s-1][s1]!=0) || (Okno.pole1[s-1][s1+1]!=1 && Okno.pole1[s-1][s1+1]!=0) || (Okno.pole1[s][s1-1]!=1 && Okno.pole1[s][s1-1]!=0) || (Okno.pole1[s][s1+1]!=1 && Okno.pole1[s][s1+1]!=0) || (Okno.pole1[s+1][s1-1]!=1 && Okno.pole1[s+1][s1-1]!=0) || (Okno.pole1[s+1][s1]!=1 && Okno.pole1[s+1][s1]!=0) || (Okno.pole1[s+1][s1+1]!=1 && Okno.pole1[s+1][s1+1]!=0)) )
				        				{
				        					lblStatus.setText("Trafiles!");
				        					Okno.pole1[p+1][p1+1]=1;
				        					
				        					Okno.buttons1[p][p1].setIcon(statekX);	
				        					Okno.buttons1[p][p1].repaint();
				        					panel_1.repaint();
				        					komp.music2();
				        					Okno.game=false;
				        					komp.grajkomp();
				        					
				        				}
				        				// Trafil i wokol niego juz nie ma celi
				        				else if( (Okno.pole1[s][s1]!=1 && Okno.pole1[s][s1]!=0) && (Okno.pole1[s-1][s1-1]==1 || Okno.pole1[s-1][s1-1]==0) && (Okno.pole1[s-1][s1]==1 || Okno.pole1[s-1][s1]==0) && (Okno.pole1[s-1][s1+1]==1 || Okno.pole1[s-1][s1+1]==0) && (Okno.pole1[s][s1-1]==1 || Okno.pole1[s][s1-1]==0) && (Okno.pole1[s][s1+1]==1 || Okno.pole1[s][s1+1]==0) && (Okno.pole1[s+1][s1-1]==1 || Okno.pole1[s+1][s1-1]==0) && (Okno.pole1[s+1][s1]==1 || Okno.pole1[s+1][s1]==0) && (Okno.pole1[s+1][s1+1]==1 || Okno.pole1[s+1][s1+1]==0))
				        				{
				        					Okno.pole1[p+1][p1+1]=1;
				        					if(Ruch.sprawdz1(tab[1][1],tab[1][2]))
					        				{
				        						lblStatus.setText("Jeszcze nie wszystko");
				        						
				        						Okno.buttons1[p][p1].setIcon(statekX);
				        						Okno.buttons1[p][p1].repaint();
				        						panel_1.repaint();
				        						komp.music2();
				        						Okno.game=false;
				        						komp.grajkomp();
					        				}
				        					else
				        					{
				        						
				        						lblStatus.setText("Zabiles!");
				        						
				        						pam=0;
				        					    Okno.pole1[p+1][p1+1]=1;
				        					    
				        						Okno.buttons1[p][p1].setIcon(statekX);
				        						Okno.buttons1[p][p1].repaint();
				        						panel_1.repaint();
				        						komp.music2();
				        						iloscgracz--;
				        						Statki.setText("Statki: " + iloscgracz);
				        						if(Okno.iloscgracz<1)
				        						{
				        							Okno.lblStatus.setText("Wygrales!!!");
				        							komp.music5();
				        						}
				        						Okno.game=false;
				        						komp.grajkomp();
				        						
				        					}
				        				}
				        				
				        			}
				        			else if(Okno.pole1[p+1][p1+1]==3)
				        			{
				        				komp.music2();
				        				pam++;
				        				tab[pam][pam]=p+1;
				        				tab[pam][pam+1]=p1+1;
				        				int s=p+1;
				        				int s1=p1+1;
				        				// Trafil i wokol niego sa jeszcze cele
				        				if((Okno.pole1[s][s1]!=1 && Okno.pole1[s][s1]!=0) &&  ((Okno.pole1[s-1][s1-1]!=1 && Okno.pole1[s-1][s1-1]!=0) || (Okno.pole1[s-1][s1]!=1 && Okno.pole1[s-1][s1]!=0) || (Okno.pole1[s-1][s1+1]!=1 && Okno.pole1[s-1][s1+1]!=0) || (Okno.pole1[s][s1-1]!=1 && Okno.pole1[s][s1-1]!=0) || (Okno.pole1[s][s1+1]!=1 && Okno.pole1[s][s1+1]!=0) || (Okno.pole1[s+1][s1-1]!=1 && Okno.pole1[s+1][s1-1]!=0) || (Okno.pole1[s+1][s1]!=1 && Okno.pole1[s+1][s1]!=0) || (Okno.pole1[s+1][s1+1]!=1 && Okno.pole1[s+1][s1+1]!=0)) )
				        				{
				        					lblStatus.setText("Trafiles!");
				        					Okno.pole1[p+1][p1+1]=1;
				        					Okno.buttons1[p][p1].setIcon(tankX);
				        					Okno.buttons1[p][p1].repaint();
				        					panel_1.repaint();
				        					Okno.game=false;
				        					komp.grajkomp();
				        					
				        				}
				        				// Trafil i wokol niego juz nie ma celi
				        				else if((Okno.pole1[s][s1]!=1 && Okno.pole1[s][s1]!=0) && (Okno.pole1[s-1][s1-1]==1 || Okno.pole1[s-1][s1-1]==0) && (Okno.pole1[s-1][s1]==1 || Okno.pole1[s-1][s1]==0) && (Okno.pole1[s-1][s1+1]==1 || Okno.pole1[s-1][s1+1]==0) && (Okno.pole1[s][s1-1]==1 || Okno.pole1[s][s1-1]==0) && (Okno.pole1[s][s1+1]==1 || Okno.pole1[s][s1+1]==0) && (Okno.pole1[s+1][s1-1]==1 || Okno.pole1[s+1][s1-1]==0) && (Okno.pole1[s+1][s1]==1 || Okno.pole1[s+1][s1]==0) && (Okno.pole1[s+1][s1+1]==1 || Okno.pole1[s+1][s1+1]==0))
				        				{
				        					Okno.pole1[p+1][p1+1]=1;
				        					if(Ruch.sprawdz1(tab[1][1],tab[1][2]))
					        				{
				        						
				        						lblStatus.setText("Jeszcze nie wszystko");
				        						
				        						Okno.buttons1[p][p1].setIcon(tankX);
				        						Okno.buttons1[p][p1].repaint();
				        						panel_1.repaint();
				        						Okno.game=false;
				        						komp.grajkomp();
				        						
					        				}
				        					else
				        					{
				        						
				        						lblStatus.setText("Zabiles!");
				        						//Okno.pole1[p+1][p1+1]=1;
				        						pam=0;
				        						Okno.buttons1[p][p1].setIcon(tankX);
				        						Okno.buttons1[p][p1].repaint();
				        						panel_1.repaint();
				        						iloscgracz--;
				        						Statki.setText("Statki: " + iloscgracz);
				        						if(Okno.iloscgracz<1)
				        						{
				        							Okno.lblStatus.setText("Wygrales!!!");
				        							komp.music5();
				        						}
				        						Okno.game=false;
				        						komp.grajkomp();
				        					}
				        					
				        				}	
				        				
				        				
				        				
				        			}
				        			else if(Okno.pole1[p+1][p1+1]==4)
				        			{
				        				komp.music2();
				        				pam++;
				        				tab[pam][pam]=p+1;
				        				tab[pam][pam+1]=p1+1;
				        				int s=p+1;
				        				int s1=p1+1;
				        				// Trafil i wokol niego sa jeszcze cele
				        				if((Okno.pole1[s][s1]!=1 && Okno.pole1[s][s1]!=0) &&  ((Okno.pole1[s-1][s1-1]!=1 && Okno.pole1[s-1][s1-1]!=0) || (Okno.pole1[s-1][s1]!=1 && Okno.pole1[s-1][s1]!=0) || (Okno.pole1[s-1][s1+1]!=1 && Okno.pole1[s-1][s1+1]!=0) || (Okno.pole1[s][s1-1]!=1 && Okno.pole1[s][s1-1]!=0) || (Okno.pole1[s][s1+1]!=1 && Okno.pole1[s][s1+1]!=0) || (Okno.pole1[s+1][s1-1]!=1 && Okno.pole1[s+1][s1-1]!=0) || (Okno.pole1[s+1][s1]!=1 && Okno.pole1[s+1][s1]!=0) || (Okno.pole1[s+1][s1+1]!=1 && Okno.pole1[s+1][s1+1]!=0)) )
				        				{
				        					lblStatus.setText("Trafiles!");
				        		     		Okno.pole1[p+1][p1+1]=1;
				        					Okno.buttons1[p][p1].setIcon(samolotX);
				        					Okno.buttons1[p][p1].repaint();
				        					panel_1.repaint();
				        					Okno.game=false;
				        					komp.grajkomp();
				        					
				        				}
				        				// Trafil i wokol niego juz nie ma celi
				        				else if((Okno.pole1[s][s1]!=1 && Okno.pole1[s][s1]!=0) && (Okno.pole1[s-1][s1-1]==1 || Okno.pole1[s-1][s1-1]==0) && (Okno.pole1[s-1][s1]==1 || Okno.pole1[s-1][s1]==0) && (Okno.pole1[s-1][s1+1]==1 || Okno.pole1[s-1][s1+1]==0) && (Okno.pole1[s][s1-1]==1 || Okno.pole1[s][s1-1]==0) && (Okno.pole1[s][s1+1]==1 || Okno.pole1[s][s1+1]==0) && (Okno.pole1[s+1][s1-1]==1 || Okno.pole1[s+1][s1-1]==0) && (Okno.pole1[s+1][s1]==1 || Okno.pole1[s+1][s1]==0) && (Okno.pole1[s+1][s1+1]==1 || Okno.pole1[s+1][s1+1]==0))
				        				{
				        					Okno.pole1[p+1][p1+1]=1;
				        					if(Ruch.sprawdz1(tab[1][1],tab[1][2])) 
					        				{
				        						
				        						lblStatus.setText("Jeszcze nie wszystko");
				        						
				        						Okno.buttons1[p][p1].setIcon(samolotX);
				        						Okno.buttons1[p][p1].repaint();
				        						panel.repaint();
				        						Okno.game=false;
				        						komp.grajkomp();
				        						
					        				}
				        					else
				        					{
				        						
				        						lblStatus.setText("Zabiles!");
				        						pam=0;
				        						//Okno.pole1[p+1][p1+1]=1;
				        						Okno.buttons1[p][p1].setIcon(samolotX);
				        						Okno.buttons1[p][p1].repaint();
				        						panel_1.repaint();
				        						iloscgracz--;
				        						Statki.setText("Statki: " + iloscgracz);
				        						if(Okno.iloscgracz<1)
				        						{
				        							Okno.lblStatus.setText("Wygrales!!!");
				        							komp.music5();
				        						}
				        						Okno.game=false;
				        						komp.grajkomp();
				        					}
				        					
				        				}	
				        				
				        				
				        				
				        				
				        			}
				        			else if(Ruch.planszaN[p][p1]==1)
				        			{
				        				komp.music3();
				        				Okno.game = true;
				        				
				        				Okno.buttons1[p][p1].setIcon(wodasX);
				        				Okno.buttons1[p][p1].repaint();
				        				
				        				
				        				panel_1.repaint();
				        				getContentPane().repaint();
				        				
				        				lblStatus.setText("Sprobuj jeszcze raz");
				        				
				        				
				        				if(Thread.currentThread().isAlive()==true)
				        				{ 
				        				
				        				Thread thread = new Thread()
				        				{
				        				    public void run()
				        				    {
				        				    	ruch.graj();
				        				    }
				        				  };
				        				thread.start();
				        				}
				        				//	btnNewButton.doClick();
				        				
				        				
				        			}
				        			else if(Ruch.planszaN[p][p1]==0)
				        			{
				        				komp.music();
				        				Okno.game = true;
				        				
				        				Okno.buttons1[p][p1].setIcon(trawaX);
				        				Okno.buttons1[p][p1].repaint();
				        				
				        				
				        				
				        				panel_1.repaint();				        				
				        				getContentPane().repaint();
				        				
				        				lblStatus.setText("Sprobuj jeszcze raz");
				        				
				        				
				        				if(Thread.currentThread().isAlive()==true)
				        				{
				        					
				        					Thread thread = new Thread()
					        				{
					        				    public void run()
					        				    {
					        				    	
					        				    	ruch.graj();
					        				    }
					        				  };
				        					
				        					thread.start();
				        				
				        				
				        				}
				        			//	btnNewButton.doClick();
				        				
				        				
				        			} 
								}
								
								
								}
	            			
	            			
	            		});
	            		
	            	
	            	}
	                
	        }
		
		
		
		
	}
		public void druk()
	    {
	    	for(int i=0;i<pole.length;i++)
		    {
	    		System.out.println("\n");
		    	for(int k=0;k<pole[i].length;k++)
		    	{
		    		System.out.print(pole[i][k] + " ");
		    	}
		    }
	    }
		
		//Metoda dodajaca technike
		public void dodajTechnike(int rodzaj)
		{
			
			switch(rodzaj) 
			{
			case 1:
			{ 
				System.out.println("Statek");
				for(int i=0;i<buttons.length;i++)
				{
					for(int k=0;k<buttons[i].length;k++)
					{
						bg1.getSelection().getActionCommand();
					}
			  }
			  break;
			}
			case 2:
			{
				System.out.println("Panzer");
				for(int i=0;i<buttons.length;i++)
				{
					for(int k=0;k<buttons[i].length;k++)
					{
						bg1.getSelection().getActionCommand();
					
					   }
					}
			  
			  break;				
			 }
			case 3:
			{
				System.out.println("Samolot");
				for(int i=0;i<buttons.length;i++)
				{
					for(int k=0;k<buttons[i].length;k++)
					{
						
						bg1.getSelection().getActionCommand();
						
					}
			  }
			  break;				
			} 
			}
		}
		public void generuj()
		{
			for(int i=0;i<13;i++)
			{
				switch(i)
				{
				case 0:
				    while(ogranicz2.get("Statek_1")<4)
					{
				    try
				    {
				    rodzaj=1;
					polozenie1=1;
					wielkosc1=1;
					Random r = new Random();
					int p = r.nextInt(22);
            		int p1= r.nextInt(14);
            		//int s =p+1;
            		//int s1=p1+1;
            		buttons1[p][p1].doClick();
            		bg2.getSelection().getActionCommand();
				    }catch(NullPointerException e)
				    {
				    	//generuj();
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }catch(ArrayIndexOutOfBoundsException ex)
				    {
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }
					}break;
				  
				case 1:
					 while(ogranicz2.get("Statek_2")<3)
						{
					    try
					    {
					    Random r = new Random();
					    rodzaj=1;
						polozenie1=r.nextInt((2-1)+1)+1;
						wielkosc1=2;
						int p = r.nextInt(22);
	            		int p1= r.nextInt(14);
	            		//int s =p+1;
	            		//int s1=p1+1;
	            		buttons1[p][p1].doClick();
	            		bg2.getSelection().getActionCommand();
					    }catch(NullPointerException e)
					    {
					    	//generuj();
					    	System.out.println("Trwa generacja!POczekaj chwile");
					    }catch(ArrayIndexOutOfBoundsException ex)
					    {
					    	System.out.println("Trwa generacja!POczekaj chwile");
					    }
						}break;
					  
				case 2:
					while(ogranicz2.get("Statek_3")<2)
					{
				    try
				    {
				    Random r = new Random();
				    rodzaj=1;
					polozenie1=r.nextInt((2-1)+1)+1;
					wielkosc1=3;
					int p = r.nextInt(22);
            		int p1= r.nextInt(14);
            		//int s =p+1;
            		//int s1=p1+1;
            		buttons1[p][p1].doClick();
            		bg2.getSelection().getActionCommand();
				    }catch(NullPointerException e)
				    {
				    //	generuj();
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }catch(ArrayIndexOutOfBoundsException ex)
				    {
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }
					}break;
				   
				case 3:
					while(ogranicz2.get("Statek_4")<1)
					{
				    try
				    {
				    Random r = new Random();
				    rodzaj=1;
					polozenie1=r.nextInt((2-1)+1)+1;
					wielkosc1=4;
					int p = r.nextInt(22);
            		int p1= r.nextInt(14);
            		//int s =p+1;
            		//int s1=p1+1;
            		buttons1[p][p1].doClick();
            		bg2.getSelection().getActionCommand();
				    }catch(NullPointerException e)
				    {
				    	//generuj();
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }catch(ArrayIndexOutOfBoundsException ex)
				    {
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }
					}break;
				case 4:
					while(ogranicz2.get("Ciolg_1")<4)
					{
				    try
				    {
				    Random r = new Random();
				    rodzaj=2;
					polozenie1=r.nextInt((2-1)+1)+1;
					wielkosc1=1;
					int p = r.nextInt(22);
            		int p1= r.nextInt(14);
            		//int s =p+1;
            		//int s1=p1+1;
            		buttons1[p][p1].doClick();
            		bg2.getSelection().getActionCommand();
				    }catch(NullPointerException e)
				    {
				    	//generuj();
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }catch(ArrayIndexOutOfBoundsException ex)
				    {
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }
					}break;
				case 5:
					while(ogranicz2.get("Ciolg_2")<3)
					{
				    try
				    {
				    Random r = new Random();
				    rodzaj=2;
					polozenie1=r.nextInt((2-1)+1)+1;
					wielkosc1=2;
					int p = r.nextInt(22);
            		int p1= r.nextInt(14);
            		//int s =p+1;
            		//int s1=p1+1;
            		buttons1[p][p1].doClick();
            		bg2.getSelection().getActionCommand();
				    }catch(NullPointerException e)
				    {
				    	//generuj();
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }catch(ArrayIndexOutOfBoundsException ex)
				    {
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }
					}break;
				case 6:
					while(ogranicz2.get("Ciolg_3")<2)
					{
				    try
				    {
				    Random r = new Random();
				    rodzaj=2;
					polozenie1=r.nextInt((2-1)+1)+1;
					wielkosc1=3;
					int p = r.nextInt(22);
            		int p1= r.nextInt(14);
            		//int s =p+1;
            		//int s1=p1+1;
            		buttons1[p][p1].doClick();
            		bg2.getSelection().getActionCommand();
				    }catch(NullPointerException e)
				    {
				    	//generuj();
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }catch(ArrayIndexOutOfBoundsException ex)
				    {
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }
					}break;
				case 7:
					while(ogranicz2.get("Ciolg_4")<1)
					{
				    try
				    {
				    Random r = new Random();
				    rodzaj=2;
					polozenie1=r.nextInt((2-1)+1)+1;
					wielkosc1=4;
					int p = r.nextInt(22);
            		int p1= r.nextInt(14);
            		//int s =p+1;
            		//int s1=p1+1;
            		buttons1[p][p1].doClick();
            		bg2.getSelection().getActionCommand();
				    }catch(NullPointerException e)
				    {
				    	//generuj();
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }catch(ArrayIndexOutOfBoundsException ex)
				    {
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }
					}break;
				case 8:
					while(ogranicz2.get("Samolot_1")<4)
					{
				    try
				    {
				    Random r = new Random();
				    rodzaj=3;
					polozenie1=r.nextInt((2-1)+1)+1;
					wielkosc1=1;
					int p = r.nextInt(22);
            		int p1= r.nextInt(14);
            		//int s =p+1;
            		//int s1=p1+1;
            		buttons1[p][p1].doClick();
            		bg2.getSelection().getActionCommand();
				    }catch(NullPointerException e)
				    {
				    	//generuj();
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }catch(ArrayIndexOutOfBoundsException ex)
				    {
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }
					}break;
				case 9:
					while(ogranicz2.get("Samolot_2")<3)
					{
				    try
				    {
				    Random r = new Random();
				    rodzaj=3;
					polozenie1=r.nextInt((2-1)+1)+1;
					wielkosc1=2;
					int p = r.nextInt(22);
            		int p1= r.nextInt(14);
            		//int s =p+1;
            		//int s1=p1+1;
            		buttons1[p][p1].doClick();
            		bg2.getSelection().getActionCommand();
				    }catch(NullPointerException e)
				    {
				    //	generuj();
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }catch(ArrayIndexOutOfBoundsException ex)
				    {
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }
					}break;	
				case 10:
					while(ogranicz2.get("Samolot_3")<2)
					{
				    try
				    {
				    Random r = new Random();
				    rodzaj=3;
					polozenie1=r.nextInt((2-1)+1)+1;
					wielkosc1=3;
					int p = r.nextInt(22);
            		int p1= r.nextInt(14);
            		//int s =p+1;
            		//int s1=p1+1;
            		buttons1[p][p1].doClick();
            		bg2.getSelection().getActionCommand();
				    }catch(NullPointerException e)
				    {
				    //	generuj();
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }catch(ArrayIndexOutOfBoundsException ex)
				    {
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }
					}break;
				case 11:
					while(ogranicz2.get("Samolot_4")<1)
					{
				    try
				    {
				    Random r = new Random();
				    rodzaj=3;
					polozenie1=r.nextInt((2-1)+1)+1;
					wielkosc1=4;
					int p = r.nextInt(22);
            		int p1= r.nextInt(14);
            		//int s =p+1;
            		//int s1=p1+1;
            		buttons1[p][p1].doClick();
            		bg2.getSelection().getActionCommand();
				    }catch(NullPointerException e)
				    {
				    //	generuj();
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }catch(ArrayIndexOutOfBoundsException ex)
				    {
				    	System.out.println("Trwa generacja!POczekaj chwile");
				    }
					}
					break;
				case 12:
					lblStatus.setText("Gotowy!");
					
				    
					
				
				}
			}   					
		}
		public static void copyPole()
		{
			for(int i=0;i<24;i++)
			{
				pole3[i][0]=6;
			}
			for(int i=0;i<15;i++) 
			{
				pole3[0][i]=6;
			}
			for(int i=0;i<15;i++)
			{
				pole3[23][i]=6;
			}
			for(int i=0;i<24;i++)
			{
				pole3[i][15]=6;
			}
		}
}
