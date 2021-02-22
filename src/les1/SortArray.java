package les1;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] balances = {3, 2, 1, 1, 5, 6, 9, 8, 7};

        System.out.println(Arrays.toString(sortAscending(balances)));

        System.out.println(Arrays.toString(sortDescending(balances)));

    }

    public static int[] sortAscending(int[] array) {
        int i = 1;
        int x;
        boolean fl = true;
        while (fl) {
            fl = false;
            for (i = 1; i < array.length; i++) {
//            System.out.println(array[i]+" "+array[i-1]);
                if (array[i] < array[i - 1]) {
                    x = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = x;
                    fl = true;
                    //            System.out.println(Arrays.toString(array));
                }
            }
        }
        return array;
    }

    ;

    public static int[] sortDescending(int[] array) {
        int i = 1;
        int x;
        boolean fl = true;
        while (fl) {
            fl = false;
            for (i = 1; i < array.length; i++) {
//            System.out.println(array[i]+" "+array[i-1]);
                if (array[i] > array[i - 1]) {
                    x = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = x;
                    fl = true;
                    //            System.out.println(Arrays.toString(array));
                }
            }
        }
        return array;
    }

    ;

}
