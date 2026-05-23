class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String tmp = "";
        int i=0;
        while(true){
            if(i>=numbers.length()) break;
            if(numbers.substring(i,i+1).equals("z")){
                tmp+="0";
                i+=4;
            }else if(numbers.substring(i,i+1).equals("o")){
                tmp+="1";
                i+=3;
            }else if(numbers.substring(i,i+1).equals("t")){
                if(numbers.substring(i+1,i+2).equals("w")){
                    tmp+="2";
                    i+=3;
                }else{
                    tmp+="3";
                    i+=5;
                }
            }else if(numbers.substring(i,i+1).equals("f")){
                 if(numbers.substring(i+1,i+2).equals("o")){
                    tmp+="4";
                    i+=4;
                }else{
                    tmp+="5";
                    i+=4;
                }
            }else if(numbers.substring(i,i+1).equals("s")){
                 if(numbers.substring(i+1,i+2).equals("i")){
                    tmp+="6";
                    i+=3;
                }else{
                    tmp+="7";
                    i+=5;
                }
            }else if(numbers.substring(i,i+1).equals("e")){
                 tmp+="8";
                    i+=5;
            }else if(numbers.substring(i,i+1).equals("n")){
                tmp+="9";
                i+=4;
            }
        }
        answer = Long.parseLong(tmp);
        return answer;
    }
}