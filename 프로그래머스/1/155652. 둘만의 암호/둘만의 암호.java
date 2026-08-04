class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            int j=0;
           
               char tmp = s.charAt(i);
                int stack = 0;
            int k=0;
                while(k<index){
                    tmp+=1;
                    if(tmp>'z') tmp='a';
                    if(isIn(tmp,skip)){
                        stack++;
                        continue;
                    }
                    k++;
                }
                
                answer+=tmp+"";
                j++;
            
        }
        return answer;
    }
    public boolean isIn(char a,String b){
        for(int i=0;i<b.length();i++){
            if(a==b.charAt(i)) return true;
        }
        return false;
    }
    
}