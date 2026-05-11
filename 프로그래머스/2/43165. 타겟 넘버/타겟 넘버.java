import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int len = numbers.length;
        int ans[] = {0};
        dfs(0,0,numbers,ans,target);
        return ans[0];
    }
    public void dfs(int index,int value,int[] arr,int[] ans,int target){
        if(index==arr.length){
            if(value==target) ans[0] +=1;
            return;
        }
        
        dfs(index+1,value+arr[index],arr,ans,target);
        dfs(index+1,value-arr[index],arr,ans,target);
    }
}