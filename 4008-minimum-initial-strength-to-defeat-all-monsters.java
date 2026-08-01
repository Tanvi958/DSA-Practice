class Solution 
{
    public long minInitialStrength(int[] monsters, int[][] boosts) 
    {
        int n=monsters.length;

        long[] diff=new long[n+1];

        for(int[]b:boosts)
        {
            diff[b[0]]+=b[2];
            if(b[1]+1<diff.length)
            {
                diff[b[1]+1]-=b[2];
            }
        }
            long[] bonus= new long[n];

            long curr=0;

            for(int i=0;i<n;i++)
            {
                curr+=diff[i];
                bonus[i]=curr;
            }

            long low=0,hi=0;
            for(int x: monsters)
            {
                    hi+=x;
            }

            while(low<hi)
            {
                    long mid=low+(hi-low)/2;
                    if(can(mid,monsters,bonus))
                    {
                        hi=mid;
                    }
                    else
                    {
                        low=mid+1;
                    }
            }
                return low;
    }
            
    

        private boolean can(long strength,int[] monsters,long[]bonus)
        {
            long curr=strength;
            for(int i=0;i<monsters.length;i++)
            {
                if(curr+bonus[i]<monsters[i])
                {
                    return false;
                }
                curr-=monsters[i];
                if(curr<0)
                {
                    curr=0;                        
                }
                
            }
            return true;
        }
}
        
        
    
