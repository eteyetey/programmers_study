import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        
        List<String> ls = new ArrayList<>();
        for(int i=0;i<strArr.length;i++){
             boolean tmp = true;
            for(int j=0;j<strArr[i].length()-1;j++){
                if(strArr[i].substring(j,j+2).equals("ad")){
                    tmp = false;
                }
            }
            if(tmp){
                ls.add(strArr[i]);
            }
        }
        String[] answer = new String[ls.size()];
        for(int i=0;i<ls.size();i++){
            answer[i] = ls.get(i);
        }
        return answer;
    }
}