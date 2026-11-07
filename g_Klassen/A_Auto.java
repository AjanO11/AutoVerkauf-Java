package g_Klassen;

public class A_Auto
{
	
	private String marke = "unbekannt";
	private int ps = 0;
	private int maxGeschwindigkeit = 0;
	
	
	public A_Auto(String marke, int ps, int maxGeschwindigkeit) 
	{
		super();
		setMarke(marke);
		setPs(ps);
		setMaxGeschwindigkeit(maxGeschwindigkeit);
		
	}
	
	
	public A_Auto(int ps,int maxGeschwindigkeit)
	{
		setPs(ps);
		setMaxGeschwindigkeit(maxGeschwindigkeit);
	}
	
	
	public A_Auto(String marke,int ps)
	{
		setMarke(marke);
		setPs(ps);
	}
	
	
	public String getMarke() 
	{
		return marke;
	}


	public void setMarke(String marke) 
	{
		if(marke==null || marke.trim().isEmpty()|| marke.matches(".*\\d.*"))
			this.marke="unbekannt";
		else
			this.marke = marke;
	}


	public int getPs() 
	{
		return ps;
	}


	public void setPs(int ps) 
	{
		if(ps<=0)
			this.ps = 0;
		else
			this.ps = ps;
	}


	public int getMaxGeschwindigkeit() 
	{
		return maxGeschwindigkeit;
	}


	public void setMaxGeschwindigkeit(int maxGeschwindigkeit) 
	{
		if(maxGeschwindigkeit <= 0)
			this.maxGeschwindigkeit = 0;
		else
			this.maxGeschwindigkeit = maxGeschwindigkeit;
	}

	public String toString() 
	{
		return marke + ", ps=" + ps + 
				", maxGeschwindigkeit=" + maxGeschwindigkeit ;
	}
}

