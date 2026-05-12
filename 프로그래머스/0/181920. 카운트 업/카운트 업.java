import java.util.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        
        List<Integer> ls = new ArrayList<>();
        for(int i=start_num;i<=end_num;i++){
            ls.add(i);
        }
        int[] answer = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            answer[i] = ls.get(i);
        }
        return answer;
    }
}