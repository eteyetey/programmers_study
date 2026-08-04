class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        boolean possible = true;
        int mode = 0;
        int i=0;
        int mode0_i = 0;
        int mode1_i=0;
        while(i<goal.length){
            
            int stack=0;
            
            if(mode==0){
                if(mode0_i<cards1.length&&cards1[mode0_i].equals(goal[i])){
                    mode0_i++;
                    i++;
                    
                }else{
                    mode=1;
                    stack++;
                }
            }
            if(mode==1){
                if(mode1_i<cards2.length&&cards2[mode1_i].equals(goal[i])){
                    mode1_i++;
                    i++;
                     
                }else{
                    mode=0;
                    stack++;
                }
            }
            if(stack==2) return "No";
        }
        return "Yes";
    }
  
}