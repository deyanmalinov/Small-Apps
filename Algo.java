import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {
    private final int vertices;
    private List<List<Integer>> nm = new ArrayList<>();
    private List<Integer>[] adjList;

    public AllPathsFromSourceToTarget(int vertices) {
        this.vertices = vertices;
        initAdjList();
    }

    private void initAdjList() {
        adjList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    public List<List<Integer>> storeAllPaths(int source, int destination) {
        boolean[] isVisited = new boolean[vertices];
        ArrayList<Integer> pathList = new ArrayList<>();
        pathList.add(source);
        storeAllPathsUtil(source, destination, isVisited, pathList);
        return nm;
    }

    private void storeAllPathsUtil(int u, int d, boolean[] isVisited, List<Integer> localPathList) {
        if (u == d) {
            nm.add(new ArrayList<>(localPathList));
            return;
        }
        isVisited[u] = true;
        for (Integer i : adjList[u]) {
            if (!isVisited[i]) {
                localPathList.add(i);
                storeAllPathsUtil(i, d, isVisited, localPathList);
                localPathList.remove(localPathList.size() - 1);
            }
        }
        isVisited[u] = false;
    }

    public static List<List<Integer>> allPathsFromSourceToTarget(int vertices, int[][] edges, int source, int destination) {
        AllPathsFromSourceToTarget graph = new AllPathsFromSourceToTarget(vertices);
        for (int[] edge : edges) {
            graph.addEdge(edge[0], edge[1]);
        }
        return graph.storeAllPaths(source, destination);
    }
}
