/* Da se transformira listata ako ima dva ednopodrugo pozitivni elementi se brise vtoriot,
 *  ako ima dva negativni pomegju niv se vmetnuva nov jazol so apsolutna vrednost od vtoriot element */



public class ZigZag {

	public static void ZigZag(SLL<Integer>list) {
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null) {
			if(tmp.element==0) {
				list.delete(tmp);
			}
			tmp=tmp.succ;
		}
		tmp=list.getFirst();
		
		while(tmp!=null && tmp.succ!=null) {
			if(tmp.element>0 && tmp.succ.element>0) {
				list.delete(tmp.succ);
			}
			if(tmp.element<0 && tmp.succ.element<0) {
				list.insertAfter(Math.abs(tmp.element),tmp);
			}
			tmp=tmp.succ;
		}
		
		System.out.println(list);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SLL<Integer>list = new SLL<Integer>();

		list.insertLast(200);
		list.insertLast(100);
//		list.insertLast(7);
//		list.insertLast(0);

//		list.insertLast(6);
//		list.insertLast(-1);
//		list.insertLast(0);
//		list.insertLast(0);
//		list.insertLast(8);
//		list.insertLast(-9);

//		list.insertLast(0);

//		list.insertLast(7);
//		list.insertLast(7);
//		list.insertLast(-2);
//		list.insertLast(5);


		ZigZag(list);
	}

}
