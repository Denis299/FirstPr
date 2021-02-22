package Les4;

public class MethodExample {
    public static void main(String[] args) {
        System.out.println(increaser(5,20));

        System.out.println(min(increaser(10,5),11));

    }

    public static int increaser(int a, int delta) {

        //put your code here
        System.out.println("method invoked");
        //a = a + delta;
        System.out.println("method before return");
        return   a + delta;
    }

    public static int min(int a, int b) {

        //put your code here

        if (b < a){return b;}
        return a;
    }
}