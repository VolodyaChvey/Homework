package Homework5_2;

public class Task03 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 3, 3, 3, 33, 3};
        boolean b = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                b = false;
                break;
            }
        }
        if(b){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
