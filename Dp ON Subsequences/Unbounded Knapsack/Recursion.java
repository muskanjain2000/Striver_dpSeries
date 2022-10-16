class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
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
        
        int p = 0 ;
        int np = knapSack(N-1 ,W , val ,wt) ;
        if(wt[N-1] <=W){
            p = knapSack(N , W-wt[N-1] , val , wt)+val[N-1] ;
        }
        return Math.max(p,np) ;
        
    }
    
    
    
}
