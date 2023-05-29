package dynamicPrograming;

public class CountingBits {
    public static int[] countBits(int n) {//  5
        int[] arr = new int[n+1];
        int i = 1;
        while (i<=n){
            if(i >= 4){
                int val = i /2;
                if(i % 2 == 0){
                    arr[i] = arr[val];
                }else {
                    arr[i] = arr[val] +1;
                }
            }else {
                if(i % 2 == 0){
                    arr[i] = i/2;
                }else {
                    arr[i] = 1 + (i/2);
                }
            }
            i++;
        }
        return arr;
    }
}
