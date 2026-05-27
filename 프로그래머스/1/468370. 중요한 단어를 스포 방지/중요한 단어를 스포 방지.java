
import java.util.*;
class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
         int answer = 0;
        StringTokenizer st = new StringTokenizer(message);
        List<String> ls = new ArrayList<>();
        //단어를 쪼갠 리스트 준비하기
        if(message.substring(0,1).equals(" ")){
            ls.add(" ");
        }
        while(st.hasMoreTokens()){
            ls.add(st.nextToken());
            ls.add(" ");
        }
        ls.remove(ls.size()-1);//마지막 공백은 필요없으므로 제거
        int a=0;
        int b=0;
        boolean isSpo[] = new boolean[ls.size()];
        for(int i=0;i<isSpo.length;i++){
            isSpo[i]=false;
        }
        //문자열 길이만큼 반복
        for(int i=0;i<message.length();i++){
            if(a<ls.size()&&isIn(i,spoiler_ranges)){
                isSpo[a]=true;
            }
            b++;
            if(a<ls.size()&&b>=ls.get(a).length()){
                b=0;
                a++;
            }
        }
        for(int i=0;i<ls.size();i++){
            if(!ls.get(i).equals(" ")&&isSpo[i]&&count(ls.get(i),ls,isSpo)==0){
                answer++;
                isSpo[i] = false;
            }
        }
        
        System.out.println(ls);
        System.out.println(Arrays.toString(isSpo));
       
        
        return answer;
    }
    
    public boolean isIn(int a,int[][] b){//a 값이 b 범위안에 있는지
        for(int i=0;i<b.length;i++){
            if(a>=b[i][0]&&a<=b[i][1]) return true;
        }
        return false;
    }
    public int count(String str,List<String> ls,boolean isSpo[]){
        int c = 0;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i).equals(str)&&!isSpo[i]) c++;
        }
        return c;
    }
}