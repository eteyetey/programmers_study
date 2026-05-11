class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] tmp = arr;
        for(int i[] : queries){
            change(tmp,i[0],i[1]);
        }
        return tmp;
    }
    public void change(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j]=tmp;
    }
}