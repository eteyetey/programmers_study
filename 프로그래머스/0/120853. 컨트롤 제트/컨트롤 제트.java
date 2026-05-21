import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(s);
        int back = Integer.parseInt(st.nextToken());
        answer+=back;
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            if(tmp.equals("Z")){
                answer-=back;
            }else{
                back = Integer.parseInt(tmp);
                answer+=back;
            }
        }
        return answer;
    }
}