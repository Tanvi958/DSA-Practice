class Solution {
    public int[] shortestToChar(String s, char c) {
        int answer[]=new int[s.length()];

        int prev=-10000000;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                prev=i;
            }
            answer[i]=i-prev;
        }

        prev=1000000;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==c)
            {
                prev=i;
            }
            answer[i]=Math.min(answer[i],prev-i);
        }
        return answer;
    }
}