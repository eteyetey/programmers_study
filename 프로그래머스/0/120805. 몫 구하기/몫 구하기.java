class Solution {
    public int solution(int num1, int num2) {
        int mok=0;
        while(true){
            num1 = num1-num2;
            if(num1<0) break;
            mok ++;
        }
        return mok;
    }
}