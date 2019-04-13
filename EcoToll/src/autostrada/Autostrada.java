package autostrada;
import java.util.*;

import casello.Casello;
import pedaggio.Pedaggio;
import veicolo.Veicolo;
import percorso.*;

public class Autostrada {
	private List<Pedaggio> tariffario;
	private List<Casello> caselli;
	
	public Autostrada(List<Casello> casello,List<Pedaggio> tariffa)
	{
		this.caselli=casello;
		this.tariffario=tariffa;
	}
	
	public void addcasello(Casello x)
	{
		this.caselli.add(x);
	}
	
	public void addtariffa(Pedaggio x)
	{
		this.tariffario.add(x);
	}
	
	public List<Casello> getcaselliintermedi(Percorso P)
	{
		List<Casello> intermedi= new ArrayList<Casello>();

		Casello A=P.getentrata();
		Casello B=P.getuscita();
		if(P.getdistanza()<0)
		{
			A=P.getuscita();
			B=P.getentrata();
		}
		int x=-1;
		int y=caselli.size();
		for(int i=0;i<caselli.size();i++)
		{
			
			if(caselli.get(i).equals(A))
			{
				x=i;
			}
			if(caselli.get(i).equals(B))
			{
				y=i;
			}
			
			if(i>=x && i<=y && x>=0)
			{
				intermedi.add(caselli.get(i));
			}
			
		}
		
		return intermedi;
	}
	
	public float arrotondamento(float x)
	{
		x=x*10;
		x=java.lang.Math.round(x);
		x=x/10;
		return x;
		
	}
	
	public Pedaggio selezionatariffa(Veicolo v)
	{ Pedaggio P= new Pedaggio(1,(float)1.22,"A");
		for(int i=0;i<tariffario.size();i++)
		{
			if(tariffario.get(i).getclasse().equals(v.getclasse()))
			{
				return tariffario.get(i);	
			}
		}
		return P;
	}
	
	public Pedaggio selezionatariffa(String classe)
	{
		Pedaggio P= new Pedaggio(1,(float)1.22,"A");
		for(int i=0;i<tariffario.size();i++)
		{
			if(tariffario.get(i).getclasse().equals(classe))
			{
				return tariffario.get(i);	
			}
		}
		return P;
		
	}
	
	public float calcolaimporto(Percorso P)
	{ float importo=0;
	Pedaggio pedaggio = selezionatariffa(P.getveicolo());
	List<Casello> caselliintermedi = getcaselliintermedi(P);
	
	for(int i=0;i<caselliintermedi.size()-1;i++)
	{
		Percorso a=new Percorso(caselliintermedi.get(i),caselliintermedi.get(i+1));
		importo+=a.getdistanza()*pedaggio.gettariffa()*caselliintermedi.get(i+1).getcosto();
		
	}
		importo*=pedaggio.getiva();
		importo=arrotondamento(importo);
	
		return importo;
	}

}
