
public class BinaryDec {
	
	public static int convert(SLL<Integer>list) {
		SLLNode<Integer>tmp=list.getFirst();
		
		int suma=0;
		int stepen=list.length()-1;
		while(tmp!=null) {
			
			suma+=tmp.element*Math.round(Math.pow(2, stepen));
			stepen--;
			tmp=tmp.succ;
			}		
		return suma;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list = new SLL<Integer>();
		
		list.insertLast(1);
		list.insertLast(0);
		list.insertLast(1);
		list.insertLast(0);

		SLLNode<Integer>tmp=list.getFirst();
		
//		int suma=0;
//		int stepen=list.length()-1;
//		while(tmp!=null) {
//			
//			suma+=tmp.element*Math.round(Math.pow(2, stepen));
//			stepen--;
//			tmp=tmp.succ;
//		}
		
		System.out.println(convert(list));
		
	}

}
