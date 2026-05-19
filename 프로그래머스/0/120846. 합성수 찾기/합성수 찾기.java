import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        HashSet<Integer> hs = new HashSet();
        for(int i=2;i<=n;i++){
            for(int j=1;j<n;j++){
               if(!isPrime(i*j)&&(i*j)<=n) hs.add(i*j);
            }
        }
        System.out.println(hs);
        
        return hs.size();
    }
    
    public boolean isPrime(int a){
       for(int i=2;i<a;i++){
           if(a%i==0) return false;
       }
        return true;
    }
}