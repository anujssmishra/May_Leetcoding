class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0) return false;
        if(num<=1) return true;
        double a = Math.exp(Math.log(num)/2.0);
        if(Math.round(Math.pow(Math.round(a),2))==num)
            return true;
        else
            return false;
    }
}