
public class isPalindrome<E> {
	
	 public boolean isPalindrome(DLL<E>list) {
		
		
		if(list.getFirst()!=null) {
		DLLNode<E>prv=list.getFirst();
		DLLNode<E>posleden=list.getLast();

		while(prv!=null && posleden!=null) {
			
			if(!(prv.element.equals(posleden.element))) {
				return false;
				
			}
			prv=prv.succ;
			posleden=posleden.pred;
			
		}
		
		}
		
		
		
		return true;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL<Integer>list=new DLL<Integer>();
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(3);

		list.insertLast(2);
		list.insertLast(1);
		list.insertLast(1);


		isPalindrome<Integer>ref=new isPalindrome();
		System.out.println(ref.isPalindrome(list));
		
		

	}

}
