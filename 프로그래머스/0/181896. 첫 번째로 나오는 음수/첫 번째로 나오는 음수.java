class Solution {
    public int solution(int[] num_list) {
        int index = 0;
        for(int i : num_list){
            if(i<0) return index;
            index++;
        }
        return -1;
    }
}