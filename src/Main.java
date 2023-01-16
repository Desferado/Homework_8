import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        for (int i = 0; i < 3; i++) {
            array1[i] = i + 1;
        }
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = new int[12];
        for (int i = 0; i < 12; i++) {
            array3[i] = (int) (Math.random() * 12);
        }
        for (int i = 0; i < array1.length; i++) {
            if (i != array1.length - 1) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();
        for (int n = 0; n < array2.length; n++) {
            if (n != array2.length - 1) {
                System.out.print(array2[n] + ", ");
            } else {
                System.out.print(array2[n]);
            }
        }
        System.out.println();
        for (int k = 0; k < array3.length; k++) {
            if (k != array3.length - 1) {
                System.out.print(array3[k] + ", ");
            } else {
                System.out.print(array3[k]);
            }
        }
        System.out.println();
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();
        for (int n = array2.length - 1; n >= 0; n--) {
            if (n != 0) {
                System.out.print(array2[n] + ", ");
            } else {
                System.out.print(array2[n]);
            }
        }
        System.out.println();
        for (int k = array3.length - 1; k >= 0; k--) {
            if (k != 0) {
                System.out.print(array3[k] + ", ");
            } else {
                System.out.print(array3[k]);
            }
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                continue;
            } else {
                array1[i] = array1[i] + 1;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array1));
    }
}