class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String tmp[] = {"",""};
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2!=0){
                tmp[0]+=String.valueOf(num_list[i]);
            }else{
                tmp[1]+=String.valueOf(num_list[i]);
            }
        }
        System.out.println(tmp[0]+tmp[1]);
        answer = Integer.parseInt(tmp[0])+Integer.parseInt(tmp[1]);
        return answer;
    }
}