class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs(0, graph, current, result);
        return result;
    }

    public void dfs(int source, int[][] graph, List<Integer> current, List<List<Integer>> result){
        current.add(source);
        if(source == graph.length - 1){
            result.add(new ArrayList <>(current));
            current.remove(current.size() - 1);
            return;
        }
        for(int neighbor: graph[source]){
            dfs(neighbor, graph, current, result);
        }
        current.remove(current.size() - 1);
    }
}