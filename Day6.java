class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int num : nums) {
            if(!hash.containsKey(num))
                hash.put(num, 1);
            else {
                int i = hash.get(num);
                if(i+1>nums.length/2)
                    return num;
                hash.remove(num);
                hash.put(num, i+1);
            }
        }
        return nums[0];
    }
}