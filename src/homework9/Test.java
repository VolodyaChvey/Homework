package homework9;

import java.util.Random;

public class Test {
    Random random = new Random();

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.workeNickname());
    }

    public String workeNickname() {
        int i = random.nextInt(3) + 5;
        char[] chars = new char[i];
        for (int j = 0; j < chars.length; j++) {
            chars[j] = (char) ((char) random.nextInt(57) + 65);
        }
        String nickname = String.valueOf(chars);
        return nickname;
    }
}
