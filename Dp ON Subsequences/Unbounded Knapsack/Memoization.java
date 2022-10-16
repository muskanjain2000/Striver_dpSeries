class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {  
       int[][]dp = new int[N][W+1] ;
       for(int i =0 ; i<N ; i++){
           Arrays.fill(dp[i],-1);
               
           
       }
       
       return Sack(N, W, val ,wt ,dp) ;
        
    }
    
    
    static int Sack(int N, int W, int val[], int wt[] , int dp[][])
    {  
        if(W==0){
            return 0 ;
        }
        if(N==0){
            if(W==0){
                return 1 ;
            }
            else{
                return 0 ;
            }
        }
        if(dp[N-1][W] != -1){
            return dp[N-1][W] ;
        }
        int p = 0 ;
        int np = Sack(N-1 ,W , val ,wt ,dp) ;
        if(wt[N-1] <=W){
            p = Sack(N , W-wt[N-1] , val , wt ,dp)+val[N-1] ;
        }
        dp[N-1][W] =Math.max(p,np) ;
        return dp[N-1][W] ;
        
    }
    
    
    
}
