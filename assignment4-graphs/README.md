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

4. **printGraph()**
   
   loops through every vertex and prints its each neighbor to print the whole graph structure

5. **dfs()**
   
   creates _visited_ list to store vertices that were already visited using set.

   checks each vertex if it is in _visited_ and if not run visitVertex(v, visited)

7. **visitVertex(Vertex v, Set<Vertex> visited)**
   
   adds the input vertex v into the list of visited vertices.

   gets its neighbors.

   for each neighbor repeats the process of recursively adding vertices to visited set

9. **bfs(Vertex start)**
   
   creates visited set and queue (queue because both queue and bfs use FIFO (first is first out)).

   adds the starting vertex to visited set and queue.

   creates while loop that stops only when queue gets empty.

     delete fron vertex from queue.

     get the neighbors of the vertex.

     for each neighbor, add it to the visited set and queue.

• Adjacency list representation

For this assignment, I chose to work with linked list structure. You can observe it in creating queue for bfs(): 

Queue<Vertex> q = new LinkedList<>(); //linked list useful when there are many inserts

For instance, a small graph of 5 elements could look like this in adjacency list representation:

graph[0] = [1]

graph[1] = [0, 2 ,3]

graph[2] = [1, 5]

graph[3] = [3, 4, 5]

graph[4] = [5]

graph[5] = [2, 3]

## C. Algorithm Descriptions
• BFS

Breadth-First Search is a layer-by-layer traversal technique. It utilizes queue to travers through a labyrinth/maze/graph. Algorithm is structured as followed (in general) :

1. Initialize queue and set (to store visited vertecies/nodes/tiles)
2. Start from the index given or by default from the root and enqueue it.
3. While the queue is not empty perform the followings:
4.    dequeue the vertex/node/tile
5.    get the neighbors ( in general we check if vertex/node/tile is the goal)
6.    enqueue the neighbors
7. Repeat the loop

• DFS
Depth-First Search is a path-oriented traversal technique. It may utilize a stack or recursion to travers through the same scenario. Algorithm is structured as followed (in general):

1. Initialize a set to store visited vertices.
2. Push the root to the set.
3. For each element in the structure performs the following:
4.     add to the _visited_ set.
5.     get the neighbors.
6.     recursively add and get the vertices.

Both have time complexity of O(V+E) because i used adjacency list.
## D. Experiment Results
• Comparison Table
<img width="786" height="468" alt="image" src="https://github.com/user-attachments/assets/19722869-c94d-4d2a-ac52-7c292c36991e" />

• Obervations
I have run 10 runs with relative starts for breadth first search and depth first search. I have observed the time to be mostly remain the same throughout the runs except when i started from the 70% index whose time complexity went abnormally higher. I thought this was just mistake but i run it multiple times at that exact starting point and it always gave the same much higher time. In terms fo depth first search, I have noticed that smaller graphs had higher times and mostly it was the sum of medium and large graphs. I did not figure out why it did that.

## E. Screenshots
<img width="347" height="707" alt="image" src="https://github.com/user-attachments/assets/480128a5-2c9e-46b2-9b2a-1eebbfd05aa1" />

• Performance results
<img width="126" height="321" alt="image" src="https://github.com/user-attachments/assets/957efcde-f0da-4c63-b0df-8e13df3d5881" />
<img width="129" height="531" alt="image" src="https://github.com/user-attachments/assets/d8e63bd3-a4a2-43d6-98ba-9f037223f023" />

## F. Reflection Section
• What you learned about graph traversal

I already new these things so i did not techincally learn something new apart from how to code these in java. Overall, i know that graph consists of ordered pairs from vertices and edges. Graphs have 3 types. It can be traversed using breadth first search and depth first search. Breadth first search is better option when the goal is nearer to the root and depth first search is great when the goal is nearer to the end of a path. However, this is general definition and since we are travesrsing through the whole list it does not really apply here.

• Differences between BFS and DFS

The main difference between these searches is breadth first search goes layer by layer into the graph and depth forst search goes first into each path/branch up until the end.

• Challenges faced during implementation
I did not really face any challenges during implementation except understanding why we need the Experiment.java. I did not see that it needs to be used in the assignment.

## Analysis Quesstions
• How does graph size affect BFS and DFS performance?

In my results, I observed that BFS spends relatively the same amount of time on 10 and 30 elements graph but spends significantly more time on large 100 element graph. DFS, however, spends more time on smaller graphs rather than medium or large graphs and usually the time is the sum of the larger two. But in general i would think that it would affect it linearly, as the graph grows the time grows too. Also, the order for graph sizes in time (in ascending order) would be medium, small, large.

• Which traversal is faster in your experiments?

In medium and large graphs both of the searches spent the same amount of time to traverse through them. Nevertheless, small graphs did differ in times of these two searches. DFS performed way worse than BFS in 10 element graph.

• Do results match the expected complexity O(V + E)?

I dont think so. It did not match for me. Maybe bigger and more time consuming experiments need to be done in order to fully see the time complexity. But I do believe that it is O(V+E).

• How does graph structure affect traversal order?

Because arrangement of vertices and edges determines which neighbors become reachable first during BFS or DFS. Especially in DFS becuase it follows a deep path on eby one so pathes change drastically.

• When is BFS preferred over DFS?

When we have a certain goal we want to reach and it is nearer to the root.

• What are the limitations of DFS?

DFS consume large recursion memory and may get stuck exploring deep paths before finding closer solutions. It also does not gurantee the shortest path.
