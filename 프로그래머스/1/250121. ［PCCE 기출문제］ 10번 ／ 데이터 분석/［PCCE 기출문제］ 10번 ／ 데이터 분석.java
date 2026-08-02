class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] tmp = new int[data.length][4];
        int index = 0;
        int mode = 0;
        
             
            if(ext.equals("code")){
                mode = 0;
            }else if(ext.equals("date")){
                mode = 1;
            }else if(ext.equals("maximum")){
                mode = 2;
            }else if(ext.equals("remain")){
                mode = 3;
            }
            for(int i=0;i<data.length;i++){
                if(data[i][mode]<val_ext){
                    for(int j=0;j<4;j++){
                        tmp[index][j] = data[i][j];
                        
                    }
                    index++;
                    
                }
            }
        if(sort_by.equals("code")){
                mode = 0;
            }else if(sort_by.equals("date")){
                mode = 1;
            }else if(sort_by.equals("maximum")){
                mode = 2;
            }else if(sort_by.equals("remain")){
                mode = 3;
            }
       
       
            int[] order = new int[tmp.length];
        for(int i=0;i<tmp.length;i++) order[i] = i;
        while(true){
            int move = 0;
            for(int i=0;i<tmp.length-1;i++){
                if(tmp[order[i]][mode]>tmp[order[i+1]][mode]){
                    int a = order[i];
                    order[i] = order[i+1];
                    order[i+1] = a;
                    move++;
                }
            }
            if(move==0) break;
        }
        int count = 0;
        for(int i=0;i<tmp.length;i++){
            if(tmp[i][0]!=0) count++;
        }
        int[][] answer = new int[count][4];
        index = 0;
        for(int i : order){
            if(tmp[i][0]==0) continue;
            for(int j=0;j<4;j++){
                answer[index][j] = tmp[i][j];
               
            }
             index++;
            
        }
        
        return answer;
        
       
        
    }
}