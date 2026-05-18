import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = Arrays.copyOf(numbers,numbers.length);
        if(direction.equals("right")){
            int tmp = numbers[numbers.length-1];
            for(int i=numbers.length-2;i>=0;i--){
                answer[i+1] = answer[i];
            }
            answer[0] = tmp;
        }else{
             int tmp = answer[0];
            for(int i=1;i<numbers.length;i++){
                answer[i-1] = answer[i];
            }
            answer[numbers.length-1] = tmp;
        }
        return answer;
    }
}