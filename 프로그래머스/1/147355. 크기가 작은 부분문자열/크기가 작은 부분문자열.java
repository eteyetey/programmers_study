import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] subStrings = IntStream.range(0,t.length()-p.length()+1).mapToObj(i->t.substring(i,i+p.length())).toArray(String[] :: new);
        for(String i : subStrings){
            if(Long.parseLong(i)<=Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}