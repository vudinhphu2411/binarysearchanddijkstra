
import java.io.IOException;

import BinarySearch.BinarySearch;
import DijkstraAlgorithm.Edge;
import DijkstraAlgorithm.PathFinder;
import DijkstraAlgorithm.Vert;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Binary Search Example !!!........");
        Thread.sleep(2000);
        BinarySearch runBinarySearch = new BinarySearch();
        runBinarySearch.binarySearch();
        System.out.println("Doneeeee!!!......");
        Thread.sleep(5000);

        System.out.println("");
        System.out.println("Dijkstra Algorithmh Example !!!........");
        Thread.sleep(3000);
        Vert vA = new Vert("A");
        Vert vB = new Vert("B");
        Vert vC = new Vert("C");
        Vert vD = new Vert("D");
        Vert vE = new Vert("E");

        vA.addNeighbour(new Edge(3, vA, vC));
        vA.addNeighbour(new Edge(5, vA, vB));
        vC.addNeighbour(new Edge(2, vC, vB));
        vC.addNeighbour(new Edge(6, vC, vE));
        vC.addNeighbour(new Edge(5, vC, vD));
        vB.addNeighbour(new Edge(4, vB, vC));
        vB.addNeighbour(new Edge(3, vB, vD));
        vB.addNeighbour(new Edge(4, vB, vE));
        vE.addNeighbour(new Edge(2, vE, vD));

        PathFinder shortestPath = new PathFinder();
        shortestPath.ShortestP(vA);
        System.out.println("Minimum distance between node: ");
        System.out.println("A to B: " + vB.getDist());
        System.out.println("A to C: " + vC.getDist());
        System.out.println("A to D: " + vD.getDist());
        System.out.println("A to E: " + vE.getDist());
        System.out.println("Shortest path:");
        System.out.println("A to B: " + shortestPath.getShortestP(vB));
        System.out.println("A to C: " + shortestPath.getShortestP(vC));
        System.out.println("A to D: " + shortestPath.getShortestP(vD));
        System.out.println("A to E: " + shortestPath.getShortestP(vE));
    }
}
