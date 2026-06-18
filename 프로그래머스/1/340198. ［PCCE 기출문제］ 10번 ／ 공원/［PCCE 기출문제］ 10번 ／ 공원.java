import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        for(int i=0;i<mats.length/2;i++){
            int tmp = mats[i];
            mats[i] = mats[mats.length-i-1];
            mats[mats.length-i-1]=tmp;
        }
        for(int i : mats){
            for(int j=0;j<park.length-i+1;j++){
                for(int k=0;k<park[j].length-i+1;k++){
                    boolean isEmpty = true;
                    for(int p=0;p<i;p++){
                        for(int q=0;q<i;q++){
                            if(!park[j+p][k+q].equals("-1")){
                                isEmpty=false;
                            }
                        }
                    }
                    if(isEmpty){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}