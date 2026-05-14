import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<intStrs.length;i++){
            String tmp = intStrs[i].substring(s,s+l);
            int tmpInt = Integer.parseInt(tmp);
            if(tmpInt>k) ls.add(tmpInt);
        }
        int[] ans = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
}