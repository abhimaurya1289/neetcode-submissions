class Solution {
    public boolean isAnagram(String s, String t) {
     HashMap<Character,Integer> smap = new HashMap<>();
     for(int i=0;i<s.length();i++){
        Character ch = s.charAt(i);
        if(smap.containsKey(ch)){
            smap.put(ch,smap.get(ch) + 1);
        }else{
            smap.put(ch,1);
        }
     }

     for(int i=0;i<t.length();i++){
        Character ch = t.charAt(i);
        if(smap.containsKey(ch)){
            smap.put(ch, smap.get(ch) - 1);
            if(smap.get(ch) == 0){
                smap.remove(ch);
            }
        }else{
            return false;
        }
     }

     if(smap.size() == 0) return true;
     return false;
    }
}
