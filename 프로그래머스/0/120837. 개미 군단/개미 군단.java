class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a=0,b=0,c = 0;//장군 병정 일
        while(true){
            if(hp>=5){
                hp-=5;
                a++;
            }else{
                break;
            }
        }
        while(true){
            if(hp>=3){
                hp-=3;
                b++;
            }else{
                break;
            }
        }
        while(true){
            if(hp>=1){
                hp-=1;
                c++;
            }else{
                break;
            }
        }
        
        return a+b+c;
    }
}