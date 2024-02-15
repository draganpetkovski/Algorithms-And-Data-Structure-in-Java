import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int brojKomandi = Integer.parseInt(scanner.nextLine());
        AdjacencyListGraph<Integer> graph = null;

        for (int i = 0; i < brojKomandi; i++) {
            String[] nizaKomandi = scanner.nextLine().split(" ");

            if (nizaKomandi[0].equals("CREATE")) {
                    graph = new AdjacencyListGraph<>();
            }
            
            if (nizaKomandi[0].equals("ADDEDGE")) {
            	 int broj1 = Integer.parseInt(nizaKomandi[1]);
                 int broj2 = Integer.parseInt(nizaKomandi[2]);
                 graph.addEdge(broj1, broj2);
            }
            
            if (nizaKomandi[0].equals("DELETEEDGE")) {
           	 	int broj1 = Integer.parseInt(nizaKomandi[1]);
                int broj2 = Integer.parseInt(nizaKomandi[2]);
                graph.removeEdge(broj1, broj2);
           }
            
           if (nizaKomandi[0].equals("ADJACENT")) {
           	 	int broj1 = Integer.parseInt(nizaKomandi[1]);
                int broj2 = Integer.parseInt(nizaKomandi[2]);
                if(graph.getNeighbors(broj1).contains(broj2)) {
                	System.out.println("True");
                }
                else 
                { System.out.println("False");
                }
           }
         
         
           if (nizaKomandi[0].equals("PRINTGRAPH")) {
        	   
        	   System.out.println(graph);
           }
                
               
        }       
    }
}
