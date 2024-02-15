
public class SwapNodes {

	public static void swap(SLL<Integer>list,SLLNode<Integer> node1, SLLNode<Integer>node2){
		
	
	
	
	if(node1==list.getFirst() && node1.succ!=node2) {
		SLLNode<Integer>tmp=list.getFirst();

		while(tmp.succ!=node2) {
			tmp=tmp.succ;
			System.out.println(tmp);
		}
		SLLNode<Integer>prev=tmp;	
		SLLNode<Integer>next1=node1.succ;
		SLLNode<Integer>next2=node2.succ;

		
		list.setFirst(node2);
		node2.succ=next1;
		prev.succ=node1;
		node1.succ=next2;
		return;
	}
	else if(node1==list.getFirst() && node1.succ==node2) {
		System.out.println("Vleze");
		
		SLLNode<Integer>tmp=node2.succ;
		list.setFirst(node2);
		node2.succ=node1;
		node1.succ=tmp;
		
	}
	else if(node1!=list.getFirst() && node1.succ==node2) {
		System.out.println("vleze u greska");
		SLLNode<Integer>tmp=list.getFirst();
		while(tmp.succ!=node1) {
			tmp=tmp.succ;
		}
		SLLNode<Integer>prev1=tmp;
		SLLNode<Integer>next2=node2.succ;
		prev1.succ=node2;
		node2.succ=node1;
		node1.succ=next2;
	}
	
	else {
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp.succ!=node1) {
			tmp=tmp.succ;
		}
		SLLNode<Integer>prev1=tmp;
		SLLNode<Integer>next1=node1.succ;
		System.out.println(prev1);
		System.out.println(next1);
		
		while(tmp.succ!=node2) {
			tmp=tmp.succ;
		}
		SLLNode<Integer>prev2=tmp;
		SLLNode<Integer>next2=node2.succ;
		System.out.println(prev2);
		System.out.println(next2);
		
		prev1.succ=node2;
		node2.succ=next1;
		prev2.succ=node1;
		node1.succ=next2;
		
	}
	
		
		
	
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list=new SLL<Integer>();
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(2);
		list.insertLast(1);


		SLLNode<Integer>node1=list.find(1);
		SLLNode<Integer>node2=list.find(5);
		
		System.out.println(list);
		
		
		System.out.println("Node1: "+ node1 + " Node2: "+node2);
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null) {
			SLLNode<Integer>tmp2=tmp.succ;
				while(tmp2!=null) {
					if(tmp.element>tmp2.element) {
						SLLNode<Integer>prob1=tmp;	
						SLLNode<Integer>prov2=tmp2;
						System.out.println("se sporeduva tmp1 "+ tmp + " so :"+ tmp2);
						swap(list,prob1,prov2);
						tmp2=tmp.succ;

					}
					else{
					tmp2=tmp2.succ;}
				}
				tmp=tmp.succ;
		}
		
		
		


		System.out.println(list);
	}

}
