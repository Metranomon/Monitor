package org.generation.italy;

public class Monitor {
	//variabili del monitor (attributi)
	String colore;
	int pollici;
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
 	
}
