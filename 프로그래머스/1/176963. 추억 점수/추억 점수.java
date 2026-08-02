import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String,Integer> h = new HashMap<>();
        for(int i=0;i<name.length;i++){
            h.put(name[i],yearning[i]);
        }
        int[] answer = new int[photo.length];
        for(int i=0;i<answer.length;i++){
            for(String j : photo[i]){
                try{
                     answer[i]+=h.get(j);
                }catch(NullPointerException e){
                    System.out.println(j+"는 추억점수가 없음");
                }
               
            }
        }
        return answer;
    }
}