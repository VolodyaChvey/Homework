package Homework5_2;

public class Task12 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 4, 5};
        boolean b = true;
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            if (array[i] != array[j]) {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
