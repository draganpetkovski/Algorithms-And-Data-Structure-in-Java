
public class Delete {
	
	
	
	
	/*Delete first given integer n */
	public static SLL<Integer> deleteFirst(SLL<Integer>list,int n){
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp.element!=n) {
			tmp=tmp.succ;
		}
		list.delete(tmp);
		
		
		return list;
	}
	
	/*Delete all given integer n */
	
	public static SLL<Integer> deleteAll(SLL<Integer>list,int n){
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null) {
			if(tmp.element==n) {
		list.delete(tmp);}
			tmp=tmp.succ;
		}
		
		return list;
	}
	
	
	/*Delete last given integer n */

public static SLL<Integer> deleteLast(SLL<Integer>list,int n){
		
		SLLNode<Integer>tmp=list.getFirst();
		SLLNode<Integer>last=null;
		
		while(tmp!=null) {
			if(tmp.element==n) {
		last=tmp;}
			tmp=tmp.succ;
		}
		
		list.delete(last);
		
		return list;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SLL<Integer>list= new SLL<Integer>();
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(7);
		list.insertLast(4);
		list.insertLast(5);
		list.insertLast(7);
		list.insertLast(6);
		list.insertLast(7);


//		System.out.println(deleteFirst(list,7));
		System.out.println(deleteLast(list,7));
		
		System.out.println(list);

	}

}
