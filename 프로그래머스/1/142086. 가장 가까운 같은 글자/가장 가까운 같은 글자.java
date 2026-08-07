import java.util.stream.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] last = new int[26];
        IntStream.range(0,26).forEach(i->last[i]=-1);
        Character[] arr = IntStream.range(0,s.length()).mapToObj(i->s.charAt(i)).toArray(Character[]::new);
        for(int i=0;i<arr.length;i++){
            int index = arr[i]-'a';
            if(last[index]==-1){
                last[index] = i;
                answer[i]=-1;
            }else{
                answer[i] = i-last[index];
                last[index] = i;
            }
        }
        
        return answer;
    }
}