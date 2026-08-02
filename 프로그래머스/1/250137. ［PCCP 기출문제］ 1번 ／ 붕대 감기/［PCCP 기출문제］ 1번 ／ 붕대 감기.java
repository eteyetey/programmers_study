class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int curHp = health;
        int combo=0;
        for(int i=1;i<=attacks[attacks.length-1][0];i++){
            int damage = getDamage(i,attacks);
            if(damage==0){
                curHp+=bandage[1];
                combo++;
                if(combo==bandage[0]){
                    curHp+=bandage[2];
                    combo=0;
                }
            }else{
               combo=0;
                curHp-=damage;
            }
            
            if(curHp<=0) return -1;
            if(curHp>=health) curHp = health;
        }
        return curHp;
    }
    public int getDamage(int time, int[][] pattern){
        for(int i=0;i<pattern.length;i++){
            if(time==pattern[i][0]){
                return pattern[i][1];
            }
        }
        return 0;
    }
    
}