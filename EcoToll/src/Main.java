import java.util.*;
import autostrada.Autostrada;
import pedaggio.Pedaggio;
import percorso.*;
import veicolo.Veicolo;
import casello.Casello;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pedaggio> tariffario=new ArrayList<Pedaggio>();
		
		Pedaggio a=new Pedaggio((float)1,(float)1.22,"A");
		Pedaggio b=new Pedaggio((float)2,(float)1.22,"B");
		Pedaggio c=new Pedaggio((float)3,(float)1.22,"C");
		Pedaggio d=new Pedaggio((float)4,(float)1.22,"D");
		Pedaggio e=new Pedaggio((float)5,(float)1.22,"E");
		
		tariffario.add(a);
		tariffario.add(b);
		tariffario.add(c);
		tariffario.add(d);
		tariffario.add(e);
		
		List<Casello> caselli=new ArrayList<Casello>();
		
		Casello aa=new Casello("a",(float)0,"Pianura",(float)1);
		Casello ab=new Casello("b",(float)25,"Salita",(float)1.1);
		Casello ac=new Casello("c",(float)50,"Discesa",(float)1.2);
		Casello ad=new Casello("d",(float)75,"Pianura",(float)1);
		Casello ae=new Casello("e",(float)100,"Galleria",(float)1.3);
		
		caselli.add(aa);
		caselli.add(ab);
		caselli.add(ac);
		caselli.add(ad);
		caselli.add(ae);
		
		Autostrada A=new Autostrada(caselli,tariffario);
		
		Veicolo v=new Veicolo("C");
		Percorso percorso=new Percorso(aa,ab,v);
		
		float importo=A.calcolaimporto(percorso);
		
		System.out.println(importo);
		
		

	}

}
