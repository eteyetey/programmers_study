import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> ls = new ArrayList<>();
        for(int i=0;i<my_string.length();i++){
            ls.add(my_string.substring(my_string.length()-1-i));
        }
        if(ls.contains(is_suffix)){
            return 1;
        }
        return 0;
    }
}