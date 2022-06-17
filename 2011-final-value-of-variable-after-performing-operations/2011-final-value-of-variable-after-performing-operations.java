class Solution {
    public int finalValueAfterOperations(String[] operations) {
     int sum = 0;
        for(String S : operations){
            if(S.charAt(1) == '+'){
                sum++;
            }
            else{
                sum--;
            }
        }
               return sum;
    }
}