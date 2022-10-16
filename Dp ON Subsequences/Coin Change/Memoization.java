class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
        long dp[][] = new long[N][sum+1] ;
       for(int i =0 ; i<N ; i++){
           Arrays.fill(dp[i] , -1) ;
       }
        
        
        return  count(coins , N , sum ,dp) ;
        
       
        
        
        
    }
    
    public long count(int coins[], int N, int sum, long dp[][]) {
        // code here.
        if(sum==0){
            return 1 ;
        }
        
        if(N==0){
            if(sum==0){
                return 1 ;
            }
            else{
             return 0 ;
            }
        }
        if(dp[N-1][sum] !=-1){
            return dp[N-1][sum] ;
        }
        
        long p = 0;
        if(coins[N-1]<=sum){
         p =    (count(coins , N , sum-coins[N-1] ,dp)) ;
        }
        
        
        long np =  count(coins , N-1 , sum , dp) ;
        
        dp[N-1][sum]= (p+np) ;
        return dp[N-1][sum] ;
        
        
        
    }
}
