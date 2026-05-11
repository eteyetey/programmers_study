class Solution {
    public int solution(int n, String control) {
        int strlen = control.length();
        for(int i=0;i<strlen;i++){
            char tmp = control.charAt(i);
            switch(tmp){
                case 'w':
                    n+=1;
                    break;
                case 's':
                    n-=1;
                    break;
                case 'd':
                    n+=10;
                    break;
                case 'a':
                    n-=10;
                    break;
                
            }
        }
       return n; 
    }
}