 static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean dp [][] = new boolean[N][sum+1] ;
        
        dp[0][arr[0]] = true ;
        for(int i =1 ; i<N ; i++){
            dp[i][0] = true  ;
        }
        for(int i = 1 ; i<N ; i++){
            for(int j =1 ; j<sum+1 ; j++){
              
                dp[i][j] = dp[i-1][j]  ;
                if(j>=arr[i]) {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i]];
                }
                
            }
            
           
        }
        
    return dp[N-1][sum] ;
        
   
    }
