import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        
        List<Character> ls = new ArrayList<>();
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)>='0'&&my_string.charAt(i)<='9'){
                ls.add(my_string.charAt(i));
            }
        }
        Collections.sort(ls);
        int[] answer = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            answer[i] = Integer.parseInt(""+ls.get(i));
        }
        return answer;
    }
}