import java.util.Scanner;

public class ReverseWord {
	
	 public static void printReversed(String word) {
	        
		String reversed="";
		
		for(int i=0;i<word.length();i++) {
			
			reversed= word.charAt(i) + reversed;
		}
		 
		System.out.println(reversed);
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseWord ref = new ReverseWord();
		String zbor;
		
		int n;
		
		Scanner in=new Scanner(System.in);
		
		n=in.nextInt();
		for(int i=0;i<n;i++) {
			zbor=in.next();
		}
	}

}
