class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        for(int i=0;i<2*k;i+=2){
           int index = i%numbers.length;
            answer = numbers[index];
        }
        
        return answer;
    }
}