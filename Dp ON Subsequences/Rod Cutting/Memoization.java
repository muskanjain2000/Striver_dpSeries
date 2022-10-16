class Solution{
    public int cutRod(int price[], int n) {
        
        int dp[][] = new int[n][n+1] ;
        for(int i =0 ; i<n ; i++){
            Arrays.fill(dp[i] , -1) ;
        }
        
        
        
        //code here
        return Sack(n-1 , n ,price , dp);
    }
    
     static int Sack(int ind, int N, int price[] , int dp[][])
    {  
        if(ind == 0){
            return N*(price[0]);
        }
        if(dp[ind][N] !=-1) {
            return dp[ind][N] ;
        }
        
        int p = Integer.MIN_VALUE ;
        int np = Sack(ind-1 ,N , price ,dp ) ;
        int rl= ind+1 ;
        if(rl<=N){
        
            p = Sack(ind ,  N-rl , price ,dp )+price[ind] ;}
        
         dp[ind][N] =Math.max(p,np) ;
          return dp[ind][N] ;
        
    }
    
}
