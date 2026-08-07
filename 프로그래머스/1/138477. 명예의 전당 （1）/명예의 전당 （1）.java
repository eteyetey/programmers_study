import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<score.length;i++){
            if(i<k){
                q.add(score[i]);
                answer[i] = q.peek();
            }else{
                if(score[i]>q.peek()){
                    q.add(score[i]);
                    q.poll();
                }
                 answer[i] = q.peek();
                
            }
        }
        return answer;
    }
}