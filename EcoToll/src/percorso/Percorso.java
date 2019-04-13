package percorso;
import casello.Casello;
import veicolo.Veicolo;

public class Percorso {
	private Casello entrata;
	private Casello uscita;
	private Veicolo vettura;
	
	public Percorso(Casello entrata,Casello uscita,Veicolo vettura)
	{
		this.entrata=entrata;
		this.uscita=uscita;
		this.vettura=vettura;
	}
	
	public Percorso(Casello entrata,Casello uscita)
	{
		this.entrata=entrata;
		this.uscita=uscita;
	}
	
	public float getdistanza()
	{
		return uscita.getkm()-entrata.getkm();
	}
	
	public Casello getentrata()
	{
		return this.entrata;
	}
	
	public Casello getuscita()
	{
		return this.uscita;
	}
	
	public Veicolo getveicolo()
	{
		return this.vettura;
	}
	
}
	
