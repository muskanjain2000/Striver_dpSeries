class Solution{
    public int cutRod(int price[], int n) {
        
        int dp[][] = new int[n][n+1] ;
       
         for(int i=0; i<=n; i++){
        dp[0][i] = i*price[0];
    }
     for(int i=0; i<n; i++){
        dp[i][0] = 0;
    }
    
    for(int i =1 ; i<n; i++){
        for (int j =1 ; j<=n; j++){
            int nt = dp[i-1][j];
            int l = i+1 ;
            int t =  Integer.MIN_VALUE ;
            if(l<=j){
                t= dp[i][j-l]+price[i];
            }
            dp[i][j] = Math.max(t,nt);
        }
        
        
    }
        
        return dp[n-1][n] ;
    }
    
}
