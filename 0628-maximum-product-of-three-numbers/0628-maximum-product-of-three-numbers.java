class Solution {
    public int maximumProduct(int[] nums) {
        int max1=-1000, max2=-1000, max3=-1000;
        int min1=0, min2=0;

        for(int num:nums)
        {
            if(max1<=num)
            {
                max3=max2;
                max2=max1;
                max1=num;
            }

            else if(max2<=num)
            {
                max3=max2;
                max2=num;
            }

            else if(max3<=num)
            {
                max3=num;
            }

            if(min1>=num)
            {
                min2=min1;
                min1=num;
            }

            else if(min2>=num)
            {
                min2=num;
            }
        }

        return Math.max(
            max1*max2*max3 ,
            min1*min2*max1
        );
    }
}