package casello;

public class Casello {
	private String nome;
	private float km;
	private String tipo;
	private float costoaggiuntivo;
	
	public Casello(String nome,float km,String tipo,float costo)
	{
		this.nome=nome;
		this.km=km;
		this.tipo=tipo;
		this.costoaggiuntivo=costo;
	}
	
	public float getkm()
	{
		return this.km;
	}
	
	public float getcosto()
	{
		return this.costoaggiuntivo;
	}

}
