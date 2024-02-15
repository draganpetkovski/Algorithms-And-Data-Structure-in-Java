
public class Zadaca {

	
	public static void removeDuplicates(SLL<Integer>list) {
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null && tmp.succ!=null) {
			SLLNode<Integer>tmp2=tmp.succ;
			if(tmp.element==tmp2.element) {
				while(tmp.element==tmp2.element) {
					tmp=tmp.succ;
					tmp2=tmp2.succ;
				}
			}
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.out.println(System.getProperty("java.runtime.version"));

	}

}
