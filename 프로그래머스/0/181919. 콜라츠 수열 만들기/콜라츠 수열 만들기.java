import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        List<Integer> ls = new ArrayList<>();
        
        do{
            ls.add(n);
            if(n%2==0){
                n/=2;
            }else{
                n = 3*n+1;
            }
        }while(n!=1);
        ls.add(1);
        int[] answer = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            answer[i] = ls.get(i);
        }
        return answer;
    }
}