
public class SwapNodes {
	
	public static void swap(SLL<Integer>list) {
		if(list.getFirst()==null) {
			return;
		}
		
		SLLNode<Integer>tmp=list.getFirst();
		if(tmp.succ!=null) {
			SLLNode<Integer>tmp2=tmp.succ;
			tmp.succ=tmp.succ.succ;
			tmp2.succ=tmp;
			list.setFirst(tmp2);
		}
		
		
		if(tmp==null) {
			return;
		}
		while(tmp!=null) {
			SLLNode<Integer>prev=tmp;
				tmp=tmp.succ;
				

			if(tmp!=null && tmp.succ!=null) {
				SLLNode<Integer>tmp2=tmp.succ;
				tmp.succ=tmp.succ.succ;
				tmp2.succ=tmp;
				prev.succ=tmp2;
			}
			
		}
		
		
			
		System.out.println(list);
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL<Integer>list = new SLL<Integer>();

		list.insertLast(2);
//		list.insertLast(5);
//		list.insertLast(3);
//		list.insertLast(4);
//		list.insertLast(6);
//		list.insertLast(2);
//		list.insertLast(2);


		
		swap(list);
		

	}

}
