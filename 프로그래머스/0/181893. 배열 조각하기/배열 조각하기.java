import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
      int ans[] = Arrays.copyOf(arr,arr.length);
       for(int i=0;i<query.length;i++){
           if(i%2==0){
               ans = Arrays.copyOfRange(ans,0,query[i]+1);
           }else{
               ans = Arrays.copyOfRange(ans,query[i],ans.length);
           }
       }
        return ans;
    }
}