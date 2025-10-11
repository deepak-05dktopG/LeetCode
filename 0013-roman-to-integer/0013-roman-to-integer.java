class Solution {
    public int romanToInt(String s) {
        
        Map<Character,Integer> map = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);

        int ans = 0;
        for(int i=0;i<s.length();i++){
            int val = map.get(s.charAt(i));
            if(i<s.length()-1 && val < map.get(s.charAt(i+1))){
                ans -= val;
            }
            else{
                ans += val;
            }
        }

        return ans;

    }
}