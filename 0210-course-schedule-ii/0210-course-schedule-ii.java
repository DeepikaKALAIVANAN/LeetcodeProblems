class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
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
        List<Integer> order = new ArrayList<>();
        while(!que.isEmpty()){
            int courses = que.poll();
            order.add(courses);
            for(int j=0;j<graph.get(courses).size();j++){
                int nbr = graph.get(courses).get(j);
                indeg[nbr]--;
                if(indeg[nbr]==0){
                    que.offer(nbr);
                }
            }
        }
        if(order.size() == numCourses){
            return order.stream().mapToInt(i->i).toArray();
        }else{
            return new int[0];
        }
    }
}