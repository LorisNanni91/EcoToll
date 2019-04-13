package pedaggio;

public class Pedaggio {
	private float tariffaunitaria;
	private float iva;
	private String classeveicolo;
	
	public Pedaggio(float tariffa,float iva,String classe)
	{
		this.tariffaunitaria=tariffa;
		this.iva=iva;
		this.classeveicolo=classe;
	}
	
	public String getclasse()
	{
		return this.classeveicolo;
	}
	
	public float getiva()
	{
		return this.iva;
	}
	
	public float gettariffa()
	{
		return this.tariffaunitaria;
	}

}
