import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        int x = arr[0];
        int y = arr[1];
        int z = arr[2];
        int w = arr[3];

       
        if (x == w) {
            return 1111 * x;
        }

    
        if (x == z) {
            return (int)Math.pow(10 * x + w, 2);
        }

        
        if (y == w) {
            return (int)Math.pow(10 * y + x, 2);
        }

       
        if (x == y && z == w) {
            return (x + z) * Math.abs(x - z);
        }

        
        if (x == y) {
            return z * w;
        }

        
        if (y == z) {
            return x * w;
        }

        
        if (z == w) {
            return x * y;
        }

        
        return x;
    }
}