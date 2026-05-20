class Solution {
    public int solution(int[] num_list) {
        int[] hap = new int[2];
        for(int i=0;i<num_list.length;i+=2){
            if(i+1 == num_list.length){
                hap[0]+=num_list[i];
            }else{
                hap[0]+=num_list[i];
                hap[1]+=num_list[i+1];
            }
        }
        return Math.max(hap[0],hap[1]);
    }
}