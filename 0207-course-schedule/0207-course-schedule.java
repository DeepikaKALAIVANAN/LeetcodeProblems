class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] indeg = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }        
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            graph.get(v).add(u);
            indeg[u]++;
        }
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                que.offer(i);
            }
        }
        int count =0;
        while(!que.isEmpty()){
            int courses = que.poll();
            count++;
            List<Integer> nbrs = graph.get(courses);
            for(int j=0;j<nbrs.size();j++){
                int nbr = nbrs.get(j);
                indeg[nbr]--;
                if(indeg[nbr]==0){
                    que.offer(nbr);
                }
            }
        }
        return count == numCourses;
    }
}