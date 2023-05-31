package dynamicPrograming;

public class Fibonacci {

    public int fib(int n) { // run time 0 ms // memory 39.3 mb
        if(n == 0){
            return 0;
        }
        int first = 0;
        int second = 1;

        for(int i =2;i<n;i++){
            int temp = second;
            second = first + second;
            first = temp;
        }
        return first + second;
    }
}
