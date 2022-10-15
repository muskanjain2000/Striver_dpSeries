class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	       int sum=0;

     for(int i=0;i<n;i++)

     sum+=arr[i];

     int dp[][]=new int[n][sum+1];

     for(int i=0;i<n;i++)

     Arrays.fill(dp[i],-1);

     return diff(arr,n,0,sum,0,dp);

     // Your code goes here
	} 
	   public int diff(int arr[],int n,int i,int sum,int s,int dp[][])

    {

        if(i>=n)

            return Math.abs((2*s)-sum);

        if(dp[i][s]!=-1)

            return dp[i][s];

        int x=Integer.MAX_VALUE,y=Integer.MAX_VALUE;

        x=diff(arr,n,i+1,sum,s+arr[i],dp);

        y=diff(arr,n,i+1,sum,s,dp);

        return dp[i][s]=Math.min(x,y);

    }
}
