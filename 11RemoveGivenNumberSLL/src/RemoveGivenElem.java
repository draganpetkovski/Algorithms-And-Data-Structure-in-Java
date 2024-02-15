//Given the head of a linked list and an integer val, 
//remove all the nodes of the linked list that has Node.val == val, 
//and return the new head.



public class RemoveGivenElem {
	
	public static void removeElement(SLL<Integer>list,int n) {
		if(list.getFirst()==null) {
			return;
		}
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null) {
			if(tmp.element.equals(n)) {
				list.delete(tmp);
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

		removeElement(list,1);
		
		System.out.println(list);
		
		
	}

}
