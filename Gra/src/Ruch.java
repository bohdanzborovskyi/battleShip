import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ruch 

{
	
	private static  int kor1;
	public static int kor2;
	public int s;
	public int s1;
	public static int kor11;
	public static int kor21;
	public int korOne;
	public int korTwo;
	public static int licz=0;
	public int pamiec=0;
	public int kordyn1;
	public int kordyn2;
	public static boolean zabil,zakoncz;
	public static int tab[][] = new int [20][20];
	static komputer komp = new komputer();
	  
    
	//Okno okno = new Okno();
	   public static int	planszaN [][] =  {
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
	   
	
	
	
	   
	public  void graj()
	{
		
	if (Okno.game)
	{	
		/* System.out.println("Pole1");
		for(int i=0;i<Okno.pole1.length;i++)
		{
			System.out.println("\n");
			for(int k=0;k<Okno.pole1[0].length;k++)
			{
				System.out.print(Okno.pole1[i][k] + " ");
			}
		} 
		System.out.println("Pole");
		for(int i=0;i<Okno.pole3.length;i++)
		{
			System.out.println("\n");
			for(int k=0;k<Okno.pole3[0].length;k++)
			{
				System.out.print(Okno.pole3[i][k] + " ");
			}
		}
		/*System.out.println("Pole2");
		for(int i=0;i<Okno.pole2.length;i++)
		{	System.out.println("\n");
			for(int k=0;k<Okno.pole2[0].length;k++)
			{
				System.out.print(Okno.pole2[i][k] + " ");
			}
		} */
		
		try {
			   
		    TimeUnit.SECONDS.sleep(1);
		 
		} catch (InterruptedException ex) {
		    //Handle exception
		}
		Okno.rodzaj=4;
		//newKor(kor11,kor21);
		Random r = new Random();
		if(zabil==false)
		{
		setKor1(r.nextInt(22));
		kor2= r.nextInt(14);
		}
		if((Okno.pole2[getKor1()+1][kor2+1]==0) && (getKor1()<22) &&(getKor1()>-1) && (kor2>-1)&& (kor2<14))
		{
	    s =getKor1()+1;
		s1=kor2+1;
		System.out.println((getKor1()+1) + " " + (kor2+1));
		
		
		// Trafil i wokol niego sa jeszcze cele
		if((Okno.pole[s][s1]!=1 && Okno.pole[s][s1]!=0) &&  ((Okno.pole[s-1][s1-1]!=1 && Okno.pole[s-1][s1-1]!=0) || (Okno.pole[s-1][s1]!=1 && Okno.pole[s-1][s1]!=0) || (Okno.pole[s-1][s1+1]!=1 && Okno.pole[s-1][s1+1]!=0) || (Okno.pole[s][s1-1]!=1 && Okno.pole[s][s1-1]!=0) || (Okno.pole[s][s1+1]!=1 && Okno.pole[s][s1+1]!=0) || (Okno.pole[s+1][s1-1]!=1 && Okno.pole[s+1][s1-1]!=0) || (Okno.pole[s+1][s1]!=1 && Okno.pole[s+1][s1]!=0) || (Okno.pole[s+1][s1+1]!=1 && Okno.pole[s+1][s1+1]!=0)) )
		{
			pamiec++;
			if(Okno.pole2[s][s1-1]==1 || Okno.pole2[s][s1+1]==1)
			{
				licz=0;
			} 
			else if(Okno.pole2[s-1][s1]==1 || Okno.pole2[s+1][s1]==1)
			{
				licz=2; 
			}
			else if(s==1 || s==22)
			{
				
					licz=0;
			}
			else if(s1==1 || s1==14)
			{
				licz=2;
			}
			Okno.pole2[s][s1]=1;
			tab[pamiec][pamiec-1] = s;
			tab[pamiec][pamiec] = s1;
			zabil = true;
			kor11 = getKor1();
			kor21 = kor2;
			System.out.println("Problem w pierwszym");
			if(Okno.pole[s][s1]==2)
			{
				Okno.pole[s][s1]=0;
				System.out.println(Okno.pole[s][s1]);
				Okno.game = false;
				Okno.rodzstrzal = 1;
				Okno.buttons[getKor1()][kor2].doClick();
				newKor(kor11,kor21);
	    		Okno.bg1.getSelection().getActionCommand();
	    		
			}
			else if(Okno.pole[s][s1]==3)
			{ 
				Okno.pole[s][s1]=0;
				System.out.println(Okno.pole[s][s1]);
				Okno.game = false;
				Okno.rodzstrzal = 2;
				Okno.buttons[getKor1()][kor2].doClick();
				newKor(kor11,kor21);
	    		Okno.bg1.getSelection().getActionCommand();
	    		
			}
			else if(Okno.pole[s][s1]==4)
			{
				Okno.pole[s][s1]=0;
				System.out.println(Okno.pole[s][s1]);
				Okno.game = false;
				Okno.rodzstrzal = 3;
				Okno.buttons[getKor1()][kor2].doClick();
				newKor(kor11,kor21);
	    		Okno.bg1.getSelection().getActionCommand();
	    	
			}
			
			
			
		}
		// Trafil i wokol niego juz nie ma celi
		else if((Okno.pole[s][s1]!=1 && Okno.pole[s][s1]!=0) && (Okno.pole[s-1][s1-1]==1 || Okno.pole[s-1][s1-1]==0) && (Okno.pole[s-1][s1]==1 || Okno.pole[s-1][s1]==0) && (Okno.pole[s-1][s1+1]==1 || Okno.pole[s-1][s1+1]==0) && (Okno.pole[s][s1-1]==1 || Okno.pole[s][s1-1]==0) && (Okno.pole[s][s1+1]==1 || Okno.pole[s][s1+1]==0) && (Okno.pole[s+1][s1-1]==1 || Okno.pole[s+1][s1-1]==0) && (Okno.pole[s+1][s1]==1 || Okno.pole[s+1][s1]==0) && (Okno.pole[s+1][s1+1]==1 || Okno.pole[s+1][s1+1]==0))
		{
			if(Okno.pole[s][s1]==2)
			{
				try
				{
				pamiec=0;
				licz=0;
				Okno.game = true;
				zabil = false;
				Okno.pole[s][s1]=0;
				Okno.pole2[s-1][s1-1]=1;
				Okno.pole2[s-1][s1]=1;
				Okno.pole2[s-1][s1+1]=1;
				Okno.pole2[s][s1-1]=1;
				Okno.pole2[s][s1+1]=1;
				Okno.pole2[s+1][s1-1]=1;
				Okno.pole2[s+1][s1]=1;
				Okno.pole2[s+1][s1+1]=1;
				Okno.pole2[s][s1]=1;
				Okno.rodzstrzal = 1;
				kordyn1 = getKor1();
				kordyn2 = kor2;
				System.out.println("Problem w drugim1");
				Okno.buttons[kordyn1][kordyn2].doClick();
				System.out.println("Problem w drugim2");
				if(sprawdz(tab[1][0],tab[1][1]))
				{
					licz=0;
					System.out.println("Porownanie zadzialalo" + " " + tab[1][0] + " " + tab[1][1]);
					zabil=true;
					kor11=tab[1][0]-1;
					kor21=tab[1][1]-1;
					newKor(kor11,kor21);
					
					
				//	Okno.buttons[kordyn1][kordyn2].doClick();
		    		Okno.bg1.getSelection().getActionCommand();
				}
		else
		{
			Okno.ilosckomp--;
			
			if(Okno.ilosckomp<1)
			{
				Okno.lblStatus.setText("Przerales!!!");
				komp.music6();
			}
			Okno.game = true;
			zabil = false;
			setKor1(0);
			kor2=0;
			System.out.println("Porownanie nie zadzialalo" + " " + tab[1][0] + " " + tab[1][1] + " " + pamiec);
		//	Okno.buttons[kordyn1][kordyn2].doClick();
    		Okno.bg1.getSelection().getActionCommand();
    		
		}
				
	    		
	    		
	    		
				}catch(NullPointerException e)
				{
				  
				}
	    	
				
			}
			else if(Okno.pole[s][s1]==3)
			{
				try
				{ 
					Okno.game = true;
					pamiec=0;
					licz=0;
					zabil = false;
					Okno.pole[s][s1]=0;
					Okno.pole2[s-1][s1-1]=1;
					Okno.pole2[s-1][s1]=1;
					Okno.pole2[s-1][s1+1]=1;
					Okno.pole2[s][s1-1]=1;
					Okno.pole2[s][s1+1]=1;
					Okno.pole2[s+1][s1-1]=1;
					Okno.pole2[s+1][s1]=1;
					Okno.pole2[s+1][s1+1]=1;
					Okno.pole2[s][s1]=1;	
				Okno.pole2[s][s1]=1;
				Okno.rodzstrzal = 2;
				kordyn1 = getKor1();
				kordyn2 = kor2;
				System.out.println("Problem w drugim1");
				Okno.buttons[kordyn1][kordyn2].doClick();
				System.out.println("Problem w drugim2");
				if(sprawdz(tab[1][0],tab[1][1]))
				{
					licz=0;
					System.out.println("Porownanie zadzialalo" + " " + tab[1][0] + " " + tab[1][1]);
					zabil=true;
					kor11=tab[1][0]-1;
					kor21=tab[1][1]-1;
					newKor(kor11,kor21);
					
					
				//	Okno.buttons[kordyn1][kordyn2].doClick();
		    		Okno.bg1.getSelection().getActionCommand();
				}
		else
		{ 
			Okno.ilosckomp--;
			
			if(Okno.ilosckomp<1)
			{
				Okno.lblStatus.setText("Przerales!!!");
				komp.music6();
			}
			Okno.game = true;
			zabil = false;
			setKor1(0);
			kor2=0;
			System.out.println("Porownanie nie zadzialalo" + " " + tab[1][0] + " " + tab[1][1] + " " + pamiec);
		//	Okno.buttons[kordyn1][kordyn2].doClick();
    		Okno.bg1.getSelection().getActionCommand(); 
		}
				
	    		
	    		
	    		
				}catch(NullPointerException e)
				{
				  
				}
	    	
				
			}
			else if(Okno.pole[s][s1]==4)
			{
				try
				{
					Okno.game = true;
					pamiec=0;
					System.out.println("Problem w drugim1");
					zabil = false;
					licz=0;
					Okno.pole[s][s1]=0;
					Okno.pole2[s-1][s1-1]=1;
					Okno.pole2[s-1][s1]=1;
					Okno.pole2[s-1][s1+1]=1;
					Okno.pole2[s][s1-1]=1;
					Okno.pole2[s][s1+1]=1;
					Okno.pole2[s+1][s1-1]=1;
					Okno.pole2[s+1][s1]=1;
					Okno.pole2[s+1][s1+1]=1;
					Okno.pole2[s][s1]=1;
					Okno.pole2[s][s1]=1;
					Okno.rodzstrzal = 3;
					kordyn1 = getKor1();
					kordyn2 = kor2;
					Okno.buttons[kordyn1][kordyn2].doClick();
					if(sprawdz(tab[1][0],tab[1][1]))
					{
						licz=0;
						System.out.println("Porownanie zadzialalo" + " " + tab[1][0] + " " + tab[1][1]);
						zabil=true;
						kor11=tab[1][0]-1;
						kor21=tab[1][1]-1;
						newKor(kor11,kor21);
						
						
					//	Okno.buttons[kordyn1][kordyn2].doClick();
			    		Okno.bg1.getSelection().getActionCommand();
					}
			else
			{
				Okno.ilosckomp--;
				
				if(Okno.ilosckomp<1)
				{
					Okno.lblStatus.setText("Przerales!!!");
					komp.music6();
				}
				Okno.game = true;
				zabil = false;
				setKor1(0);
				kor2=0;
				System.out.println("Porownanie nie zadzialalo" + " " + tab[1][0] + " " + tab[1][1] + " " + pamiec);
			//	Okno.buttons[kordyn1][kordyn2].doClick();
	    		Okno.bg1.getSelection().getActionCommand();
			}
					
		    		
		    		
		    		
					}catch(NullPointerException e)
					{
					  
					}
		    	
					
				}
		}
	    else
			{
				if(planszaN[getKor1()][kor2]==0)
				{
					try
					{
					Okno.game = false;	
					Okno.pole2[s][s1]=1;
					Okno.rodzstrzal = 4;
					
					Okno.buttons[getKor1()][kor2].doClick();
					newKor(kor11,kor21);
		    		Okno.bg1.getSelection().getActionCommand();
		    		
		    		System.out.println("Problem w ziemie");
		    		
		    		
		    		
		    		
		    		//	game = false;
				}catch(NullPointerException e)
				{
				  
				}
				}
				
			    else if(planszaN[getKor1()][kor2]==1)
				{
				   try
				   {
					   Okno.game = false;
					   Okno.pole2[s][s1]=1;
					   Okno.rodzstrzal = 5;
					   Okno.buttons[getKor1()][kor2].doClick();
					   newKor(kor11,kor21);
					   Okno.bg1.getSelection().getActionCommand();
					   
					   System.out.println("Problem w wodzie");
					   
					   
					//   game =false;
			}catch(NullPointerException e)
			{
			  
			}
			   }
				
				}
			}
		else
		{
			newKor(kor11,kor21);
			Okno.game = true;
			graj();
		
		}
	}			
	}
	public static void newKor(int one,int two)
	{
		//zabil = false;
	//	kor1=0;
	//	kor2=0;
	//	licz =0;
		
		if(zabil)
		{
		
		switch(licz)
		{
		
		
		case 0:
		{
		//	if(Okno.pole2[one][two-1]!=1)
			{
				if(Okno.pole3[one+1][two+1]==6)
				{
					licz++;
					newKor(kor11,kor21);
				}
			setKor1(one);
			kor2 = two-1;
			licz++;
			}
		//	else{licz++; newKor(kor11,kor21);System.out.println("case 0");}
			
		}break;
		
		case 1:
		{
		//	if(Okno.pole2[one][two+1]!=1)
			{
				if(Okno.pole3[one+1][two+1]==6)
				{
					licz++;
					newKor(kor11,kor21);
				}
			setKor1(one);
			kor2 = two+1;
			licz++;
			}
		//	else{licz++; newKor(kor11,kor21);System.out.println("case 1");}
			
			
		}break;
		case 2:
		{
		//	if(Okno.pole2[one-1][two]!=1)
			{
				if(Okno.pole3[one+1][two+1]==6)
				{
					licz++;
					newKor(kor11,kor21);
				}
			setKor1(one-1);
			kor2 = two;
			licz++;
			}
		//	else{licz++; newKor(kor11,kor21);System.out.println("case 2");}
		}break;
		
		case 3:
		{
		//	if(Okno.pole2[one+1][two]!=1)
			{
				if(Okno.pole3[one+1][two+1]==6)
				{
					licz++;
					newKor(kor11,kor21);
				}
			setKor1(one+1);
			kor2 = two; 
			licz=0;
			}
		//	else{licz++; newKor(kor11,kor21);System.out.println("case 3");}
		}break;
		
		
		}
		}
		
	}
	public static boolean sprawdz(int kerOne,int kerTwo)
	{
		
		if((Okno.pole[kerOne-1][kerTwo-1]!=1 && Okno.pole[kerOne-1][kerTwo-1]!=0) || (Okno.pole[kerOne-1][kerTwo]!=1 && Okno.pole[kerOne-1][kerTwo]!=0) || (Okno.pole[kerOne-1][kerTwo+1]!=1 && Okno.pole[kerOne-1][kerTwo+1]!=0) || (Okno.pole[kerOne][kerTwo-1]!=1 && Okno.pole[kerOne][kerTwo-1]!=0) || (Okno.pole[kerOne][kerTwo+1]!=1 && Okno.pole[kerOne][kerTwo+1]!=0) || (Okno.pole[kerOne+1][kerTwo-1]!=1 && Okno.pole[kerOne+1][kerTwo-1]!=0) || (Okno.pole[kerOne+1][kerTwo]!=1 && Okno.pole[kerOne+1][kerTwo]!=0) || (Okno.pole[kerOne+1][kerTwo+1]!=1 && Okno.pole[kerOne+1][kerTwo+1]!=0))
		{
			return true;
		}
		else
		{
			return  false;
		}
		
	}
	public static boolean sprawdz1(int kerOne,int kerTwo)
	{
		
		if((Okno.pole1[kerOne-1][kerTwo-1]!=1 && Okno.pole1[kerOne-1][kerTwo-1]!=0) || (Okno.pole1[kerOne-1][kerTwo]!=1 && Okno.pole1[kerOne-1][kerTwo]!=0) || (Okno.pole1[kerOne-1][kerTwo+1]!=1 && Okno.pole1[kerOne-1][kerTwo+1]!=0) || (Okno.pole1[kerOne][kerTwo-1]!=1 && Okno.pole1[kerOne][kerTwo-1]!=0) || (Okno.pole1[kerOne][kerTwo+1]!=1 && Okno.pole1[kerOne][kerTwo+1]!=0) || (Okno.pole1[kerOne+1][kerTwo-1]!=1 && Okno.pole1[kerOne+1][kerTwo-1]!=0) || (Okno.pole1[kerOne+1][kerTwo]!=1 && Okno.pole1[kerOne+1][kerTwo]!=0) || (Okno.pole1[kerOne+1][kerTwo+1]!=1 && Okno.pole1[kerOne+1][kerTwo+1]!=0))
		{
			return true;
		}
		else 
		{
			return  false;
		}
		
	}
	public static int getKor1() {
		return kor1;
	}
	public static void setKor1(int kor1) {
		Ruch.kor1 = kor1;
	}
		
			
			
			
		}
		
	

