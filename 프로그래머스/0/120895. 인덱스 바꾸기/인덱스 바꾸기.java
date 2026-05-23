class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String tmp1 = my_string.substring(num1,num1+1);
        String tmp2 = my_string.substring(num2,num2+1);
        for(int i =0;i<my_string.length();i++){
            if(i==num1){
                answer+=tmp2;
            }else if(i==num2){
                answer+=tmp1;
            }else{
                answer+=my_string.substring(i,i+1);
            }
        }
        return answer;
    }
}