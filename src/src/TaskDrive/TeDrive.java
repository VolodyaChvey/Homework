package TaskDrive;

public class TeDrive {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int a = 12345978;
        stringBuilder.append(a);
        int pa = 0;
        for (int i = 0; i < 8; i++) {
            int pr = 0;
            for (int j = 0; j < 8; j++) {
                if (i != j) {
                    if ((int) stringBuilder.charAt(i) == (int) stringBuilder.charAt(j)) {
                        break;
                    } else {
                        pr += 1;
                    }
                }

            }
            if (pr < 7) {
                break;
            }
            pa+=1;
        }
        if(pa==8){
            System.out.println(stringBuilder.toString());
        }else {
            System.out.println("NO");
        }

    }
}