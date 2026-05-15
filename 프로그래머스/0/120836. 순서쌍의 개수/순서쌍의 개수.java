import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 1;
        int tmpn = n;
        for(int i=2;i<=n;i++){
            int tmp = 0;
            
            while(tmpn%i==0){
                tmp++;
                tmpn/=i;
            }
            answer*=tmp+1;
        }
        return answer;
    }
}