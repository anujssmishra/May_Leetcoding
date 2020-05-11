class Solution {
    public int findComplement(int num) {
        if(num==0) return 1;
        int digit=0, comp=0;
        for(int i=0;num>0;i++,num/=2) {
            if(num%2==0) {
                comp += (int)Math.pow(2,i);
            }
        }
        return comp;
    }
}