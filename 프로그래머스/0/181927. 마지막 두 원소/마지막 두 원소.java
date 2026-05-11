import java.util.*;

class Solution {
    public int[] solution(int[] num_list){
        int len = num_list.length;
        int new_len = len+1;
        int last = num_list[len-1];
        int prev = num_list[len-2];
        int new_list[] = new int[new_len];
        for(int i=0;i<len;i++){
            new_list[i] = num_list[i];
        }
        if(last>prev){
          new_list[new_len-1] = last-prev;
        }else{
            new_list[new_len-1] = last*2;
        }
        return new_list;
    }
}