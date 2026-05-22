class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            String tmp = my_string.substring(i,i+1);
            if(tmp.toLowerCase().equals(tmp)){
               answer+=tmp.toUpperCase(); 
            }else{
                answer+=tmp.toLowerCase();
            }
        }
        return answer;
    }
}