class Solution {
    public int solution(int price) {
        double ans = price;
        if(price>=100000&&price<300000){
            ans = price*0.95;
            System.out.println(ans);
        }else if(price>=300000&&price<500000){
            ans = price*0.9;
            System.out.println(ans);
        }else if(price>=500000){
            ans = price*0.8;
            System.out.println(ans);
        }
        return (int)ans;
    }
}