
public class DeleteNafterM {

	public static SLL<Integer> NafterM(SLL<Integer>list,int n, int m){
		
		if(n>list.length()) {
			System.out.println("Nevalidna golemina");
			return null;
		}
		
		if(m==0 || n==0) {
			
			return list;
		}
		
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null) {
		for(int i=0;i<n-1 && tmp!=null;i++) {
			
			tmp=tmp.succ;
			
		}
		if(tmp!=null) {
		
		SLLNode<Integer>tmp2=tmp.succ;
		
		for(int j=0;j<m-1 && tmp2!=null;j++) {
			tmp2=tmp2.succ;
			
		}
			if(tmp2!=null) {
			tmp.succ=tmp2.succ;
			}
			else {
				tmp.succ=null;
			}
			}
			
			tmp=tmp.succ;
		}
		
		return list;
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
		list.insertLast(8);
		list.insertLast(9);
		list.insertLast(10);


		System.out.println(NafterM(list,6,0));
		
		

	}

}
