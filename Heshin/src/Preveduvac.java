import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Preveduvac {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        OBHT<String, String> hashTable = new OBHT<String, String>(2 * n);

        for (int i = 0; i < n; ++i) {
            String[] parts = reader.readLine().split("\\s+");
            hashTable.insert(parts[1], parts[0]);
        }

        String line;
        while (!((line = reader.readLine()).equals("KRAJ"))) {
            String value = hashTable.search(line);
            if (value == null)
                System.out.println("/");
            else
                System.out.println(value);
        }
		
		
		
		
	}

}
