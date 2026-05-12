import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
       Random rd = new Random();
		String f[] = {"0","5"};
		
		HashSet<String> hs = new HashSet<>();
		int j=0;
		while(true) {
			String tmp = "";
			if(hs.size()>=Math.pow(2, String.valueOf(r).length())) break;
			for(int i=0;i<String.valueOf(r).length();i++) {
				int k = rd.nextInt(2);
				tmp +=f[k];
			}
			hs.add(tmp);
			System.out.println(tmp);
		}
        List<Integer> ls = new ArrayList<>();
        for(String k : hs){
            int tmp = Integer.parseInt(k);
            if(tmp>=l&&tmp<=r) ls.add(tmp);
            
        }
        Collections.sort(ls);
        int ans[] = new int[ls.size()];
        if(ls.size()==0) return new int[]{-1};
        for(int i=0;i<ls.size();i++){
            ans[i] = ls.get(i);
        }
        
		
		return ans;
    }
}