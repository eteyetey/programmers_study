class Solution {
    public int[] solution(int[] numbers) {
        int j=0;
        for(int i : numbers ){
            numbers[j++] = i*2;
        }
        return numbers;
    }
}