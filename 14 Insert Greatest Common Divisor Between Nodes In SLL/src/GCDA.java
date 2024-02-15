//Insert Greatest Common Divisors in Linked List
//
//
//Given the head of a linked list head, in which each node contains an integer value.
//
//Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
//
//Return the linked list after insertion.
//
//The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.




public class GCDA {
	
	public  static int findGCD(int n,int m) {
		int i=1;
		int gcd=1;
		while(i<=n && i<=m ) {
			if(n%i==0 && m%i==0) {
				gcd=i;
			}
			i++;
		}		
		return gcd;
	}
	
	public static void insertGCD(SLL<Integer>list) {
		if(list.length()==0 || list.length()==1) {
			return ;
		}
		
		SLLNode<Integer>tmp=list.getFirst();
		while(tmp!=null && tmp.succ!=null) {
			SLLNode<Integer>tmp2=tmp.succ;
			int broj=findGCD(tmp.element,tmp2.element);
			SLLNode<Integer>middle=new SLLNode<Integer>(broj,tmp2);
			tmp.succ=middle;
			tmp=tmp2;			
		}
		
		System.out.println(list);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list = new SLL<Integer>();
		list.insertLast(2);
		list.insertLast(5);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(6);
		list.insertLast(2);
		list.insertLast(2);		
		insertGCD(list);
	}

}
