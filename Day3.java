class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> m = new ArrayList<Character>();
        for(int i=0;i<magazine.length();i++)
            m.add(magazine.charAt(i));
        for(int i=0;i<ransomNote.length();i++) {
            char ch = ransomNote.charAt(i);
            if(m.contains(ch))
                m.remove(new Character(ch));
            else
                return false;
        }
        return true;
    }
}