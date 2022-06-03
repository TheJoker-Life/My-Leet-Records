class Solution {
    public int[] beautifulArray(int n) {
        int[] ans = new int[n];
        if(n==1){
            ans[0] = 1;
            return ans;
        }
        int[] right = beautifulArray(n/2);
        int[] left = beautifulArray((n+1)/2);
        
        
        for(int  i =0; i<left.length; i++){
            ans[i] = left[i]*2-1;
        }
        for(int i = left.length; i<n; i++){
            ans[i] = right[i-left.length]*2;
        }
        return ans;
    }
    
}