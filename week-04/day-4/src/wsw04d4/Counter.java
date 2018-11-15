package wsw04d4;

public class Counter {

    public static void main(String[] args) {
        int downFromN = 6;
        recursion(downFromN);
    }

    public static void recursion(int downFromN) {
        System.out.println(downFromN);
        if (downFromN > 0) {
            recursion(downFromN - 1);
        }
    }
}
