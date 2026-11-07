package g_Klassen;

import java.util.Scanner;

public class A_MAINAuto {

	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		A_Auto parkplatz[]= new A_Auto[5];
		
		A_Auto mercedes=new A_Auto("Mercedes",500,270);
		parkplatz[0]=mercedes;
		A_Auto tesla=new A_Auto("Tesla",300,250);
		parkplatz[1]=tesla;
		A_Auto toyota=new A_Auto(250,220);
		parkplatz[2]=toyota;
		A_Auto volkswagen=new A_Auto("Volkswagen",345);
		parkplatz[3]=volkswagen;
		
		System.out.println("Möchten Sie Ihr Auto zum Verkauf anbieten?");
		String a=scanner.next();
		
		if(a.equalsIgnoreCase("Ja"))
		{
			int ps;
			int maxGeschwindigkeit;
			System.out.println("Geben Sie die Marke ein: ");
			String marke=scanner.next();
			
			System.out.println("Geben Sie die PS-Zahl ein: ");
			if(scanner.hasNextInt())
				ps=scanner.nextInt();
			else {
				ps=0;
				scanner.next();
			}
			
			System.out.println("Geben Sie die maximale Geschwindigkeit ein: ");
			if(scanner.hasNextInt())
				maxGeschwindigkeit=scanner.nextInt();
			else
				maxGeschwindigkeit=0;
			
			A_Auto neueauto=new A_Auto(marke,ps,maxGeschwindigkeit);
			parkplatz[4]= neueauto;
		}
		else
			System.out.println("Sie können sich unsere Liste anschauen.");
		
		System.out.println("------------AutoVerkauf------------");
		
		for(A_Auto i:parkplatz)
			if(i!=null)
				System.out.println(i);
		
		scanner.close();
	}
}
