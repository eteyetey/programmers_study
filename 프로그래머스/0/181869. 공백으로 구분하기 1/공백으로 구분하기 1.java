import java.util.*;
class Solution {
    public String[] solution(String my_string) {
       
        List<String> ls = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(my_string);
        while(st.hasMoreTokens()){
            ls.add(st.nextToken());
        }
         String[] answer = new String[ls.size()];
        for(int i=0;i<ls.size();i++){
            answer[i] = ls.get(i);
        }
        return answer;
    }
}