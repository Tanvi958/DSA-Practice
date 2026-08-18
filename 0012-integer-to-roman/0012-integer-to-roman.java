class Solution {
    public String intToRoman(int num) {

        String s = String.valueOf(num);
        int len = s.length();

        HashMap<String,String> mpp = new HashMap<>();
        mpp.put("1","I");
        mpp.put("2","II");
        mpp.put("3","III");
        mpp.put("4","IV");
        mpp.put("5","V");
        mpp.put("6","VI");
        mpp.put("7","VII");
        mpp.put("8","VIII");
        mpp.put("9","IX");
        mpp.put("10","X");
        mpp.put("20","XX");
        mpp.put("30","XXX");
        mpp.put("40","XL");
        mpp.put("50","L");
        mpp.put("60","LX");
        mpp.put("70","LXX");
        mpp.put("80","LXXX");
        mpp.put("90","XC");
        mpp.put("100","C");
        mpp.put("200","CC");
        mpp.put("300","CCC");
        mpp.put("400","CD");
        mpp.put("500","D");
        mpp.put("600","DC");
        mpp.put("700","DCC");
        mpp.put("800","DCCC");
        mpp.put("900","CM");
        mpp.put("1000","M");
        mpp.put("2000","MM");
        mpp.put("3000","MMM");


        StringBuilder st = new StringBuilder();

        for(int i  = 0;i<len;i++){
            int ch = s.charAt(i)-'0';
            if(ch == 0) continue;
           String output = String.valueOf(ch * (int) Math.pow(10,(len-i-1))) ;
            st.append(mpp.get(output));
        }

        return st.toString();

    }
}