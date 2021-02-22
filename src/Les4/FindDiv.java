package Les4;

public class FindDiv {
    public static void main(String[] args) {

    }
    public int findDivCount(short a, short b, int n) {

        //write your code here
        int res = 0;int d;
        for (int i=a;i<=b;i++) {d=i%n; if (d == 0) {res++;}}

        return res;
    }
}
