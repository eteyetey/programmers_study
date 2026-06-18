import java.util.*;

class Time{
    int min;
    int sec;
    public Time(String t){
        StringTokenizer st = new StringTokenizer(t,":");
        min = Integer.parseInt(st.nextToken());
        sec = Integer.parseInt(st.nextToken());
    }
    public void setTime(Time t){
        min = t.min;
        sec = t.sec;
    }
    public void prev(){
        sec-=10;
        if(sec<0){
            sec+=60;
            min-=1;
        }
        if(min<0){
            min=0;
            sec=0;
        }
    }
    
    public void next(){
        sec+=10;
        if(sec>=60){
            sec-=60;
            min+=1;
        }
    }
    public boolean inTime(Time start,Time end)
    {
        int thisTime = min*60+sec;
        int startTime = start.min*60+start.sec;
        int endTime = end.min*60+end.sec;
        boolean a = thisTime>=startTime;
        boolean b = thisTime<=endTime;
        return a&&b;
    }
    public boolean exceed(Time t){
        return (min*60+sec)>=t.min*60+t.sec;
    }
    
}
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        Time posTime = new Time(pos);
        Time op_startTime = new Time(op_start);
        Time op_endTime = new Time(op_end);
        Time lenTime=new Time(video_len);
        for(int i=0;i<commands.length;i++){
            if(posTime.inTime(op_startTime,op_endTime)){
                posTime.setTime(op_endTime);
            }
            if(posTime.exceed(lenTime)){
                posTime.setTime(lenTime);
            }
            if(commands[i].equals("prev")){
                posTime.prev();
            }else if(commands[i].equals("next")){
                posTime.next();
            }
            if(posTime.inTime(op_startTime,op_endTime)){
                posTime.setTime(op_endTime);
            }
            if(posTime.exceed(lenTime)){
                posTime.setTime(lenTime);
            }
        }
        answer = String.format("%02d:%02d",posTime.min,posTime.sec);
        
        return answer;
    }
}