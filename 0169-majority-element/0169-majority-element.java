class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int max = Integer.MIN_VALUE;
        int temp = 0; 
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue() > max ){
                max = e.getValue();
                temp = e.getKey();
            }
        }
        return temp;
    }
}