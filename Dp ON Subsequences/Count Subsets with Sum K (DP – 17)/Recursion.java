
class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    
	   if(sum==0) {
	       return 1 ;
	   }
	   if(n==0){
	       if(sum == 0){
	           return 1 ;
	       }
	       else{
	           return 0 ;
	       }
	   }
	   
	   int np = perfectSum(arr , n-1 , sum) ;
	   int p =0 ;
	   if(arr[n-1]<=sum){
	       p = perfectSum(arr , n-1 , sum-arr[n-1]) ;
	   }
	   return (p+np) ;}}

//tc = O(2^|sum|) ;
