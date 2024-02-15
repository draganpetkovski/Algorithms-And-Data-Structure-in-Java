
public class ListaStringovi {
	
	public static void putWordsTogether(SLL<String>list) {
		
		SLLNode<String>prv=list.getFirst();
		SLLNode<String>tmp=list.getFirst();

		String zbor="";
			while(tmp!=null && !(tmp.element.equals(","))) {
				zbor+=tmp.element;
				tmp=tmp.succ;
			}
		
		prv.element=zbor;
		prv.succ=null;
		System.out.println(prv.element);
		
		if(tmp==null) { return;}
		int count=0;
		zbor="";
		System.out.println(tmp);
		while(tmp!=null) {
			System.out.println("tmp vnatre vo ciklus "+ count++ +tmp.element);
			if(tmp.element.equals(",")) {tmp=tmp.succ;}
			else {
			while(tmp!=null && !(tmp.element.equals(","))) {
				zbor+=tmp.element;
				tmp=tmp.succ;
			}
			System.out.println("tmp 2 nivo "+tmp);
			System.out.println(zbor);
			
			prv.succ= new SLLNode<String>(zbor,null);
			System.out.println("Prv"+ prv.succ);
			prv=prv.succ;
			zbor="";
			if(tmp==null) {break;}
			tmp=tmp.succ;
			}
		}
		System.out.println("lista"+ list);
		
		
		System.out.println(list);

		
		
		
//		zbor="";
//		while(tmp!=null) {
//			if(tmp.element!=",") {
//				tmp=tmp.succ;
//			}
//			while(tmp!=null || tmp.element!=","){
//				zbor+=tmp.element;
//				tmp=tmp.succ;
//			}
//			prv.succ= new SLLNode<String>(zbor,null);
//			prv=prv.succ;
//		}

//		System.out.println(list);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<String>list= new SLL<String>();
		list.insertLast("c");
		list.insertLast("a");
		list.insertLast("t");
		list.insertLast(",");
		list.insertLast("d");
		list.insertLast("o");
		list.insertLast("g");
////		list.insertLast(",");
		
		putWordsTogether(list);
		
		System.out.println(list);

	}

}
