package les5;


public class UniqueCount {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9,0, 8, 7, 6, 5, 4, 3, 2, 1, 0,0,9,8,7,6,5,4,3};
        System.out.println(uniqueCount(ar));
    }

    public static int uniqueCount(int[] array) {
        //write your code here
        int i = 0;
        int j = 0;
        int k = 0;
        boolean fl = true;
        while (i < array.length) {
            fl = true; j=0;
            while (j < i) {
                if (array[j] == array[i]) {
                    fl = false;break;
                }
                j++;
            }
            if (fl) {
                k++;
            }
            i++;
        }
        return k;
    }
}
