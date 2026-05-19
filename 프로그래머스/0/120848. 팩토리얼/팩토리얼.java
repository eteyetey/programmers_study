class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        while(true){
            if(pac(i)<=n) answer = i;
            if(pac(i)>n) break;
            i++;
        }
        return answer;
    }
    public int pac(int k){
        int ans =1;
        for(int i=1;i<=k;i++){
            ans*=i;
        }
        return ans;
    }
}