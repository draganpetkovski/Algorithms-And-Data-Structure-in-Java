
public class isPalindrome {

	static boolean isPalindrome(SLL<Integer>list) {
		
		if(list.getFirst()!=null) {
			SLL<Integer>pomosna= new SLL<Integer>();
			SLLNode<Integer>tmp=list.getFirst();
			while(tmp!=null) {
				pomosna.insertFirst(tmp.element);
				tmp=tmp.succ;
			}
			SLLNode<Integer>tmp2=pomosna.getFirst();
			tmp=list.getFirst();
			
			while(tmp!=null) {
				if(!(tmp.element.equals(tmp2.element))) {
					return false;
				
				}
				tmp=tmp.succ;
				tmp2=tmp2.succ;
			}	
			
		}
				
		return true;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL<Integer>list = new SLL<Integer>();

		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(2);
		list.insertLast(1);

		SLL<Integer>list2 = new SLL<Integer>();

		list2.insertLast(4);
		list2.insertLast(4);
		list2.insertLast(4);
		list2.insertLast(4);
		
		System.out.println(isPalindrome(list));

	}

}
