// } Driver Code Ends
import java.util.ArrayList;
import java.util.List;
//User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V,int edges[][]){
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i=0;i<V;i++){
            adjacencyList.add(new ArrayList<>());
        }
        for (int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }
        return adjacencyList;
    }
}
