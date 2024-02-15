
public class DeleteDuplicates {

	public static void removeDuplicates(SLL<Integer>list) {
		if(list.getFirst()==null) {
			return;
		}
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null && tmp.succ!=null) {
			SLLNode<Integer>tmp2=tmp.succ;
				while(tmp2!=null) {
					if(tmp.element==tmp2.element) {
						list.delete(tmp2);
					}
					tmp2=tmp2.succ;
				}
				tmp=tmp.succ;		
		}
		
		System.out.println(list);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list = new SLL<Integer>();

		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(4);
		list.insertLast(4);

		list.insertLast(1);
		list.insertLast(1);
		list.insertLast(1);



		removeDuplicates(list);
		
		
		
		
	}

}
