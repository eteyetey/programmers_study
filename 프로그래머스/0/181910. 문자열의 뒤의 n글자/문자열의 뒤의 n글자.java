import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        sb.reverse();
        answer = (new StringBuilder(sb.toString().substring(0,n))).reverse().toString();
        
        return answer;
    }
}