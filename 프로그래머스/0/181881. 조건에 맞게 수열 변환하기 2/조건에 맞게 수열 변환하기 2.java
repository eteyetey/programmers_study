import java.util.*;
class Solution {
    public int solution(int[] arr) {
        
        int[] prev = Arrays.copyOf(arr,arr.length);
        int[] cur = Arrays.copyOf(arr,arr.length);
        int x = 0;
        while(true){
            prev = Arrays.copyOf(cur,arr.length);
            for(int i=0;i<arr.length;i++){
                if(cur[i]>=50&&cur[i]%2==0){
                    cur[i] /=2;
                }else if(cur[i]<50&&cur[i]%2!=0){
                    cur[i]*=2;
                    cur[i]+=1;
                }
            }
            x++;
            if(Arrays.equals(prev,cur)) break;
        }
        return x-1;
    }
}