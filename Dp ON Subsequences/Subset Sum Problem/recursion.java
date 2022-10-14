class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        
        if(sum==0){
            return true ;
        }
        if(N==0){
            if(sum == 0){
                return true ;
            }
            else{
                return false ;
            }
        }
        
        
        
        
        if(arr[N-1]<=sum){
            return  isSubsetSum(N-1 , arr , sum-arr[N-1]) || isSubsetSum(N-1 , arr , sum) ;
        }
        
        return isSubsetSum(N-1 , arr , sum) ;
    }
}

// Time Complexity = 0(2^n)
