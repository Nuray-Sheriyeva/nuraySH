public class Edge {
    private Vertex source; 
    private Vertex dest;
    public Edge(Vertex source, Vertex dest){ //constructor
        this.source = source;
        this.dest = dest;
    }

    public Vertex getSource(){ //get source vertex
        return source;
    }
    public Vertex getDest(){ //get destination vertex
        return dest;
    }

    @Override
    public String toString(){ // convert to string
        return "Edge{ source = "+ source +" } \n Edge{ destination = " + dest + " } " ;
    }
}
