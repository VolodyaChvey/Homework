package Homework5_2;

public class Task04 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 33, 4, 3, 34, 45, 5};
        boolean b = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    b = false;
                    break;
                }
            }
        }
        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
