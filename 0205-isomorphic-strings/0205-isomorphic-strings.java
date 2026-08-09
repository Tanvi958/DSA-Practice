class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> St=new HashMap<>();
        HashMap<Character,Integer> Tt=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            if(!St.containsKey(s.charAt(i)))
            {
                St.put(s.charAt(i),i);
            }

            if(!Tt.containsKey(t.charAt(i)))
            {
                Tt.put(t.charAt(i),i);
            }

            if(!St.get(s.charAt(i)).equals(Tt.get(t.charAt(i))))
            {
                return false;
            }


        }
        return true;
    }
}