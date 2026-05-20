
import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        List<Integer> ls = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime(i)&&n%i==0){
                ls.add(i);
            }
        }
        int[] answer = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            answer[i] = ls.get(i);
        }
        
        return answer;
    }
    
    public boolean isPrime(int k){
        for(int i=2;i<k;i++){
            if(k%i==0) return false;
        }
        return true;
    }
}