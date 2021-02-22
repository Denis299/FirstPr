package Les3;

public class FindOdd {
    public static void main(String[] args) {
        int sum=0,j;
        for (int i = 1; i<=1000; i++) {j = i%2;
if ( (j == 0) ) {
    System.out.println("Found"); sum=sum+i;
}
        }
        sum = sum*5;
        if (sum >5000) {
            System.out.println("Bigger");} else {
            System.out.println("smaller or equal");}
        }
    }

