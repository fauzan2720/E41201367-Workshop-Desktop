package Task.DFS;

import java.util.List;
import java.util.Stack;

/**
 * Depth First Search (DFS)
 * @author Fauzan
 */
public class DFS_Graph {
    private Stack<Vertex> stack;
    
    public DFS_Graph() {
        this.stack = new Stack<>();
    }
    public void dfs(List<Vertex> vertexList) {
        for(Vertex v : vertexList) {
            if(!v.isVisited()) {
                v.setVisited(true);
                dfsWithStack(v);
            }
        }
    }
    private void dfsWithStack(Vertex rootVertex) {
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);
        while(!stack.isEmpty()) {
            Vertex actualVertex = this.stack.pop();
            System.out.print(actualVertex +" ");
            for (Vertex v : actualVertex.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
        System.out.println("");
    }
}
