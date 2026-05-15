import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        sb.append(my_string.substring(s,e+1));
        sb.reverse();
        sbb.append(my_string.substring(0,s));
        sbb.append(sb.toString());
        sbb.append(my_string.substring(e+1,my_string.length()));
        return sbb.toString();
    }
}