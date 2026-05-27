class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int day = startday;
       for(int i=0;i<schedules.length;i++){//i번째 직원
           int tmp = 0;
           for(int j=0;j<7;j++){
               if(day>7){
                   day=1;
               }
               if(day<6){
                   int schMin = (schedules[i]/100)*60+schedules[i]%100;
                   int logMin = (timelogs[i][j]/100)*60+timelogs[i][j]%100;
                   System.out.print(logMin-schMin+", ");
                   if(logMin<schMin||logMin-schMin<=10){
                       tmp++;
                   }
               }
               day++;
           }
           if(tmp>=5){
               answer++;
               tmp = 0;
           }
           System.out.println();
           day = startday;
       }
        return answer;
    }
    
    public void timeMinus(int time1,int time2){
        int min1 = (time1/100)*60 + time1%100;
        int min2 = (time2/100)*60 + time2%100;
        
    }
    
}

