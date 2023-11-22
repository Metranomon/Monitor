package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Programma per la gestione di un monitor
		// l'utente inserisce i dati del monitor e 
		//il programma chiede che operazioni si vogliono effettuare sul monitor

		
		Scanner sc=new Scanner(System.in);	//dichiaro un oggetto Scanner
		Monitor m1=new Monitor();			//dichiaro un oggetto monitor
		Monitor m2=new Monitor();
		Forno f=new Forno();
		String operazione;
		
		//cambio il colore del forno
		f.colore="Rosso";
		
		m2.colore="Verde";
		//m2.pollici=24;
		m2.accendi();
		m2.riduciLuminosit�();
		
		
		System.out.println("Inserisci i dati del monitor");
		System.out.print("Colore: ");
		m1.colore=sc.nextLine();			//modifico il colore dell'oggetto m
		
		System.out.print("Pollici: ");
		m1.pollici=Integer.parseInt(sc.nextLine());
		
		//operazioni del monitor
		do {
			System.out.println("\n\n\n\n\n\n\n\n\nQuesto � il monitor m1:");
			m1.mostraDati();
			
			System.out.println("\n\nQuesto � il monitor m2:");
			m2.mostraDati();
			
			
			System.out.println("Cosa vuoi fare con il monitor (accendi/spegni/aumenta luminosit�/diminuisci luminosit�/esci)?");
			operazione=sc.nextLine();
			switch(operazione) {
			case "accendi":
				m1.accendi();		//chiamata al metodo (operazione) - eseguo del codice
				break;
			case "spegni":
				m1.spegni();
				break;
			case "aumenta luminosit�":
				m1.aumentaLuminosit�();
				break;
			case "diminuisci luminosit�":
				m1.riduciLuminosit�();
				break;
			}
			
		} while(!operazione.equals("esci"));
		
		//operazioni del televisore
		
		//ecc.
		
	}

}
