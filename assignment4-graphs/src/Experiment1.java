public class Experiment1 {

    long bfsTime;
    long dfsTime;
    
    public void runTraversals(Graph g, Vertex start){

        System.out.println("BFS Traversal: ");
        long startb = System.nanoTime();
        g.bfs(start);
        long endb = System.nanoTime();

        bfsTime = endb - startb;
        System.out.println(" ");

        System.out.println("DFS Traversal: ");
        long startd = System.nanoTime();
        g.dfs();
        long endd = System.nanoTime();

        dfsTime = endd - startd;
        System.out.println(" ");
        
    }
    public void runMultipleTests(){
        Graph g1 = new Graph();

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);

        g1.addEdge(v1, v2);
        g1.addEdge(v2, v3);
        g1.addEdge(v3, v4);
        g1.addEdge(v4, v1);

        System.out.println("Graph 1: ");
        runTraversals(g1, v1);
        printResults();

        Graph g2 = new Graph();

        Vertex a = new Vertex(10);
        Vertex b = new Vertex(20);
        Vertex c = new Vertex(30);
        Vertex d = new Vertex(40);

        g1.addEdge(a, b);
        g1.addEdge(b, c);
        g1.addEdge(c, d);
        g1.addEdge(d, a);

        System.out.println("Graph 2: ");
        runTraversals(g2, a);
        printResults();
    }
    public void printResults(){
        System.out.println("Execution Times: ");
        System.out.println("BFS Time: " + bfsTime + " ns");
        System.out.println("DFS Time: " + dfsTime + " ns");
    }
}
