//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
//		If the two linked lists have no intersection at all, return null.
public class IntersectClass {
	
	public static SLLNode<Integer> intersectionNode(SLL<Integer>list1,SLL<Integer>list2){
		SLLNode<Integer>tmp=list1.getFirst();
		
		while(tmp!=null) {
			SLLNode<Integer>tmp2=list2.getFirst();
			while(tmp2!=null) {
				if(tmp.succ==tmp2) {
					return tmp2;
				}
				
				
				tmp2=tmp2.succ;
			}
			tmp=tmp.succ;
		}
		
		
		
		return null;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL<Integer>list = new SLL<Integer>();

		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(5);
		list.insertLast(6);
		list.insertLast(7);
		list.insertLast(0);
		
//		System.out.println(list.getFirst().succ.succ.succ);
		
		
		SLL<Integer>list2 = new SLL<Integer>();
		list2.insertLast(8);
		list2.insertLast(9);
		
		list2.getFirst().succ.succ=list.getFirst().succ.succ.succ;


		System.out.println(intersectionNode(list,list2));
		
	}

}
