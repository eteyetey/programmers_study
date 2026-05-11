import java.util.*;
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int prev = numLog[0];
        for(int i : numLog){
            switch (i-prev){
                case (1):
                    answer+="w";
                    break;
                case(-1):
                    answer+="s";
                    break;
                case(10):
                    answer+="d";
                    break;
                case(-10):
                    answer+="a";
                    break;
            }
            prev = i;
        }
        return answer;
    }
}