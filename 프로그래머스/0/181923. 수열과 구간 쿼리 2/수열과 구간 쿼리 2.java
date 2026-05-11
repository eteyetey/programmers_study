import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];
        int k=0;
        for(int[] i :queries){
        int[] subarr = Arrays.copyOfRange(arr,i[0],i[1]+1);
        ans[k] = min(subarr,i[2]);
            k++;
        
        }
        return ans;
    }
    public int min(int[] arr,int prev){
        int ans = prev;
        int tmparr[] = arr;
        Arrays.sort(tmparr);
        for(int i =0;i<tmparr.length;i++){
          if(tmparr[i]>prev) return tmparr[i];
            
        }
        
        return -1;
    }
}