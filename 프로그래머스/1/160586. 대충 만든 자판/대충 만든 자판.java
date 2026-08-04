import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
       for(int i=0;i<targets.length;i++){
           for(int j=0;j<targets[i].length();j++){
               String word = targets[i].substring(j,j+1);
               int[] indexs = new int[keymap.length];
               for(int k=0;k<indexs.length;k++){
                   indexs[k] = where(word,keymap[k]);
               }
               int count = min(indexs);
               if(count==-1) {
                   answer[i]=-1;
                   break;
               }else {
                   answer[i] += count;
               }
           }
       }
        return answer;
    }
    
    public int where(String a, String b){
        for(int i=0;i<b.length();i++){
            if(b.substring(i,i+1).equals(a)){
                return i+1;
            }
        }   
        return 101;
    }
    
    public int min(int[] arr){
       int min = arr[0];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min = arr[i];
            if(arr[i]==101) count++;
        }
        if(count==arr.length) return -1;
        return min;
        
        
    }
}