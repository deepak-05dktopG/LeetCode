class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");

        String res ="";
        int a=0;

        for(String i:str){
            a += 1;
            int l=0;
            int r=i.length()-1;
            char[] ch = i.toCharArray();
            while(l<r){
                char temp = ch[r];
                ch[r] = ch[l];
                ch[l] = temp;
                l++;
                r--;
            }

            String str1 = new String(ch);
            res += str1;
            if(a < str.length){
                res += " ";
            }
        }
        return res;
    }
}