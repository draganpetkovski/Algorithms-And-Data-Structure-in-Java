
public class Palindrom {
	
	static boolean checkPal(SLL<Integer>list) {
		
		
		
		SLLNode<Integer>tmp=list.getFirst();
		
		if(list.length()%2==0){
		
		for(int i=0;i<list.length()/2-1;i++) {
			tmp=tmp.succ;
		}
		}
		if(list.length()%2!=0){
			
			for(int i=0;i<list.length()/2;i++) {
				tmp=tmp.succ;
			}
		}
		
		System.out.println(tmp);
		
		SLLNode<Integer> tmp2 = tmp.succ;
		SLLNode<Integer> newsucc = null;
		SLLNode<Integer> next;
		
		while(tmp2 != null){
			next = tmp2.succ;
			tmp2.succ = newsucc;
			newsucc = tmp2;
			tmp2 = next;
		}
		tmp.succ = newsucc;
		System.out.println(list);
		SLLNode<Integer>iterator2=newsucc;
		SLLNode<Integer>iterator1=list.getFirst();
		
		while(iterator2!=null) {
			if(iterator1.element!=iterator2.element) {
				
				return false;
			}
			iterator1=iterator1.succ;
			iterator2=iterator2.succ;

		}
		

		return true;
	}

	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SLL<Integer>list = new SLL<Integer>();

		list.insertLast(1);
		list.insertLast(4);
		list.insertLast(3);
		list.insertLast(2);
		list.insertLast(1);
//
//		list.insertLast(2);
//		list.insertLast(1);

		System.out.println(checkPal(list));
	}

}
