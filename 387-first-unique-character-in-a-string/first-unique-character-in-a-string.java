class Solution {
     public int firstUniqChar(String s) {
        Map<Character, Integer> arrMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            arrMap.put(s.charAt(i), arrMap.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(arrMap.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

}