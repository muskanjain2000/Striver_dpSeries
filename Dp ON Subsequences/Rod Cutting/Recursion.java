class Solution{
    public int cutRod(int price[], int n) {
        //code here
        return knapSack(n-1 , n ,price);
    }
    
     static int Sack(int ind, int N, int price[])
    {  
        if(ind == 0){
            return N*(price[0]);
        }
        
        int p = Integer.MIN_VALUE ;
        int np = Sack(ind-1 ,N , price ) ;
        int rl= ind+1 ;
        if(rl<=N){
        
        p = Sack(ind ,  N-rl , price )+price[ind] ;}
        
        return Math.max(p,np) ;
        
    }
    
}
