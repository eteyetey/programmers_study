class Solution {
    public int solution(int order) {
        int answer = 0;
        String tmp = String.valueOf(order);
        for(int i=0;i<tmp.length();i++){
            if(tmp.substring(i,i+1).equals("3")) answer+=1;
            if(tmp.substring(i,i+1).equals("6")) answer+=1;
            if(tmp.substring(i,i+1).equals("9")) answer+=1;
        }
        return answer;
    }
}