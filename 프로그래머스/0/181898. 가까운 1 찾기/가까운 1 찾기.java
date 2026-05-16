import java.util.*;
class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        int[] subarr = Arrays.copyOfRange(arr,idx,arr.length);
     
        for(int i=0;i<subarr.length;i++){
            if(subarr[i]==1) return i+idx;
        }
        return -1;
    }
}