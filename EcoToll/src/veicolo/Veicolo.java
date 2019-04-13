package veicolo;

public class Veicolo {
	private String modello;
	private String marca;
	private String targa;
	private String classe;
	private int anno;
	private int assi;
	private int euro;
	private float peso;
	private float altezza;
	
	public Veicolo(String classe)
	{
		this.classe=classe;
	}
	
	public Veicolo(String classe,String marca,String targa,String modello,int anno,int assi,int euro,float peso,float altezza)
	{
		this.classe=classe;
		this.marca=marca;
		this.targa=targa;
		this.modello=modello;
		this.anno=anno;
		this.assi=assi;
		this.euro=euro;
		this.peso=peso;
		this.altezza=altezza;
	}
	
	public String getclasse()
	{
		return this.classe;
	}
	
}
