import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        List<String> ls = new ArrayList<>();
        
        for(int i = 0;i<names.length;i+=5){
            ls.add(names[i]);
        }
        String[] answer = new String[ls.size()];
        for(int i=0;i<ls.size();i++){
            answer[i] = ls.get(i);
        }
        return answer;
    }
}