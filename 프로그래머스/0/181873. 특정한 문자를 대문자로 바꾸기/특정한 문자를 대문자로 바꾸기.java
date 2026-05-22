class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            String tmp = my_string.substring(i,i+1);
            if(tmp.equals(alp)){
                answer+=alp.toUpperCase();
            }else{
                answer+=tmp;
            }
        }
        return answer;
    }
}