/*Податоците за плати на вработените во една компанија привремено се чуваат во еднострано поврзана листа.
Во секој јазол од листата се чува единствен ID на вработениот и неговата плата. 
Потребно е да се отстранат сите вработени со помали плати од даден износ, 
а остатокот да се прикажат во опаѓачки редослед во однос на ID-то. 
Во првиот ред од влезот е даден бројот на вработени, потоа наизменично се дадени ID и плата за секој од вработените
и во последниот ред е износот во однос на кој ќе се отстрануваат вработените.
На излез се печати листа (ID, плата) во опаѓачки редослед според ID на секој од вработените.

Доколку нема вработени со плата поголема од дадената да се испечати: nema

Име на класата: SLLKompanija */



public class SLLKompanija {
	
	public static void izmeni(SLL<Kompanija>list, int plata) {
		
		SLLNode<Kompanija>tmp=list.getFirst();
		
		while(tmp!=null) {
			if(tmp.element.plata<plata) {
				list.delete(tmp);
			}
			tmp=tmp.succ;
		}
		
		SLLNode<Kompanija>dvizi=list.getFirst();
		if(dvizi==null) {
			System.out.println("Nema!!!");
			return;
		}
		
		
		while(dvizi!=null) {
			SLLNode<Kompanija>dvizi2=dvizi.succ;
			while(dvizi2!=null) {
				if(dvizi.element.id<dvizi2.element.id) {
					Kompanija temp=dvizi.element;
					dvizi.element=dvizi2.element;
					dvizi2.element=temp;
				}
				dvizi2=dvizi2.succ;
			}
			dvizi=dvizi.succ;
		}
		
		System.out.println(list);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kompanija k1= new Kompanija(1,9800);
		Kompanija k2= new Kompanija(4,11800);
		Kompanija k3= new Kompanija(6,99800);

		SLL<Kompanija>list= new SLL<Kompanija>();
		list.insertLast(k1);
		list.insertLast(k2);
		list.insertLast(k3);

		System.out.println(list);
		
		izmeni(list, 1110000);
		
	}

}
