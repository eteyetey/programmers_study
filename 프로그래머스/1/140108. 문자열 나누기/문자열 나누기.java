class Solution {
    public int solution(String s) {
        int answer = 0;
        String x = s.substring(0,1);
        int count = 0;
        int other = 0;
        for(int i=0;i<s.length();i++){
            String y = s.substring(i,i+1);
            if(x.equals(y)){
             count++;
                System.out.println("x임");
            }else{
                other++;
                System.out.println("x가 아님");
            }
            if(other==count&&i!=s.length()-1){
                answer++;
                System.out.println("같아짐 자름");
                x = s.substring(i+1,i+2);
                count = 0;
                other=0;
            }
        }
        return answer+1;
    }
}