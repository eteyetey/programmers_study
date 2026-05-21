import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<my_string.length();i++){
            if(hs.contains(my_string.substring(i,i+1))){
                continue;
            }
            hs.add(my_string.substring(i,i+1));
            answer+=my_string.substring(i,i+1);
        }
        return answer;
    }
}