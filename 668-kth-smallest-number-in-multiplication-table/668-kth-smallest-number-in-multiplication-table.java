class Solution {
    public int findKthNumber(int m, int n, int k) {
        int s = 1, e = m*n;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isValid(m,n,k,mid)){
                e = mid-1;
            }
            else s = mid+1;
        }
        return s;
    }
    public boolean isValid(int m, int n, int k, int valid){
        int count = 0;
        for(int i=1; i<=m;i++){
            if(i>valid){
                break;
            }
            count += Math.min(n, valid/i);
        }
        return count > k-1;
    }
}