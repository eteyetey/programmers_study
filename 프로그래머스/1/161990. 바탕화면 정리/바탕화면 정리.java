import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        
        //최소x최소y -> 최대x최대y
        //X=행 Y=열
        List<Integer> posX = new ArrayList<>();
        List<Integer> posY = new ArrayList<>();
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++){
                if(wallpaper[i].substring(j,j+1).equals("#")){
                    posX.add(i);
                    posY.add(j);
                }
            }
        }
        Collections.sort(posX);
        Collections.sort(posY);
        System.out.println(posX);
        System.out.println(posY);
        int[] answer = new int[4];
        answer[0] = posX.get(0);
        answer[1] = posY.get(0);
        answer[2] = posX.get(posX.size()-1)+1;
        answer[3] = posY.get(posY.size()-1)+1;
        return answer;
    }
}