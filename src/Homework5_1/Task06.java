package Homework5_1;

public class Task06 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < 100000; ++i) {
            stringBuilder.append(i);
            if (stringBuilder.indexOf("4") >= 0 || stringBuilder.indexOf("13") >= 0) {
                ++count;
            }
            stringBuilder.delete(0, 5);
        }
        System.out.println("Придётся исключить " + count + " номеров");
    }
}
