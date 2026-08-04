class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        //처음 나타나는구역 칠하기(위치+길이-1 까지는 칠했다고 가정)
        //위치+길이 부터 다시 탐색 반복
        int pos = 1;
        int index = 0;
        while(index<section.length){
            if(section[index]>=pos){
                pos = section[index]+m;
                answer++;
            }
            index++;
        }
        return answer;
    }
}