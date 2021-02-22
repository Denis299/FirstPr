package Les4;

public class PracticeExample {
    public static void main(String[] args) {
        System.out.println(average(10));
        System.out.println(average(5,10));
        System.out.println(min(7, 4, 5));
        System.out.println(count(3,9,7));

    }

    public static int min(int a, int b, int c) {

        //put your code here
        int res = a;
        if (a > b) res = b;
        if (c < b) res = c;

        return res;
    }

    public static double average(int n) {

        //put your code here
        double res = 0;
        int k = 1;
        for (k = 1; k <= n; k++) {
            res = res + k;
        }
        res = res / n;
        return res;
    }

    public static double average(int a, int b) {

        //put your code here
        double res = 0;

        for (int i = a; i < b; i++) {
            res = res + i;
        }
        res = res / (b - a);

        return res;
    }

    public static int count(int a, int b, int n) {

        //put your code here
        int res = 0;
        int k;

        for (int i=a;i<=b;i++){k = i%10; if (k == n){res = res+1;};};

        return res;
    }
}