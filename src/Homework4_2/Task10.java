package Homework4_2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String[] str = new String[7];
        for (int i = 0; i < 7; i++) {
            str[i] = "";
        }
        for (int i = 0; i < number.length(); i++) {
            switch (number.charAt(i)) {
                case '0':
                    str[0] = str[0] + "   ***  ";
                    str[1] = str[1] + "  *   * ";
                    str[2] = str[2] + " *     *";
                    str[3] = str[3] + " *     *";
                    str[4] = str[4] + " *     *";
                    str[5] = str[5] + "  *   * ";
                    str[6] = str[6] + "   ***  ";
                    break;
                case '1':
                    str[0] = str[0] + "  *  ";
                    str[1] = str[1] + " **  ";
                    str[2] = str[2] + "  *  ";
                    str[3] = str[3] + "  *  ";
                    str[4] = str[4] + "  *  ";
                    str[5] = str[5] + "  *  ";
                    str[6] = str[6] + " *** ";
                    break;
                case '2':
                    str[0] = str[0] + "  *** ";
                    str[1] = str[1] + " *   *";
                    str[2] = str[2] + " *  * ";
                    str[3] = str[3] + "   *  ";
                    str[4] = str[4] + "  *   ";
                    str[5] = str[5] + " *    ";
                    str[6] = str[6] + " *****";
                    break;
                case '3':
                    str[0] = str[0] + "  *** ";
                    str[1] = str[1] + " *   *";
                    str[2] = str[2] + "    * ";
                    str[3] = str[3] + "   *  ";
                    str[4] = str[4] + "    * ";
                    str[5] = str[5] + " *   *";
                    str[6] = str[6] + "  *** ";
                    break;
                case '4':
                    str[0] = str[0] + "    *  ";
                    str[1] = str[1] + "   **  ";
                    str[2] = str[2] + "  * *  ";
                    str[3] = str[3] + " *  *  ";
                    str[4] = str[4] + " ******";
                    str[5] = str[5] + "    *  ";
                    str[6] = str[6] + "    *  ";
                    break;
                case '5':
                    str[0] = str[0] + " *****";
                    str[1] = str[1] + " *    ";
                    str[2] = str[2] + " *    ";
                    str[3] = str[3] + "  *** ";
                    str[4] = str[4] + "     *";
                    str[5] = str[5] + "     *";
                    str[6] = str[6] + " **** ";
                    break;
                case '6':
                    str[0] = str[0] + "  *   ";
                    str[1] = str[1] + " *    ";
                    str[2] = str[2] + " *    ";
                    str[3] = str[3] + " **** ";
                    str[4] = str[4] + " *   *";
                    str[5] = str[5] + " *   *";
                    str[6] = str[6] + " **** ";
                    break;
                case '7':
                    str[0] = str[0] + " *****";
                    str[1] = str[1] + "     *";
                    str[2] = str[2] + "    * ";
                    str[3] = str[3] + "   *  ";
                    str[4] = str[4] + "  *   ";
                    str[5] = str[5] + " *    ";
                    str[6] = str[6] + " *    ";
                    break;
                case '8':
                    str[0] = str[0] + "  *** ";
                    str[1] = str[1] + " *   *";
                    str[2] = str[2] + " *   *";
                    str[3] = str[3] + "  *** ";
                    str[4] = str[4] + " *   *";
                    str[5] = str[5] + " *   *";
                    str[6] = str[6] + "  *** ";
                    break;
                case '9':
                    str[0] = str[0] + "  ****";
                    str[1] = str[1] + " *   *";
                    str[2] = str[2] + " *   *";
                    str[3] = str[3] + "  ****";
                    str[4] = str[4] + "     *";
                    str[5] = str[5] + "     *";
                    str[6] = str[6] + "    * ";
                    break;
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(str[i]);
        }
    }
}
