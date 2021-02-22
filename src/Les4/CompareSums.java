package Les4;

public class CompareSums {
    public static void main(String[] args) {
        System.out.println(compareSums(1,5,3,4));
    }
    public static boolean compareSums(int a, int b, int c, int d) {
        //put your code here
        if (sum(a,b)>sum(c,d)) {return true;} else
            {return false;}
    }
    public static int sum(int from, int to){
        int res=0;
        for (int i=from; i<= to;i++){
            res = res + i;
        }
        return res;
    }

}
