import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        List<String> ls = new ArrayList<>();
        for(int i=0;i<my_string.length();i++){
            ls.add(my_string.substring(i,i+1));
        }
        for(int i : indices){
         ls.set(i,"_");   
        }
        for(String i : ls){
            if(!i.equals("_"))
            answer+=i;
        }
        return answer;
    }
}