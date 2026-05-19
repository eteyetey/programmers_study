class Solution {
    public int[] solution(int[] num_list, int n) {
        int answer[] = new int[(num_list.length-1)/n+1];
        int j=0;
        for(int i=0;i<answer.length;i++){
            if(j>=num_list.length) break;
            answer[i] = num_list[j];
            j+=n;
            
        }        
        return answer;
    }
}