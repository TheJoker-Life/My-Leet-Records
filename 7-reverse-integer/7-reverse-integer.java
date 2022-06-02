class Solution {
    public int reverse(int x) {
        int rev = 0, pre_rev = 0, rem;
        while(x!=0){
            rem = x%10;
            x /= 10;
            if(pre_rev>Integer.MAX_VALUE/10 || pre_rev == Integer.MAX_VALUE/10 && rem>Integer.MAX_VALUE%10){
                return 0;
            }
            if(pre_rev<Integer.MIN_VALUE/10 || pre_rev == Integer.MIN_VALUE/10 && rem<Integer.MIN_VALUE%10){
                return 0;
            }
            rev = rem + pre_rev*10;
            pre_rev = rev;
        }
        return rev;
    }
}