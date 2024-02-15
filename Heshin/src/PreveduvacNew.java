import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PreveduvacNew {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        OBHT<String, String> table = new OBHT<String, String>(2 * N);
    	
		for(int i=1;i<=N;i++){
			String poimi = br.readLine();
			String[] pom = poimi.split(" ");
            table.insert(pom[1], pom[0]);

		}

		String poim;
        while (!((poim = br.readLine()).equals("KRAJ"))) {
            String prevod = table.search(poim);
            if (prevod == null)
                System.out.println("/");
            else
                System.out.println(prevod);
        }
		
		

	}

}
