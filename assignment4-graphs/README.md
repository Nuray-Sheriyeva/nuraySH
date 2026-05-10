# NURAY SHERIYEVA ASSIGNMENT 4 IT-2501

## A. Project Overview
• Graph Structure 

Graph - an ordered pair (V, E) where V are vertcies and E are edges. 
There are 3 types of graphs: undirected ( no edge orientation), directed (edges with orientation) and edge weighted (edges have associated weights). Graphs can be built on adjacency matrices or adjacency lists, where lists can be in form of linked list or array based list. Adjacency matrix can be accesses by the row and column, where you will get either 1 or 0 depending if these vertices (ith row and jth column) are connected or not respectively. Adjacency list for vertex i is a linear list of adjacent vertices to vertex i.

• Vertices and edges

Vertex is a node and it can contain a set of multiple adjacent vertices. We create it by adding it to the map of adjacency list. Edge is a connection/ path between two vertices. To create an edge between vertices A & B, one must add B to adjacency list of A. When we say a graph is undirected/directed/weighted we refer to its edges. It is the edges that are directed/undirected/weighted and by that we describe the graph.

• Overview of BFS and DFS

BFS explores layer by layer from the nearest node to the start. DFS, on the other hand, explores a path/along edges until it bumps into the end and then chooses to now explore through the last node it did not choose to go through.

## B. Class Descriptions
• Vertex, Edge and Graph classes

My Vertex class has one private variable called id with type integer. Then the constructor assigns id to newly created vertex by processing the input integer number inside the Vertex(). Getter function getId() returns the id of the vertex. toString() generally returns id too but in a formatted and type String way. My Edge class has the same structure and everything with an exception of having to add extra getter for destination.

Graph class is more complex in comparison to previous too. It consists of addVertex(Vertex v), addEdge(Vertex from, Vertex to), printGraph(), dfs(), bfs(Vertex start) and helper function visitVertex(Vertex v, Set<Vertex> visited).

1. **addVertex(Vertex v)**
   
   checks if vertex exists already and if false it creates a vertex by assigning it an empty adjacent vertices (neighbors) list.
   
2. **addEdge(Vertex from, Vertex to)**
   
   checks if _from_ (source) vertex exists already and if false it runs addVertex(from).
   checks if _to_ (destination) vertex exists already and if false it runs addVertex(to).
   adds destination vertex into source vertex's neighbors list

3. **printGraph()**
   
   loops through every vertex and prints its each neighbor to print the whole graph structure

4. **dfs()**
   
   creates _visited_ list to store vertices that were already visited using set.
   checks each vertex if it is in _visited_ and if not run visitVertex(v, visited)

5. **visitVertex(Vertex v, Set<Vertex> visited)**
   
   adds the input vertex v into the list of visited vertices.
   gets its neighbors.
   for each neighbor repeats the process of recursively adding vertices to visited set

6. **bfs(Vertex start)**
   
   creates visited set and queue (queue because both queue and bfs use FIFO (first is first out)).
   adds the starting vertex to visited set and queue.
   creates while loop that stops only when queue gets empty.
     delete fron vertex from queue.
     get the neighbors of the vertex.
     for each neighbor, add it to the visited set and queue.

• Adjacency list representation
## C. Algorithm Descriptions
• BFS

• DFS
## D. Experiment Results
• Comparison Table

• Obervations
## E. Screenshots
• Graph structure output

• BFS traversal output

• DFS traversal output

• Performance results
## F. Reflection Section
• What you learned about graph traversal

• Differences between BFS and DFS

• Challenges faced during implementation

## Analysis Quesstions
• How does graph size affect BFS and DFS performance?

• Which traversal is faster in your experiments?

• Do results match the expected complexity O(V + E)?

• How does graph structure affect traversal order?

• When is BFS preferred over DFS?

• What are the limitations of DFS?
