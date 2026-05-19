import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        return mergeArr(Arrays.copyOfRange(num_list,0,n),Arrays.copyOfRange(num_list,n,num_list.length));
    }
    public int[] mergeArr(int arr1[],int arr2[]){
        int ans[] = new int[arr1.length+arr2.length];
        for(int i=0;i<arr2.length;i++){
            ans[i] = arr2[i];
        }
        for(int i=arr2.length;i<arr2.length+arr1.length;i++){
            ans[i] = arr1[i-arr2.length];
        }
        return ans;
    }
}