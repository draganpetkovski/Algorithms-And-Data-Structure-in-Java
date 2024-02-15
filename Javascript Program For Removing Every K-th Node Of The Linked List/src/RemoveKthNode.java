
public class RemoveKthNode {
	
	
	public static void remove(SLL<Integer>list,int k) {
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null) {
			for(int i=1;i<k && tmp!=null;i++) {
				tmp=tmp.succ;
			}
			if(tmp!=null) {
			list.delete(tmp);
			tmp=tmp.succ;
			}
		}
		
		System.out.println(list);
		
		
	}
	
	public static void removeNM(SLL<Integer>list,int m, int n) {
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null) {
			for(int i=1;i<m && tmp!=null;i++) {
				tmp=tmp.succ;
			}
		
			if(tmp==null) {
				return;
			}
			SLLNode<Integer>tmp2=tmp.succ;
			
		
			
			for(int j=1;j<n && tmp2!=null;j++) {
				tmp2=tmp2.succ;
			}
			
			tmp.succ=(tmp2==null) ? null :tmp2.succ;
			tmp=tmp.succ;
			
		}
		
		System.out.println(list);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL<Integer>list= new SLL<Integer>();
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(5);
		list.insertLast(6);
		list.insertLast(7);
		list.insertLast(8);
		list.insertLast(9);
		list.insertLast(10);
		list.insertLast(11);


		
		System.out.println(list);
		
		removeNM(list,3,9);

	}

}
