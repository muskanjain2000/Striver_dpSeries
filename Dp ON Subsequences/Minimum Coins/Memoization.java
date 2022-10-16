class Solution {
    public int coinChange(int[] coins, int amount) {
       int dp[][] = new int[coins.length+1][amount+1] ;
        for(int i=0 ; i<=coins.length ; i++){
            Arrays.fill(dp[i] , -1) ;
        }
   
        int ans = fun(coins , amount , coins.length ,dp);
        if(ans >= (int)Math.pow(10,9)){
return -1 ;}
        return ans ;
    }
    
    
  public  int fun(int[]a , int sum , int n , int[][]dp){
      if(n == 0){
          if(sum%a[n] ==0){
              return sum/a[n] ;
          }
          else{
              return (int)Math.pow(10,9) ;
          }}
          
          if(dp[n][sum] != -1){
              return dp[n][sum] ;
          }
      
      
      int nt = 0 + fun(a,sum ,n-1 ,dp);
      int t = Integer.MAX_VALUE ;
      if(sum >=a[n-1]){
          t  = 1+fun(a,sum-a[n-1] ,n ,dp) ;
      }
      
      dp[n][sum] =  Math.min(nt,t) ;
      return dp[n][sum] ;
    
    
    
    
    
    
    
}}
