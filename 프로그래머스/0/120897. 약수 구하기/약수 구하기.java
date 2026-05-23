import java.util.*;
class Solution {
    public int[] solution(int n) {
       
        List<Integer> ls = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
               if(i*i==n){
                    ls.add(i);
                
               }else{
                    ls.add(i);
                ls.add(n/i);
               }
            }
        }
        Collections.sort(ls);
         int[] answer = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            answer[i] = ls.get(i);
        }
        return answer;
    }
}