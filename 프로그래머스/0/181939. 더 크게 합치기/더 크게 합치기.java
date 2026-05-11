import java.util.*;
class Solution {
    public int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int case1 = Integer.parseInt(sb1.append(String.valueOf(a)).append(String.valueOf(b)).toString());
        int case2 = Integer.parseInt(sb2.append(String.valueOf(b)).append(String.valueOf(a)).toString());
        return (case1>case2)?case1:case2;
    }
}