class Solution {
    public boolean isAnagram(String s, String t) {
     HashMap<Integer,Integer> hmap = new HashMap<>();
     for(int i=0;i<s.length();i++){
        int ch = s.charAt(i) - '0';
        if(hmap.containsKey(ch)){
            hmap.put(ch, hmap.get(ch) + 1);
        }else{
            hmap.put(ch,1);
        }
     }
     for(int i=0;i<t.length();i++){
        int ch = t.charAt(i) - '0';
        if(hmap.containsKey(ch)){
            hmap.put(ch, hmap.get(ch) - 1);
            if(hmap.get(ch) == 0){
                hmap.remove(ch);
            }
        }else{
            return false;
        }
     }
     if(hmap.size() == 0) return true;
     return false;
    }
}
