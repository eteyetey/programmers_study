class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(char letter : s.toCharArray()){
            char tmp = letter;
            int idx = 0;
            while(idx<index){
                tmp =tmp=='z'?'a':(char)(tmp+1);
                if(!skip.contains(tmp+"")){
                    idx++;
                }
            }
            answer+=tmp+"";
        }
        
        return answer;
    }
}