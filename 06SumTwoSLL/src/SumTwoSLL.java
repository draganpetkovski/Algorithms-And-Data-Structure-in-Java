
public class SumTwoSLL {
	
	public static SLL<Integer> suma(SLL<Integer>list1,SLL<Integer>list2){
		
		if(list1.getFirst()==null || list2.getFirst()==null) {
			System.out.println("Imate vneseno prazna lista");
		}
		
		
		SLLNode<Integer>tmp=list1.getFirst();	
		SLLNode<Integer>tmp2=list2.getFirst();
		
		int stepen=list1.length()-1;
		int prvBroj=0;
		while(tmp!=null) {
			prvBroj+=tmp.element*(Math.round(Math.pow(10, stepen)));
			tmp=tmp.succ;
			stepen--;
			
		}
		int vtorBroj=0;
		stepen=list2.length()-1;

		while(tmp2!=null) {
			vtorBroj+=tmp2.element*(Math.round(Math.pow(10, stepen)));
			tmp2=tmp2.succ;
			stepen--;
			
		}
		
		int tret=prvBroj+vtorBroj;
		
		SLL<Integer>rezultantna= new SLL<Integer>();
		
		while(tret!=0) {
			rezultantna.insertFirst(tret%10);
			tret=tret/10;
		}
		
		
		return rezultantna;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SLL<Integer>list = new SLL<Integer>();

		list.insertLast(5);
		list.insertLast(5);
		list.insertLast(5);
		list.insertLast(5);
		SLL<Integer>list2 = new SLL<Integer>();

		list2.insertLast(4);
		list2.insertLast(4);
		list2.insertLast(4);
		list2.insertLast(4);
		
		System.out.println(suma(list,list2));

	}

}
