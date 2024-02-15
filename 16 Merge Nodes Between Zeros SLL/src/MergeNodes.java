
public class MergeNodes {

	public static SLL<Integer> merge(SLL<Integer>list){
		if(list.getFirst().element!=0) {return null;}
		
		SLL<Integer>finalna= new SLL<Integer>();
		
		SLLNode<Integer>tmp=list.getFirst();
		while(tmp!=null && tmp.element==0) {
			tmp=tmp.succ;
		}
		
		System.out.println(tmp.element);
		int suma=0;
		
		while(tmp!=null) {
			while(tmp.element!=0) {
				suma+=tmp.element;
				tmp=tmp.succ;
			}
			finalna.insertLast(suma);
			suma=0;
			tmp=tmp.succ;
		}
		
		
		return finalna;
	}
	
	public static void nodeManipulationMerge(SLL<Integer>list) {
		if(list.getFirst()==null || list.getFirst().element!=0) {
			return;
		}
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null && tmp.element==0) {
			tmp=tmp.succ;
		}
		if(tmp==null) {
			return;
		}
		
		int suma=0;
		
		while(tmp!=null && tmp.element!=0) {
			suma+=tmp.element;
			tmp=tmp.succ;
		}
		
		SLLNode<Integer>head= new SLLNode<Integer>(suma,null);
		list.setFirst(head);
		suma=0;
		while(tmp!=null) {
			while(tmp.element!=0 && tmp!=null) {
				suma+=tmp.element;
				tmp=tmp.succ;
				if(tmp==null) {break;}
			}
			if(suma!=0) {
			head.succ=new SLLNode<Integer>(suma,null);
			System.out.println(head);
			head=head.succ;
			}
			suma=0;
			if(tmp!=null) {
				tmp=tmp.succ;

			}
		}
		
		
		System.out.println(list);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SLL<Integer>list = new SLL<Integer>();
		list.insertLast(0);
		list.insertLast(1);
		list.insertLast(0);
		list.insertLast(3);
		list.insertLast(0);
		list.insertLast(2);
		list.insertLast(2);
		list.insertLast(2);

		
//		System.out.println(merge(list));
		nodeManipulationMerge(list);
		

	}

}
