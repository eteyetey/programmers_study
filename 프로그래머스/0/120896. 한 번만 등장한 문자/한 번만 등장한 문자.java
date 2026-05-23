import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<String,Integer> hs = new HashMap();
        List<String> ls = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            ls.add(s.substring(i,i+1));
            if(hs.containsKey(s.substring(i,i+1))){
                hs.put(s.substring(i,i+1),hs.get(s.substring(i,i+1))+1);
            }else{
               hs.put(s.substring(i,i+1),1);
            }
        }
        Collections.sort(ls);
        System.out.println(hs);
        System.out.println(ls);
        
        for(int i=0;i<ls.size();i++){
            if(hs.get(ls.get(i))==1){
                answer+=ls.get(i);
            }
        }
        
        return answer;
    }
}