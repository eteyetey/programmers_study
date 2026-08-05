import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> ans = new ArrayList<>();
        Date day = new Date(today);
        HashMap<String,Integer> termMap = new HashMap<>();
        for(int i=0;i<terms.length;i++){
            StringTokenizer st = new StringTokenizer(terms[i]);
            termMap.put(st.nextToken(),Integer.parseInt(st.nextToken()));
        }
        System.out.println(termMap);
        for(int i=0;i<privacies.length;i++){
            StringTokenizer st = new StringTokenizer(privacies[i]);
            Date tmp = new Date(st.nextToken());
            String term = st.nextToken();
            int dif = diff(day,tmp);
            System.out.println(dif);
            if(dif>=termMap.get(term)*28){
                ans.add(i+1);
            }
        }
        int[] answer = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
    public int diff(Date a,Date b){//a-b
        int A_toD = a.getY()*12*28 + a.getM()*28 + a.getD(); 
        int B_toD = b.getY()*12*28 + b.getM()*28 + b.getD(); 
       
        return A_toD - B_toD;
    }
}

class Date{
    private int y;
    private int m;
    private int d;
    
    public Date(){
        this.y=0;
        this.m=1;
        this.d=1;
    }
    
    public Date(int y,int m,int d){
        this.y=y;
        this.m=m;
        this.d=d;
    }
    public Date(String str){
        StringTokenizer st = new StringTokenizer(str,".");
        this.y = Integer.parseInt(st.nextToken());
        this.m = Integer.parseInt(st.nextToken());
        this.d = Integer.parseInt(st.nextToken());
    }
    public int getY() {return y;}
    public int getM() {return m;}
    public int getD() {return d;}
    
}