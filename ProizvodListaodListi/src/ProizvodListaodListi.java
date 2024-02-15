
public class ProizvodListaodListi {

	public static int presmetajProizvod(SLL<SLL<Integer>>list) {
		
		int proizvod=1;
		
		SLLNode<SLL<Integer>>tmp=list.getFirst();
		
		while(tmp!=null) {
			int suma=0;
			SLLNode<Integer>tmp2=tmp.element.getFirst();
			while(tmp2!=null) {
			suma+=tmp2.element;
			tmp2=tmp2.succ;
			}
		tmp=tmp.succ;
		proizvod=proizvod*suma;
		}
		
		return proizvod;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list = new SLL<Integer>();
		list.insertLast(1);
		list.insertLast(8);
		list.insertLast(1);
		list.insertLast(7);
		list.insertLast(2);

		SLL<Integer>list2 = new SLL<Integer>();
		list2.insertLast(1);
		list2.insertLast(5);
		list2.insertLast(3);
		SLL<Integer>list3 = new SLL<Integer>();

		SLL<SLL<Integer>> listi= new SLL<SLL<Integer>>();
		
		listi.insertLast(list);
		listi.insertLast(list2);
		listi.insertLast(list3);
		
		System.out.println(listi);
		
		System.out.println(presmetajProizvod(listi));
	}

}
