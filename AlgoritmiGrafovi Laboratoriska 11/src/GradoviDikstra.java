import java.util.*;

public class GradoviDikstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AdjacencyListGraph<String>graph = new AdjacencyListGraph<String>();
		
        Scanner sc = new Scanner(System.in);

        int brojGradovi= Integer.parseInt(sc.nextLine());
        
        int brojNasoceni = Integer.parseInt(sc.nextLine());
		
//		for(int i=0;i<brojGradovi;i++) {
//			
//			int brojPoceten= sc.nextInt();;
//			String imePoceten= sc.next();
//			int brojKraen=sc.nextInt();
//			String imeKraen= sc.next();
//			int dolzina=sc.nextInt();
//			
//			 String poceten = brojPoceten + " " + imePoceten;
//	         String kraen = brojKraen + " " + imeKraen;
//
//	            graph.addEdge(poceten, kraen, dolzina);
//
//		}
        
        for (int i = 0; i < brojGradovi; i++) {
            String[] line = sc.nextLine().split(" ");
            
            int brojPoceten = Integer.parseInt(line[0]);
            String imePoceten = line[1];
            int brojKraen = Integer.parseInt(line[2]);
            String imeKraen = line[3];
            int dolzina = Integer.parseInt(line[4]);

            String poceten = brojPoceten + " " + imePoceten;
            String kraen = brojKraen + " " + imeKraen;

            graph.addEdge(poceten, kraen, dolzina);
        }
		
		String gradOd = sc.next();
        String gradDo = sc.next();
        
        sc.close();
        Map<String, Integer> distances = graph.shortestPath(gradDo);
        System.out.println(distances.get(gradDo) + distances.get(gradOd));		
       
	}

}
