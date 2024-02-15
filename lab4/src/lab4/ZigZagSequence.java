package lab4;

public class ZigZagSequence {
	static int najdiNajdolgaCikCak(int a[]) {
		int[] memorija = new int[a.length];
        // Arrays.fill(memorija,1);
        for(int k=0;k<memorija.length;k++){
            memorija[k]=1;
        }
		for(int i=1;i<a.length;i++){
		    if((a[i]>0 && a[i-1]<0) || (a[i]<0 && a[i-1]>0)){
		        memorija[i]=memorija[i-1]+1;
            }
        }
		
            int max = memorija[0];
		 for(int j=0;j<a.length;j++){
			 System.out.println(memorija[j]);
		     if(memorija[j]>max){
		         max=memorija[j];}
		     
		 }
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr []= new int[5];

		
		arr[0]=4;
		arr[1]=-1;
		arr[2]=4;
		arr[3]=-3;
		arr[4]=2;

		
		System.out.println(najdiNajdolgaCikCak(arr));
		
	}

}
