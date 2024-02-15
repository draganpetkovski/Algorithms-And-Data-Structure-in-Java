
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list=new SLL<Integer>();
		list.insertLast(4);
		list.insertLast(6);
		list.insertLast(8);
		list.insertLast(3);
		list.insertLast(1);
		list.insertLast(3);
		list.insertLast(5);
		list.insertLast(7);
		list.insertLast(2);
		list.insertLast(4);

		SLLNode<Integer>tmp=list.getFirst();
		
		int iteracija=1;
		int brojac=1;
		while(tmp!=null) {
			while(tmp!=null && brojac<=iteracija) {
				tmp=tmp.succ;
				brojac++;
			}
			brojac=1;
			if(tmp==null) {break;}
			list.delete(tmp);
			
			iteracija++;
			tmp=tmp.succ;
			
		}
		
		System.out.println(list);
		
	}

}
