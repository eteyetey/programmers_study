import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Math.abs(array[0]-n);
        Arrays.sort(array);
        int[] array2 = new int[array.length];
        for(int i=0;i<array.length;i++){
            array2[array2.length-i-1] = array[i];
        }
        for(int i : array2){
            if(Math.abs(i-n)<=min){
                 min = Math.abs(i-n);
                answer = i;
            }
        }
        return answer;
    }
}