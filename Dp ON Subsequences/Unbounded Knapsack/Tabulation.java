class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {  
       int[][]dp = new int[N+1][W+1] ;
      for(int i =0 ; i<=N ; i++){
          dp[i][0] =0 ;
          
      }
      
      for(int i =0 ; i<=W ; i++){
          dp[0][i]  = 0 ;
      }
      
      dp[0][0] =1 ;
      for(int i =1 ; i<=N ; i++){
          for(int j =1 ; j<=W ; j++){
              int p =0 ;
               if(wt[i-1]<=j){
                   p = dp[i][j-wt[i-1]] + val[i-1] ;
               }
               int np =dp[i-1][j] ;
               dp[i][j] = Math.max(p,np) ;
          }
      }
      
      return dp[N][ W] ;
       
        
    }
    
