package lab3;

import java.util.Scanner;

public class CountWordPairs {

    //TODO: implement function
    public static int countWordPairs(String [] words) {
        
    	int dolzina=words.length;
    	int i=0;
    	int brojIsti=0;
    	while(i<dolzina) {
    		int j=i+1;
    		while(j<dolzina) {
    			if(words[i].charAt(0)==words[j].charAt(0)) {
    				brojIsti++;
    			}
    			j++;
    			}

    		
    		i++;
    	}
    	
    	return brojIsti;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        String words[] = new String[N];

        for(int i=0;i<N;i++) {
            words[i] = input.next();
        }

        System.out.println(countWordPairs(words));

    }
}