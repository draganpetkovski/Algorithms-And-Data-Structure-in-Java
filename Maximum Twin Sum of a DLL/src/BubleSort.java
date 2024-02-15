
public class BubleSort {
	
	 public static void sort(DLL<Integer>list){
	        
	        
	        if(list.getFirst()!=null){
	        
	            boolean changes=true;
	            DLLNode<Integer>dvizi;
	            DLLNode<Integer>dvizi2;
	            while(changes){
	                changes=false;
	                // Koga nema promena vo listata changes ostanuva false i listata e sortirana
	                dvizi=list.getFirst();
	                    while(dvizi.succ!=null){
	                        dvizi2=dvizi.succ;
	                        if(dvizi.element>dvizi2.element){
	                            int pom=dvizi.element;
	                            dvizi.element=dvizi2.element;
	                            dvizi2.element=pom;
	                            changes=true;
	                            
	                            System.out.println(list);
	                        }
	                        dvizi=dvizi.succ;
	                    }
	                    
	            }
	            
	            dvizi=list.getFirst();
	                while(dvizi!=null){    
	                 System.out.print(dvizi.element + " ");
	                 dvizi=dvizi.succ;
	                }
	        
	        
	        }
	        
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DLL<Integer>list= new DLL<Integer>();
		
		list.insertLast(5);	
		list.insertLast(3);	
		list.insertLast(6);	
		list.insertLast(1);	
		
		sort(list);
		
	
	}

}
