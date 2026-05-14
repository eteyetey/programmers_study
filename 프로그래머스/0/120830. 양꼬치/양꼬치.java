class Solution {
    public int solution(int n, int k) {
        int service = n/10;
        int real_k = k-service;
        
        return 12000*n + 2000*real_k;
    }
}