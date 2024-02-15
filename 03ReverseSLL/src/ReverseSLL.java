
public class ReverseSLL {

	public static SLL<Integer> reverse(SLL<Integer>list){
		if(list.getFirst()==null) {
			return null;
		}
		SLLNode<Integer>current=list.getFirst();
		SLLNode<Integer>prev=null;
		
		while(current!=null) {
			SLLNode<Integer>tmp=current.succ;
			current.succ=prev;
			
			prev=current;
			current=tmp;			
		}
		list.setFirst(prev);
		
		
		
		return list;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list = new SLL<Integer>();
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		
		System.out.println(reverse(list));
		
		
		
	}

}
