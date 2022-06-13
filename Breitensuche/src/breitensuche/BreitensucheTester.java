package breitensuche;

public class BreitensucheTester {

    public static void main(String[] args) {

        Graph graph = new Graph();
        Queue<Vertex> s = new Queue();
        
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
        
        List<Vertex> vertices = graph.getVertices();
        
        while(vertices.hasAccess()) {
            vertices.getContent().setMark(false);
            vertices.next();
        }
        
        vertices.toFirst();
        vertices.getContent().setMark(true);
        
        s.enqueue(vertices.getContent());
        
        while(s.isEmpty() == false) {
            
            Vertex k = s.front();
            System.out.println(k.getID());

            List<Vertex> nb = graph.getNeighbours(k);
            nb.toFirst();
            while(nb.hasAccess()) {
                Vertex n = nb.getContent();
                if(n.isMarked() == false) {
                    n.setMark(true);
                    s.enqueue(n);
                }
                nb.next();
            }
            s.dequeue();
        }
        
        
    }
    
}
