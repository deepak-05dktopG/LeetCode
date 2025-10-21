class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(char k : t.toCharArray()){
            map.put(k,map.getOrDefault(k,0)+1);
        }

        for(char k:s.toCharArray()){
            map.put(k,map.get(k)-1);
        }
        char res=' ';
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue() != 0){
                res = e.getKey();
            }
        }
        return res;

    }
}