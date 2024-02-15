
public class PushZero {
	
	static void pushZerosToBeginning(int arr[], int n)
	{ 
	    int kraen=n-1;
	    int zeros = 0;
	    for (int j = 6; j >= 0; j--) {
	    	System.out.println("jas se dvizam nazad i sum: " +j + " mojata vrednost e :" +arr[j]);
	    	if(arr[j]!=0) {
	    		arr[kraen]=arr[j];
	    		kraen--;
	    	}
	    	else {
	    		zeros++;
	    	}
	    }
	    System.out.println("Ima " + zeros + " nuli");
	    for(int x=0;x<zeros;x++) {
	    	arr[x]=0;
	    }
	    
	    System.out.println(zeros);
	 
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr []= new int[7];
	
	arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 0;
    arr[4] = 2;
    arr[5] = 0;
    arr[6] = 1;
    
    pushZerosToBeginning(arr,7);

    for (int i = 0; i < 7; i++) {
        System.out.print(arr[i] + " ");
    }
    
	}
}
