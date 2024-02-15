
//Remove every node which has a node with a greater value anywhere to the right side of it.
//Input: head = [5,2,13,3,8]
//Output: [13,8]
//Explanation: The nodes that should be removed are 5, 2 and 3.
//- Node 13 is to the right of node 5.
//- Node 13 is to the right of node 2.
//- Node 8 is to the right of node 3.
public class Test {
	
	public static void remove(SLL<Integer>list){
		
		SLLNode<Integer>tmp=list.getFirst();
		while(tmp!=null && tmp.succ!=null) {
//			boolean flag=true;

			SLLNode<Integer>tmp2=tmp.succ;
			while(tmp2!=null) {
			if(tmp.element<tmp2.element) {
				list.delete(tmp);
//				flag=false;
				break;
//				continue;
				}
//				if(flag==false) {tmp2=null;}
//				else {
				tmp2=tmp2.succ;
//				}
			}
			tmp=tmp.succ;
		}
		
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list = new SLL<Integer>();
		list.insertLast(5);
		list.insertLast(2);
		list.insertLast(13);
		list.insertLast(3);
		list.insertLast(8);
		list.insertLast(2);
		list.insertLast(2);
		list.insertLast(2);
		remove(list);

	}

}
