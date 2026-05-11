class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        boolean all,two;
        int a2 = (int)Math.pow(a,2);
        int b2 = (int)Math.pow(b,2);
        int c2 = (int)Math.pow(c,2);
        int a3 = (int)Math.pow(a,3);
        int b3 = (int)Math.pow(b,3);
        int c3 = (int)Math.pow(c,3);
        all = (a==b)&&(b==c);
        two = (a==b)||(b==c)||(a==c);
        if(all){
             answer = (a+b+c)*(a2+b2+c2)*(a3+b3+c3);
            
        }else if(two){
            answer = (a+b+c)*(a2+b2+c2);
        }else{
           answer = a+b+c;
        }
        return answer;
    }
}