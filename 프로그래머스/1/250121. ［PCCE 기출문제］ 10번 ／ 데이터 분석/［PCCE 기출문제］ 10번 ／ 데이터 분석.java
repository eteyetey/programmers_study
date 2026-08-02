import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] mode = {"code", "date", "maximum", "remain"};
        List<String> ls = Arrays.asList(mode);
        int[][] answer = Arrays.stream(data).filter(s->s[ls.indexOf(ext)]<val_ext).sorted((s,t)->Integer.compare(s[ls.indexOf(sort_by)],t[ls.indexOf(sort_by)])).toArray(int[][]::new);
        return answer;
    }
}