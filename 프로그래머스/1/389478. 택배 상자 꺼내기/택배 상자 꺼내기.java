import java.util.*;
class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int k = 1;
        int[][] boxs = new int[n/w+1][w];
        for(int i=0;i<boxs.length;i++){
            if(k>n)break;
            if(i%2==0){//정방향
                for(int j=0;j<w;j++){
                    if(k>n)break;
                    boxs[i][j]=k++;
                }
            }else{//역방향
                for(int j=w-1;j>=0;j--){
                    if(k>n)break;
                    boxs[i][j]=k++;
                }
            }
        }
        System.out.println(Arrays.deepToString(boxs));
        
        for(int i=0;i<boxs.length;i++){
            for(int j=0;j<boxs[i].length;j++){
                if(boxs[i][j]==num){
                    for(int tmp=i;tmp<boxs.length;tmp++){
                        if(boxs[tmp][j]!=0) answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}