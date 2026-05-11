class Solution {
    public int solution(int n) {
        return(n%2!=0)? (int)Math.pow((n+1)/2,2):(n*(n+1)*(n+2))/6;
    }
}