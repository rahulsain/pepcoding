class Solution {
    public int maxCoins(int[] a) {
        int n = a.length;
        int t[] = new int[n+2];
        t[0] = t[n+1] = 1;
        for(int i = 1; i< n+1; i++){
            t[i] = a[i-1];
        }
        int dp[][] = new int[n+2][n+2];
        return burst(dp,t,0,n+1);
    }
    
   public int burst(int[][] memo, int[] nums, int left, int right) {
       if(left + 1 == right) return 0;
       
       if(memo[left][right] > 0) return memo[left][right];
       
       int ans = 0;
       
       for(int i = left + 1; i < right; i++){
           ans = Math.max(ans,nums[left] * nums[i] * nums[right] + burst(memo, nums,left,i) + burst(memo,nums,i,right));
       }
       
       memo[left][right] = ans;
       
       return ans;
   }
}