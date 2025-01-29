class Solution {
     class Pair{
            int vert;
            int wt;
            Pair(int v,int w){
                this.vert=v;
                this.wt=w;
            }
        }
    public int networkDelayTime(int[][] times, int n, int k) {
       ArrayList<Pair>[] graph=new ArrayList[n+1];
       for(int i=0;i<=n;i++){
        graph[i]=new ArrayList<>();
       }
       for(int i=0;i<times.length;i++){
        int u=times[i][0];
        int v=times[i][1];
        int w=times[i][2];
        graph[u].add(new Pair(v,w));

       }
       PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.wt-b.wt);
       int [] ans=new int[n+1];
       //boolean[] visited=new boolean[n+1];
       Arrays.fill(ans,Integer.MAX_VALUE);
       ans[k]=0;
       pq.add(new Pair(k,0));

       while(pq.size()>0){
        Pair rem=pq.poll();
        int cv=rem.vert;
        int cw=rem.wt;

        //visited[cv]=true;
        if(cw>ans[cv]) continue;
        for(Pair nbrPair:graph[cv]){
            int nbr=nbrPair.vert;
            int nbrwt=nbrPair.wt;

            int newTotal=cw+nbrwt;
            if(newTotal<ans[nbr]){
                ans[nbr]=newTotal;
                pq.add(new Pair(nbr,newTotal));
            }
        }
       
    }
    int max=Integer.MIN_VALUE;
    for(int i=1;i<=n;i++){
        if(ans[i]==Integer.MAX_VALUE) return -1;
        max=Math.max(max,ans[i]);
    }
    return max;
  }
}