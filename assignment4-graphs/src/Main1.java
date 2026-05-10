public class Main1 {
    public static void main(String[] args) {
        //__________________________________________________SMALL___________10_____________
        Graph small = new Graph();
        Vertex[] verticesS = new Vertex[10];
        for (int i =0; i<10; i++){ // create 10 vertices
            verticesS[i] = new Vertex(i);
        }
        for(int i=0; i<9; i++){
            small.addEdge(verticesS[i], verticesS[i+1]); // add 10 edges directed
        }
        small.addEdge(verticesS[9], verticesS[1]);
        //__________________________________________________MEDIUM___________30_____________
        Graph mid = new Graph();
        Vertex[] verticesM = new Vertex[30];
        for (int i =0; i<30; i++){ // create 30 vertices
            verticesM[i] = new Vertex(i);
        }
        for(int i=1; i<29; i++){
            mid.addEdge(verticesM[i], verticesM[i+1]); // add 30 edges directed
        }
        mid.addEdge(verticesM[29], verticesM[1]);
        //__________________________________________________LARGE___________100_____________
        Graph large = new Graph();
        Vertex[] verticesL = new Vertex[100];
        for (int i =1; i<100; i++){ // create 100 vertices
            verticesL[i] = new Vertex(i);
        }
        for(int i=1; i<99; i++){
            large.addEdge(verticesL[i], verticesL[i+1]); // add 100 edges directed
        }
        large.addEdge(verticesL[99], verticesL[1]);

        //__________________________________________________BFS___________TRAVERSAL_____________
        long start;
        long end;

        start = System.nanoTime();
        small.bfs(verticesS[9]);
        end = System.nanoTime();
        long small_bfs = end - start;

        start = System.nanoTime();
        mid.bfs(verticesM[9]);
        end = System.nanoTime();
        long mid_bfs = end - start;

        start = System.nanoTime();
        large.bfs(verticesL[9]);
        end = System.nanoTime();
        long large_bfs = end - start;

        small.printGraph();

        System.out.println("Small bfs: "+ small_bfs);
        System.out.println("Medium bfs: "+ mid_bfs);
        System.out.println("Large bfs: "+ large_bfs);
        //__________________________________________________DFS___________TRAVERSAL_____________
        start = System.nanoTime();
        small.dfs();
        end = System.nanoTime();
        long small_dfs = end - start;

        start = System.nanoTime();
        mid.dfs();
        end = System.nanoTime();
        long mid_dfs = end - start;

        start = System.nanoTime();
        large.dfs();
        end = System.nanoTime();
        long large_dfs = end - start;

        //small.printGraph();

        System.out.println("Small dfs: "+ small_dfs);
        System.out.println("Medium dfs: "+ mid_dfs);
        System.out.println("Large dfs: "+ large_dfs);
    }
}
