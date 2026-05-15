import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] ans = new int[len];
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<len;i++){
            ls.add(emergency[i]);
        }
        Collections.sort(ls);
        for(int i=0;i<len;i++){
           ans[i] = len-ls.indexOf(emergency[i]); 
        }
        return ans;
    }
}