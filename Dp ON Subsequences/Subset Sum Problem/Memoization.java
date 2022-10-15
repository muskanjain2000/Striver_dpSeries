class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        int dp [][] = new int[N][sum+1] ;
        for(int i =0 ; i<N ; i++){
            for(int j =0 ; j<sum+1 ; j++){
                dp[i][j] =-1;
            }
        }
        
   
        
    if( SubsetSum(N , arr , sum ,dp) ==1){
        return true ;
    } return false ;
    }
    
    
    static int  SubsetSum(int N, int arr[], int sum , int [][]dp){
        // code here
        
        if(sum==0){
            
            return 1 ;
        }
        if(N==0){
            if(sum == 0){
                return 1 ;
            }
            else{
                return 0 ;
            }
        }
        if(dp[N-1][sum] != -1){
            return dp[N-1][sum] ;
        }
        
        
        int pick = 0 ;
        int np = SubsetSum(N-1 ,arr , sum , dp) ;
        if(arr[N-1]<=sum){
            pick = SubsetSum(N-1 ,arr , sum-arr[N-1] , dp) ;
        }
        
        dp[N-1][sum] = Math.max(pick , np) ;
        return dp[N-1][sum];
    }
}

//Tc = O(n*sum) 
