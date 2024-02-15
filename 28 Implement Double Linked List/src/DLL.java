
public class DLL<E> {
	private DLLNode<E>first,last;
	
	
	
	
	public DLL(){
		this.first=null;
		this.last=null;
		}
	
	public DLLNode<E> getFirst() {
		return first;
	}

	public DLLNode<E> getLast() {

		return last;
	}
	
	public void insertFirst(E o) {
		
		if(this.first==null) {
			DLLNode<E>ins =new DLLNode<E>(o,null,first);
			if(first==null) {
				last=ins;
			}
//			else first.pred=ins;
			first=ins;
		}
		
	}
	
	public void InsertLast(E o) {
		if(last==null) {
			insertFirst(o);
		}
		else {
			DLLNode<E>ins=new DLLNode<E>(o,last,null);
			last.succ=ins;
			last=ins;
		}
	}
	
	
	public void InsertAfter(E o, DLLNode<E>after) {
		if(after==last) {
			DLLNode<E>ins= new DLLNode<E>(o,last,null);
			last.succ=ins;
		}
		else {
			DLLNode<E>ins= new DLLNode<E>(o,after,after.succ);
			after.succ.pred=ins;
			after.succ=ins;

		}
	}	
	
	
	public void InsertBefore(E o, DLLNode<E>before) {
		if(before==first) {
			insertFirst(o);
		}
		else {
			DLLNode<E>ins=new DLLNode<E>(o,before.pred,before);
			before.pred.succ=ins;
			before.pred=ins;
		}
		
	}
	
	
	
	
	
		
		@Override
		public String toString() {
			String ret = new String();
			if (first != null) {
				DLLNode<E> tmp = first;
				ret += tmp + "<->";
				while (tmp.succ != null) {
					tmp = tmp.succ;
					ret += tmp + "<->";
				}
			} else
				ret = "Prazna lista!!!";
			return ret;
		}
		
		
	
	
	public static void main(String[] args) {
		DLL<Integer>list=new DLL<Integer>();
		
		list.insertFirst(1);
		list.InsertLast(2);
		
		System.out.println(list);
		
		DLLNode<Integer>tmp=list.getFirst();
		DLLNode<Integer>tmp2=list.getLast();

		
		
		System.out.println(tmp.pred);
		System.out.println(tmp.succ);

		System.out.println(tmp2);
		System.out.println(tmp2.pred);
		System.out.println(tmp2.succ);

	}
	
}
