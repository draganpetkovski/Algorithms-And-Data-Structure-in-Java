
//Partition List
//
//Given the head of a linked list and a value x, partition it such that all nodes less than x come
//before nodes greater than or equal to x.
//
//You should preserve the original relative order of the nodes in each of the two partitions.

//Example 1:
//
//Input: head = [1,4,3,2,5,2], x = 3
//Output: [1,2,2,4,3,5]
//
//Example 2:
//
//Input: head = [2,1], x = 2
//Output: [1,2]



public class Partition {
	
	public static void partition(SLL<Integer>list,int x) {
		
		if(list.getFirst()==null) {return;}
		
		SLLNode<Integer>proben=null;
		proben=list.find(x);
//		System.out.println(proben);
		if(proben.element!=x) 
		{
		}
		
		
		else {
		
		SLLNode<Integer>tmp=list.getFirst();
		
		SLLNode<Integer>dvizi1=new SLLNode<Integer>(0,null);
		SLLNode<Integer>dvizi2=new SLLNode<Integer>(0,null);
		SLLNode<Integer>prv=dvizi1;
		SLLNode<Integer>vtor=dvizi2;

		
		while(tmp!=null) {
			if(tmp.element<x) {
				dvizi1.succ=new SLLNode<Integer>(tmp.element,null);
				dvizi1=dvizi1.succ;
			}
			else {
				dvizi2.succ=new SLLNode<Integer>(tmp.element,null);
				dvizi2=dvizi2.succ;
			}
			tmp=tmp.succ;
		}
		if(prv.succ!=null) {
		list.setFirst(prv.succ);
		dvizi1.succ=vtor.succ;
		}
		else if(vtor.succ!=null) {
			list.setFirst(vtor.succ);
		}
		
		System.out.println(list);
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SLL<Integer>list=new SLL<Integer>();
		list.insertLast(3);
		list.insertLast(2);
		list.insertLast(1);
		list.insertLast(4);

		
		partition(list,5);

	}

}


