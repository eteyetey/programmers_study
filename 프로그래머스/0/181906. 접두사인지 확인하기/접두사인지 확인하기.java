class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String pre[] = new String[my_string.length()];
        for(int i=1;i<=my_string.length();i++){
            for(int j=0;j<i;j++){
                pre[i-1] = my_string.substring(0,j);
            }
        }
        boolean ispre = false;
        for(int i=0;i<pre.length;i++){
            if(is_prefix.equals(pre[i])) ispre = true;
        }
        return (ispre)?1:0;
    }
}