
public class TwinSum {

	public static int getMaxSum(DLL<Integer>list) {
		
		if(list.length()%2==0) {
			DLLNode<Integer>dvizi=list.getFirst();
			DLLNode<Integer>dvizi2=list.getLast();
			int max=dvizi.element+dvizi2.element;
			
			while(dvizi!=null) {
				if(dvizi.element+dvizi2.element > max) {
					max=dvizi.element+dvizi2.element;
				}
				dvizi=dvizi.succ;
				dvizi2=dvizi2.pred;
			}
			
			return max;			
		}
		
		
		
		
		return -1;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL<Integer>list=new DLL<Integer>();
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(3);
		list.insertLast(2);
		list.insertLast(1);

		System.out.println(getMaxSum(list));

	}

}
