class Solution {
    public int findJudge(int N, int[][] trust) {
        if(trust.length==0 && N==1) return 1;
        int a[] = new int[N+1];
        int judge=-1;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<trust.length;i++) {
            a[trust[i][0]] = trust[i][0];
            if(!list.contains(trust[i][1]))
                list.add(trust[i][1]);
        }
        for(int i=0;i<list.size();i++) {
            if(a[list.get(i)]==0)
                judge = list.get(i);
        }
        int c=0;
        for(int i=0;i<trust.length;i++) {
            if(trust[i][1]==judge)
                c++;
        }
        if(c==N-1)
            return judge;
        return -1;
    }
}