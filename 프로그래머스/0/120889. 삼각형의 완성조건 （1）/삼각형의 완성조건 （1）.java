class Solution {
    public int solution(int[] sides) {
        
        int max = sides[0];
        for(int i=1;i<3;i++){
            if(sides[i]>max){
                max = sides[i];
            }
        }
        if(sides[0]+sides[1]+sides[2]-2*max>0) return 1;
        return 2;
    }
}