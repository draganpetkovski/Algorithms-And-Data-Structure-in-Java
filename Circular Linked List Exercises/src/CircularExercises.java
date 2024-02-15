
public class CircularExercises {
	
	
	public static boolean isCircular(SLL<Integer>list) {
		if(list.getFirst()==null) {
			return false;
		}
		
		boolean flag=false;
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null && !flag) {
			if(tmp.succ==list.getFirst()) {
				System.out.println("Circular linked list");
			return true;
			}
			tmp=tmp.succ;

		}
		
		
		
		return flag;
	}

	
	static int countNodes(SLL<Integer>list) {
		
		if(list.getFirst()==null) {
			return 0;
		}
		SLLNode<Integer>tmp=list.getFirst();
		int count=1;
		while(tmp.succ!=list.getFirst()) {
			count ++;
			tmp=tmp.succ;
		}
		
		return count;
	} 
	
	
	static void print (SLLNode<Integer>head) {
		
		SLLNode<Integer>temp=head;
		
		do {
			
			System.out.print(temp.element + "--");
			temp=temp.succ;
			
		}while(temp!=head);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list= new SLL<Integer>();
		for(int i=0;i<9;i++) {
		list.insertLast(i);
		}
		SLLNode<Integer>last=list.getFirst();

		while(last.succ!=null) {
			last=last.succ;
		}
		SLLNode<Integer>tmp=list.getFirst();

		last.succ=tmp;
		
//		tmp.succ=tmp;
		
//		System.out.println(list);
		int n=countNodes(list);

//		print(list.getFirst());
		System.out.println(n);
		
	}

}
