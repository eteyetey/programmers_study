import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> Topk = new ArrayList<>();
        for(int i=0;i<score.length;i++){
            System.out.println(score[i]);
            if(i<k){
                Topk.add(score[i]);
                Collections.sort(Topk);
                answer[i] = Topk.get(0);
            }else{
                Collections.sort(Topk);
                if(score[i]>=Topk.get(0)) {
                    Topk.add(score[i]);
                     Collections.sort(Topk);
                    Topk.remove(0);
                } 
               
                answer[i] = Topk.get(0);
            }
        }
        return answer;
    }
}