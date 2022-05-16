package freundschaftsstruktur;

public class Freundschaftsstruktur {

    Graph graph = new Graph();
    
    public Freundschaftsstruktur() {
    }
    
    public void freundschaftsGraphErzeugen() {
        
        Vertex susi = new Vertex("Susi");
        Vertex karl = new Vertex("Karl");
        Vertex lisa = new Vertex("Lisa");
        Vertex jens = new Vertex("Jens");
        Vertex merle = new Vertex("Merle");
        
        graph.addVertex(susi);
        graph.addVertex(karl);
        graph.addVertex(lisa);
        graph.addVertex(jens);
        graph.addVertex(merle);
        
        graph.addEdge(new Edge(susi, karl, 1));
        graph.addEdge(new Edge(susi, lisa, 1));
        graph.addEdge(new Edge(susi, merle, 1));
        
        graph.addEdge(new Edge(karl, lisa, 1));
        graph.addEdge(new Edge(karl, merle, 1));
        graph.addEdge(new Edge(karl, susi, 1));
        graph.addEdge(new Edge(karl, jens, 1));
        
        graph.addEdge(new Edge(lisa, karl, 1));
        graph.addEdge(new Edge(lisa, merle, 1));
        graph.addEdge(new Edge(lisa, susi, 1));
        
        graph.addEdge(new Edge(jens, karl, 1));
        
        graph.addEdge(new Edge(merle, karl, 1));
        graph.addEdge(new Edge(merle, lisa, 1));
        graph.addEdge(new Edge(merle, susi, 1));
        
    }
    
    public boolean checkFriendship(String id1, String id2) {
        
        Vertex v1 = graph.getVertex(id1);
        Vertex v2 = graph.getVertex(id2);
        
        if(graph.getEdge(v1, v2) == null) {
            return false;
        }
        return true;
        
    }
    
    public int getGrad(String id) {
        
        Vertex v = graph.getVertex(id);
        int grad = 0;
        List<Edge> edges = graph.getEdges(v);
        edges.toFirst();
        
        
        while(edges.hasAccess()) {
            grad++;
            edges.next();
        }
        
        return grad;
    }
    
    public int minimalgrad() {
        List<Vertex> vertices = graph.getVertices();
        
        vertices.toFirst();
        Vertex min = vertices.getContent();
        
        while(vertices.hasAccess()) {
            if(getGrad(vertices.getContent().getID()) < getGrad(min.getID())) {
                min = vertices.getContent();
            }
            vertices.next();
        }
        
        return getGrad(min.getID());
    }
    
    public void printGraph() {
        List<Edge> edges =  graph.getEdges();
        
        while(edges.hasAccess()) {
            Vertex[] vertices= edges.getContent().getVertices();
            System.out.println(vertices[0].getID());
            System.out.println(vertices[1].getID());
            System.out.println("------------------");
            edges.next();
        }
        
                
    }
    
}
