class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        for(int i =0; i<len; i++){
            ans[i] = ans[nums.length + i] = nums[i];
        }
        return ans;
    }
}