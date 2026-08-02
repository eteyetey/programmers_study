import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
       
        int[][] gift_table = new int[friends.length][friends.length];
        int[] gift_value = new int[friends.length];
        int[] result = new int[friends.length];
        
        for(int i=0;i<gifts.length;i++){
            StringTokenizer st = new StringTokenizer(gifts[i]);
            int give = getNum(st.nextToken(),friends);
            int take = getNum(st.nextToken(),friends);
            gift_table[give][take]++;
            
        }
        for(int i=0;i<gifts.length;i++){
            StringTokenizer st = new StringTokenizer(gifts[i]);
            gift_value[getNum(st.nextToken(),friends)]++;
            gift_value[getNum(st.nextToken(),friends)]--;
        }
        for(int i=0;i<friends.length;i++){
            for(int j=0;j<friends.length;j++){
                System.out.print(gift_table[i][j]+" ");
            }
            
            System.out.println(gift_value[i]);
        }
        
        for(int i=0;i<friends.length;i++){
            for(int j=0;j<friends.length;j++){
                if(i==j) continue;
                if(gift_table[i][j]>gift_table[j][i]){
                    result[i]++;
                }else if(gift_table[i][j]==gift_table[j][i]){
                    if(gift_value[i]>gift_value[j]){
                        result[i]++;
                    }
                }
            }
        }
        for(int i=0;i<result.length;i++) System.out.print(result[i]+" ");
        
        return max(result);
    }
    public int getNum(String a,String[] b){
        for (int i=0;i<b.length;i++){
            if(b[i].equals(a)) return i;
        }
        return -1;
    }
    public int max(int[] a){
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max) max=a[i];
        }
        return max;
    }
   
}