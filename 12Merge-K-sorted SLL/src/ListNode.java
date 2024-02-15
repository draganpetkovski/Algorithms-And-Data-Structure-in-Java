
public class ListNode {
	
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  

	      
	      
	      public static ListNode mergeKLists(ListNode[] lists) {
	 	
	    	  if(lists.length!=0) {
	    		
	    		  ListNode dummy= new ListNode(5,null);
	    		  ListNode tmp=dummy;
	    		  tmp.next=lists[0];
	    		  while(tmp.next!=null) {
	    			  tmp=tmp.next;
	    		  }
	    		  
	    		  for(int j=1;j<lists.length;j++) {
	    			  if(lists[j]!=null) {
	    				  tmp.next=lists[j];
	    			  }
	    			  while(tmp.next!=null) {
	    				  tmp=tmp.next;
	    			  }
	    			  
	    		  }
	    		  
//	    		  System.out.println(tmp.val);
	    		  
	    		  tmp=dummy.next;
	    		  while(tmp!=null && tmp.next!=null) {
	    		
	    			  ListNode tmp2=tmp.next;
	    			  while(tmp2!=null) {
	    				  if(tmp.val>tmp2.val) {
	    					  int pom=tmp.val;
	    					  tmp.val=tmp2.val;
	    					  tmp2.val=pom;
	    				  }
	    				  tmp2=tmp2.next;
	    			  }
	    			  tmp=tmp.next;
	    			  
	    		  }
	    		  
	    		while(dummy!=null) {
	    		System.out.println(dummy.val+ "->");
	    		dummy=dummy.next;
	    		}
	    		  
	    	  }
	    	  
	    	  
	    	  
	 		 
	 		 return null;
	 	 }
	 	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	ListNode[] arr = new ListNode[3];
	 
    arr[0] = new ListNode(1);
    arr[0].next = new ListNode(3);
    arr[0].next.next = new ListNode(5);
    arr[0].next.next.next = new ListNode(7);
    arr[1] = new ListNode(9);
    arr[1].next = new ListNode(11);
    arr[1].next.next = new ListNode(13);
    arr[1].next.next.next = new ListNode(15);
	
    mergeKLists(arr);
	
	
	
	
	 

}

}