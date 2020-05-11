class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hash = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(!hash.containsKey(ch))
                hash.put(ch, i);
            else {
                hash.remove(ch);
                hash.put(ch, -1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
		    if(entry.getValue() != -1)
                return entry.getValue();
		}
        return -1;
    }
}