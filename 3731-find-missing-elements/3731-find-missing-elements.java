class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
        int min=Arrays.stream(nums).min().getAsInt();

        List<Integer> list=new ArrayList<>();

        Set<Integer> numSet = Arrays.stream(nums)
                                    .boxed()
                                    .collect(Collectors.toSet());

        for(int i=min;i<=max;i++)
        {
            if(!numSet.contains(i))
            {
                list.add(i);
            }
        }
        return list;
    }
}