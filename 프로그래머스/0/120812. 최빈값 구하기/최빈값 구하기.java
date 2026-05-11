import java.util.*;
class Solution {
    public int solution(int[] array) {
        int ans = 0;
        int maxofindex=0;
        int max=0;
        boolean du = false;
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            
            int tmp = count(array[i],array)[0];
            int tmpofindex = count(array[i],array)[1];
            System.out.println(tmp+" "+tmpofindex);
            if(tmp>max){
                max = tmp;
                maxofindex = tmpofindex;
                ans = array[maxofindex];
                System.out.println(ans);
                i+=tmp-1;
                du=false;
            }else if(tmp==max){
                du=true;
                
            }
            
        }
        if(du) ans = -1;
        
        return ans;
    }
    int[] count(int a,int[] arr){//배열에 들어있는 해당 숫자 개수와 첫 인덱스 반환
        int c=0;
        int index = 0;
        
        int ans[] = new int[2];
        for(int i : arr){
            if(i==a) c++;
        }
         for(int i=0;i<arr.length;i++){
            if(arr[i]==a) {index = i;break;}
        }
        ans[0]=c;ans[1]=index;
        return ans;
    }
    
}