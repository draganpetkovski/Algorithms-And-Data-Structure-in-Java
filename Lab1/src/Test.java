
public class Test {


	
	
	
	
	
	static void pushZerosToBeginning(Array<Integer> arr, int n)
	{
		Array<Integer> zeros = new Array<Integer>(0);
		
	

		for(int i=0;i<n;i++) {
			if(arr.get(i)==0) {
				zeros.insert(0, 0);
			}
		}
		
		for(int i=0;i<n;i++) {
			if(arr.get(i)!=0) {
				zeros.insert(zeros.getLength(), arr.get(i));
			}
		}
		System.out.println("Transformiranata niza e:");
		for(int i=0;i<n;i++) {
			System.out.print(zeros.get(i)+" ");
		}
	
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Array<Integer> niza = new Array<Integer>(8);
		
		niza.set(0, 1);
		niza.set(1, 2);
		niza.set(2, 3);
		niza.set(3, 0);
		niza.set(4, 0);
		niza.set(5, 1);
		niza.set(6, 0);
		niza.set(7, 0);



//		Array<Integer> zeros = new Array<Integer>(0);
//		int i=0;
//		while(i<8) {
//			
//			if(niza.get(i)==0) {
//				zeros.insert(0, 0);
//			}
//			
//				i++;
//				
//		System.out.println("Hello");
//		}
		
//		for(int i=0;i<niza.getLength();i++) {
//			if(niza.get(i)==0) {
//				zeros.insert(0, 0);
//			}
//		}
//		
//		for(int i=0;i<niza.getLength();i++) {
//			if(niza.get(i)!=0) {
//				zeros.insert(zeros.getLength(), niza.get(i));
//			}
//		}
		
		
//		System.out.println(zeros);
		
		Test ref= new Test();
		
		ref.pushZerosToBeginning(niza, 8);
		
	}

}
