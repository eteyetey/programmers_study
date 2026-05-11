class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%7==0){
            answer = n/7;
        }else{
            answer = (int)(n/7.0 +1);
        }
        return answer;
    }
}