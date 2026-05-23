class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String tmp = new StringBuilder(pat).reverse().toString();
        String rstr = new StringBuilder(myString).reverse().toString();
        for(int i=0;i<myString.length()-pat.length()+1;i++){
            if(rstr.substring(i,i+pat.length()).equals(tmp)){
                answer = new StringBuilder(rstr.substring(i,rstr.length())).reverse().toString();
                break;
            }
        }
        return answer;
    }
}