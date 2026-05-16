
class Solution {
    public double solution(int n, int m) {
        
        return Math.round(pac(n)/(pac(n-m)*pac(m)));
    }
    public double pac(int k){
        if(k==0) return 1;
        double tmp = 1;
        for(int i=k;i>=1;i--){
            tmp*=i;
        }
        return tmp;
    }
}