class Solution {
    public int maxProduct(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]-1;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int num:nums)
        {
            pq.add(num);

            if(pq.size()>2)
            {
                pq.poll();
            }
        }

        
        return pq.poll()*pq.poll();

    }
}