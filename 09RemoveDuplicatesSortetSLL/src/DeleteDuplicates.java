
public class DeleteDuplicates {
	
	static public void removeDuplicates(SLL<Integer>list) {
	if(list.getFirst()==null) {
		return;
	}	
	
	SLLNode<Integer>tmp=list.getFirst();
	while(tmp!=null && tmp.succ!=null) {
		SLLNode<Integer>tmp2=tmp.succ;
		if(tmp.element==tmp2.element)
			{
				tmp.succ=tmp2.succ;
			}	
		else tmp=tmp.succ;	
				
		}
		System.out.println(list);		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SLL<Integer>list = new SLL<Integer>();

		list.insertLast(1);
		list.insertLast(2);
//		list.insertLast(2);
		list.insertLast(3);
//		list.insertLast(4);
		list.insertLast(4);
		list.insertLast(4);

		list.insertLast(5);
		list.insertLast(5);
		list.insertLast(5);



		removeDuplicates(list);
		


	}

}

