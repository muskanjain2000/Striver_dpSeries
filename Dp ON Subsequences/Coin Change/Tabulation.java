class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
         long dp[][] = new long[N+1][sum+1] ;
      for(int i =1 ; i<N+1 ; i++){
          dp[i][0] = 1 ;
      }
      for(int i =0 ; i<=sum ; i++){
          dp[0][i] = 0 ;
      }
      
      for(int i =1; i<=N ; i++){
          for(int j =1 ; j<=sum ; j++){
              long p = 0 ;
              if(j>=coins[i-1]){
                  p = dp[i][j-coins[i-1]] ;
              }
              long np = dp[i-1][j] ;
              
              dp[i][j] = p+np;
          }
      }
