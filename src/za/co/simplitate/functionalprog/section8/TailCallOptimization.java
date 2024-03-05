package za.co.simplitate.functionalprog.section8;

public class TailCallOptimization {

    public static void main(String[] args) {

    }

    public static long refact(int n) { // regular recursion
        if(n <= 1)
            return 1;
        else
            return n * refact(n -1);
    }

    public static long tailRefact(int n, int a) { // tail recursion
        if(n <= 1)
            return a;
        else
            return tailRefact(n - 1, n * a);
    }
}
