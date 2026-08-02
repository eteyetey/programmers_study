
import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[i].length();j++){
                if(park[i].substring(j,j+1).equals("S")){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        for(int i=0;i<routes.length;i++){
            StringTokenizer st = new StringTokenizer(routes[i]);
            String dir = st.nextToken();
            int amount = Integer.parseInt(st.nextToken());
            boolean go = true;
            if(dir.equals("N")){//위
                for(int j=0;j<amount;j++){
                    if(answer[0]==0||answer[0]-j-1<0){
                        go=false;
                    }else if(park[answer[0]-j-1].substring(answer[1],answer[1]+1).equals("X")){
                        go = false;
                    }
                }
                if(go) answer[0]-=amount;
            }else  if(dir.equals("S")){//아래
                for(int j=0;j<amount;j++){
                    if(answer[0]+j+1>=park.length){
                        go=false;
                    }else if(park[answer[0]+j+1].substring(answer[1],answer[1]+1).equals("X")){
                        go = false;
                    }
                }
                if(go) answer[0]+=amount;
            }else  if(dir.equals("W")){//좌
                for(int j=0;j<amount;j++){
                    if(answer[1]==0||answer[1]-j-1<0){
                        go=false;
                    }else if(park[answer[0]].substring(answer[1]-j-1,answer[1]-j).equals("X")){
                        go = false;
                    }
                }
                if(go) answer[1]-=amount;
            }else  if(dir.equals("E")){//우
                for(int j=0;j<amount;j++){
                    if(answer[1] + j + 1 >= park[answer[0]].length()){
                        go=false;
                    }else if(park[answer[0]].substring(answer[1] + j + 1, answer[1] + j + 2).equals("X")){
                        go = false;
                    }
                }
                if(go) answer[1]+=amount;
            }
        }
        
        return answer;
    }
    public String cell(int a,int b,String[] c){//세로 가로 좌표
        return c[a].substring(b,b+1);
    }
}