
import java.util.*;
public class OrganizationalHierarchySolver {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMembers = scanner.nextInt();
        int numberOfCollaborations = scanner.nextInt();

        AdjacencyMatrixGraph<String> graph = new AdjacencyMatrixGraph<>(numberOfMembers);

        for (int i = 0; i < numberOfCollaborations; i++) {
            int member1Id = scanner.nextInt();
            String member1Name = scanner.next();
            int member2Id = scanner.nextInt();
            String member2Name = scanner.next();
            int collaborationDegree = scanner.nextInt();

            graph.addEdge(member1Id, member2Id, collaborationDegree);
        }

        String presidentName = scanner.next();

        scanner.close();

        int[] trees = new int[numberOfMembers];
        for (int i = 0; i < numberOfMembers; i++)
            trees[i] = i;

        List<Edge> mstEdges = graph.adaptedKruskal(trees);

        int totalCollaborationDegree = 0;

        for (Edge edge : mstEdges) {
            totalCollaborationDegree += edge.getWeight();
        }

        System.out.println(totalCollaborationDegree);
    }
}
