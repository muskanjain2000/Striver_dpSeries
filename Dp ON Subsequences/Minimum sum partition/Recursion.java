
class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	       int sum=0;

     for(int i=0;i<n;i++)

     sum+=arr[i];

     

     return diff(arr,n,0,sum,0);

     // Your code goes here
	} 
	   public int diff(int arr[],int n,int i,int sum,int s)

    {

        if(i>=n)

            return Math.abs((2*s)-sum);

        
        int x=Integer.MAX_VALUE,y=Integer.MAX_VALUE;

        x=diff(arr,n,i+1,sum,s+arr[i]);

        y=diff(arr,n,i+1,sum,s);

        return Math.min(x,y);

    }
}
