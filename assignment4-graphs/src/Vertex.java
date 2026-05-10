public class Vertex {
    private int id; // private id - unique identifier 
    public Vertex(int id){
        this.id = id;
    }

    public int getId(){
        return id; // the id getter
    }

    @Override
    public String toString(){
        return "Vertex{ id = "+id+" } "; 
    }
}
