package lesson2;

public class SumAndDivision {
    public static void main(String[] args) {
        int sum=0;
        for( int i = 0; i<=1000; i++) {
            sum = sum + i;
        };
        int a;
        a = sum/1234;
        int b;
        b = sum%1234;
boolean rez = b>a;
        System.out.println(rez);
        if (b>a) {
            System.out.println("true");} else {System.out.println("false");
        }
    }
}
