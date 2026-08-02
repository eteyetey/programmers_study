import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
       HashMap<String,Integer> h = new HashMap<>();
        for(int i=0;i<players.length;i++){
            h.put(players[i],i);
        }
        for(String i : callings){
            int index = h.get(i);
            int front = index-1;
            
            String frontname = players[front];
            
            String tmp = players[front];
            players[front] = players[index];
            players[index] = tmp;
            
            h.put(i,h.get(i)-1);
            h.put(frontname,h.get(frontname)+1);
        }
        return players;
        
        
    }
   
    
}