package lab3;

public class DLLBattalion {
	
	public  static void battalion(DLL<Integer> list, int a, int b) {
        
		DLLNode<Integer> dvizi=list.getFirst();
		
		DLLNode<Integer>prv=null;
		DLLNode<Integer>vtor=null;
		
		while(dvizi!=null) {
			if(dvizi.element==a) {
				prv=dvizi;
			}
			
			if(dvizi.element==b) {
				vtor=dvizi;
			}
			
			dvizi=dvizi.succ;
		}
	

        DLLNode<Integer> tmp = null;
        DLLNode<Integer> current = prv;
        DLLNode<Integer>last = prv;
        while(current!=null) {
            tmp = current.pred;
            current.pred = current.succ;
            current.succ = tmp;
            current = current.pred;
        }

        if(tmp!=null && tmp.pred!=null) {
            prv=tmp.pred;
        }
		
        DLLNode<Integer>dvizi1=prv;
        DLLNode<Integer>dvizi2=vtor;

        while(dvizi1!=dvizi2) {
        	System.out.println(dvizi1.element);
        	dvizi1=dvizi1.succ;
        }
        	
    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DLL<Integer>list= new DLL<Integer>();
		for(int i=1;i<11;i++)
		list.insertLast(i);

		list.mirror();
		
		battalion(list,1,7);
		
		System.out.println(list);
	}

}
