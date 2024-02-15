
public class RemoveDuplicatesTwo {

	
	public static void removeDuplicates(SLL<Integer>list) {
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp.succ!=null) {
			SLLNode<Integer>tmp2=tmp.succ;
			
				if(tmp.element==tmp2.element) {
					list.delete(tmp);
					tmp=tmp2;
					list.delete(tmp2);
				}
				
				else {
					tmp=tmp.succ;
				}
		}
		
		
		System.out.println(list);
		
	}
	
	public static void removeDuplicatesList(SLL<Integer>list) {
		
		SLL<Integer>pom=new SLL<Integer>();
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null) {
			SLLNode<Integer>tmp2=tmp.succ;
				boolean isDuplicate=false;
			
				while(tmp2!=null && tmp2.element==tmp.element) {
					isDuplicate=true;
					tmp2=tmp2.succ;
				}
				
				if(!isDuplicate) {
					pom.insertLast(tmp.element);
				}
				
					tmp=tmp2;
				
		}
		
		
		System.out.println(pom);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list= new SLL<Integer>();
		
		list.insertLast(1);
		list.insertLast(1);
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(2);

		list.insertLast(3);
		list.insertLast(3);
		list.insertLast(3);

//		
		System.out.println(list);

		removeDuplicatesList(list);
		
		
	}

}
