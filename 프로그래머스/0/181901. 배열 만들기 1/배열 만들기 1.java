import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        
        List<Integer> ls = new ArrayList<>();
        for(int i=k;i<=n;i++){
            if(i%k==0) ls.add(i);
        }
        int[] answer = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            answer[i] = ls.get(i);
        }
        return answer;
    }
}