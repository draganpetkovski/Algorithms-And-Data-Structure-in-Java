import java.util.Scanner;

public class ParenBrojPojavuvanja {

	public static void change(SLL<Integer> list, int br) {
	 SLLNode<Integer>tmp=list.getFirst();
	 
	 int counter=0;
		while(tmp!=null) {
			if(tmp.element==br) {
				counter++;
			}
			tmp=tmp.succ;
		}
		
		System.out.println(counter);
		
		if(counter%2!=0 && counter!=0) {
			SLLNode<Integer>tmp2=list.getFirst();
			
			if(tmp2.element==br) {
				list.insertFirst(br);
			}
			
			else
			{
				while(tmp2.element!=br) {
					tmp2=tmp2.succ;
				}
				
				list.insertBefore(br, tmp2);
				
				
			}
			
			
		}
		
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int n, broj;
	        SLL<Integer> list1 = new SLL<Integer>();
	        n = scan.nextInt();
	        for(int i = 0; i<n; i++) {
	        list1.insertLast(scan.nextInt());
	        }
	      int br = scan.nextInt();
	      change(list1,br);
	      System.out.println(list1);


	}

}
