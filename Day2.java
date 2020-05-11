class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewel = new HashSet<Character>();
        int count=0;
        for(int i=0;i<J.length();i++)
            jewel.add(J.charAt(i));
        
        for(int i=0;;i++) {
            try {
                if(jewel.contains(S.charAt(i)))
                    count++;
            }
            catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }
}