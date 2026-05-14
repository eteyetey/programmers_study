import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        List<String> ls = new ArrayList<>();
        int len = my_string.length();
        for(int i=0;i<len;i++){
            ls.add(my_string.substring(len-1-i));
        }
        Collections.sort(ls);
        String[] answer = new String[ls.size()];
        for(int i=0;i<len;i++){
            answer[i] = ls.get(i);
        }
        return answer;
    }
    
    
   
}