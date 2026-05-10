import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Graph{    
    // Adjacency list part: each key stores a list of its neighbors (other adjacent vertices)
    private Map<Vertex, List<Vertex>> map = new HashMap<>();
    //            A  -> [B, C, D, E] 
    // with map we can easily find list  |   
    // of neighbors with just the vertex |
    
    public void addVertex(Vertex v) {
        if (!map.containsKey(v)) // only adds vertex if it does not already exist
            map.put(v, new LinkedList<>()); // create empty list of neighbors for this specific vertex
    }

    public void addEdge(Vertex from, Vertex to) { // directed
        if (!map.containsKey(from)) // creates the source only if it doesn't exist already
            addVertex(from);
    
        if(!map.containsKey(to)) // creates the destination only if it doesn't exist already
            addVertex(to);

        map.get(from).add(to); // adds dest vertex into source vertex neighbors list
    }
    public void printGraph(){
        for(Vertex v : map.keySet()){ // loops through every vertex in graph
            System.out.println(v + " -> "); //print current vertex pointing to neighbor

            List<Vertex> neighbors = map.get(v); // gets all neighbors of the current vertex

            for(int i =0; i < neighbors.size(); i++){ //loops through neighbors
                Vertex w = neighbors.get(i); // get one vertex
                System.out.print(w + " "); //print it
            }

            System.out.println();
        }
    }

    public void dfs() {
        // stores already visited vertices
        Set<Vertex> visited = new HashSet<>();
        // set doesn't allow duplicates which is useful to have to have exact list of vertices visited
        
        for (Vertex v : map.keySet()){
            if(!visited.contains(v)){ // starts DFS if vertex wasn't visited before
                visitVertex(v, visited); // by calling visitVertex function
            }
        }
    }
    public void bfs(Vertex start){
        // stores visited vertices
        Set<Vertex> visited = new HashSet<>();
        // we use queue in bfs 
        Queue<Vertex> q = new LinkedList<>(); //linked list useful when there are many inserts
        // bfs is similar to fifo so queue is used
        // Fifo: A -> B -> C which bfs does too 
        
        // marks the starting vertex as visited
        visited.add(start);
        // adds start vertex into queue
        q.add(start);

        while (!q.isEmpty()){ //until queue becomes empty do these
            Vertex u = q.poll(); // removes front vertex from queue

            List<Vertex> neighbors = map.get(u); // gets the neighbors of current vertex

            for(int i =0; i < neighbors.size(); i++){ 
                Vertex w = neighbors.get(i); // gets each neighbor

                if(!visited.contains(w)){ // if neighbor is not visited 
                    visited.add(w); // marks it as visited
                    q.add(w); // adds into queue
                }
            }
        }
    }
    public void visitVertex(Vertex v, Set<Vertex> visited){
        visited.add(v); // marks input vertex as visited 
        
        List<Vertex> neighbors = map.get(v); // gets the neighbors of input vertex

        for(int i =0; i < neighbors.size(); i++){
            Vertex w = neighbors.get(i); // gets each neighbor each loop 
            
            if(!visited.contains(w)){ // if neighbor is not visited then recursively visit all of them
                visitVertex(w, visited);
            }
        }
    
    }
}