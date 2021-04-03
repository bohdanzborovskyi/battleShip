import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import jaco.mp3.player.*;

public class komputer
{
		
	public void grajkomp() 
	{
		try {
			   
		    TimeUnit.SECONDS.sleep(1);
		 
		} catch (InterruptedException ex) {
		    //Handle exception
		}
		if(Okno.game=false)
		{ 					
			Okno.rodzaj=4;	
			Okno.bg2.getSelection().getActionCommand();           
		}
		
	}
	

	public void music() 
	{
		File ff = new File("land.mp3");
		MP3Player mp3 = new MP3Player(ff);
		mp3.play();
	}
	public void music1() 
	{
		File ff = new File("licz.mp3");
		MP3Player mp3 = new MP3Player(ff);
		mp3.play();
	}
	public void music2() 
	{
		File ff = new File("shot.mp3");
		MP3Player mp3 = new MP3Player(ff);
		mp3.play();
	}
	public void music3() 
	{
		File ff = new File("water.mp3");
		MP3Player mp3 = new MP3Player(ff);
		mp3.play();
	}
	public void music4() 
	{
		
		File ff = new File("wstep.mp3");
		MP3Player mp3 = new MP3Player(ff);
		mp3.play();
	}
	public void music5() 
	{
		File ff = new File("wygrane.mp3");
		MP3Player mp3 = new MP3Player(ff);
		mp3.play();
	}
	public void music6() 
	{
		File ff = new File("przegrane.mp3");
		MP3Player mp3 = new MP3Player(ff);
		mp3.play();
	}
	
	public void zapiszDoPliku() 
	{
		String s = "Pole komputera";
		String s1 = "Pole gracza";
		String s2 = "Dla pola komputera: 0-ziemia,1-woda lub pole gdzie nie wolno stawic technike,2-statek,3-ciolg,4-samolot";
		String s3 = "Dla pola gracza: 0-pole wolne,1-pole na ktorym nie wolno ustawiac technike,2-statek,3-ciolg,4-samolot";
		try
		{
			PrintWriter zapis = new PrintWriter("DaneGry.txt");	
			zapis.println(s);
			zapis.println(s2);
			for(int i=0;i<Okno.pole1.length;i++)
			{
				zapis.println("\n");
				for(int k=0;k<Okno.pole1[0].length;k++)
				{
					zapis.print(Okno.pole1[i][k] + " ");
				}
			}
			zapis.println("");
			zapis.println(s1);
			zapis.println(s3);
			for(int i=0;i<Okno.pole.length;i++)
			{
				zapis.println("\n");
				for(int k=0;k<Okno.pole[0].length;k++)
				{
					zapis.print(Okno.pole[i][k] + " ");
				}
			}
			zapis.close();
		}catch(FileNotFoundException errr)
		{
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}

