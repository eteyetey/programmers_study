import java.util.*;
class Solution {
    public String solution(int age) {
        String tmp =  String.valueOf(age);
        String ans = "";
        for(int i=0;i<tmp.length();i++){
            int tmpint = Integer.parseInt(""+tmp.charAt(i));
            char tmpchar = (char)(tmpint+97);
            ans+=""+tmpchar;
            
        }
        return ans;
    }
}