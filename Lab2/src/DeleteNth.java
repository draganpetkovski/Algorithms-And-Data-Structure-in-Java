
public class DeleteNth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SLL<Integer>list= new SLL<Integer>();
	
	
	
	for(int brojac=1;brojac<8;brojac++) {
		list.insertLast(brojac);
	}
	
//	if(13<=list.length()) {
	SLLNode<Integer>tmp=list.getFirst();
	
	while(tmp!=null && tmp.succ!=null) {
	for(int i=0;i<4;i++) {
		if(tmp!=null) {
		tmp=tmp.succ;
		}
	}
	if(tmp!=null) {
	list.delete(tmp);
	tmp=tmp.succ;
	}
	}
	
//	System.out.println(tmp.succ);
	
	
	
	
	
	System.out.println(list);
	}

}
