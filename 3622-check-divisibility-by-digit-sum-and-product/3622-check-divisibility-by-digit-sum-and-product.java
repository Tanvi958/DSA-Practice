class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0;
        int prod=1;
        while(org>0)
        {
            int rem=org%10;
            sum+=rem;
            prod*=rem;
            org/=10;
        }
       
        int total=sum+prod;

        return n%total==0;
    }
}