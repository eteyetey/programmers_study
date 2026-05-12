import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<arr.length;){
            if(ls.size()==0) {
                ls.add(arr[i]);
                i++;
            }else{
                if(ls.get(ls.size()-1)<arr[i]){
                    ls.add(arr[i]);
                    i++;
                }else{
                    ls.remove(ls.size()-1);
                }
            }
            
        }
        int[] stk = new int[ls.size()];
        for(int j=0;j<ls.size();j++){
            stk[j] = ls.get(j);
        }
        return stk;
    }
}