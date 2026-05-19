import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int arr[] = new int[num_list.length-n+1];
        for(int i=0;i<num_list.length-n+1;i++){
            arr[i] = num_list[n+i-1];
        }
        return arr;
    }
}