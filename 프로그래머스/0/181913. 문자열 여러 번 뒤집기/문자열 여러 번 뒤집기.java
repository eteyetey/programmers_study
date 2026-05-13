import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        String tmp = "";
        for(int i=0;i<queries.length;i++){
            tmp = answer.substring(queries[i][0],queries[i][1]+1);
            StringBuilder sb = new StringBuilder(tmp);
            tmp = sb.reverse().toString();
            answer = answer.substring(0,queries[i][0])+tmp+answer.substring(queries[i][1]+1,my_string.length());
            
            
        }
        
        return answer;
    }
}