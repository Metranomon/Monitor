package org.generation.italy;

public class Monitor {
	//variabili del monitor (attributi)
	String colore;
	int pollici=-1;		//-1: non impostato 
	int luminosit�=50;
	boolean stato=false; 		//false: spento, true: acceso
	
	
	//funzionalit� (metodi)
 	public void accendi() {
 		stato=true;
 	}
 	
 	
 	public void spegni() {
 		stato=false;
 	}
	
 	public void aumentaLuminosit�()
 	{
 		if (luminosit�<100)
 			luminosit�+=10;
 	}
 	
 	public void riduciLuminosit�()
 	{
 		if (luminosit�>1)
 			luminosit�-=1;
 	}
 	
 	public void mostraDati() 		//visualizza i dati del monitor
 	{
 		System.out.println("Colore: "+colore);
 		if (pollici>=0)
 			System.out.println("Pollici: "+pollici);		//li mostro se sono impostati
 		else
 			System.out.println("Pollici: -non impostato-");		//li mostro se sono impostati
		if (stato==true)
			System.out.println("Stato: acceso");
		else
			System.out.println("Stato: spento");
		System.out.print("Luminosit�: ");
		for(int i=0;i<luminosit�/10;i++)
			System.out.print("-");
		System.out.println();
 	}
 	
}
