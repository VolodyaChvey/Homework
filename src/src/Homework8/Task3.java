package src.Homework8;

public final class Task3 {
    int a;
    int b;
    int c;

    public Task3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        try {
            check(a, b, c);
        } catch (NotTriangle e) {
            System.out.println(e.getMessage());
        }
    }

    static class NotTriangle extends Exception {
        public NotTriangle(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3(1, 4, 2);
    }

    void check(int a, int b, int c) throws NotTriangle {
        if (a > b && a > c) {
            if (a > (b + c)) {
                throw new NotTriangle("This is not a triangle");
            }
        } else if (b > a && b > c) {
            if (b > (a + c)) {
                throw new NotTriangle("This is not a triangle");
            }
        } else {
            if (c > (a + b)) {
                throw new NotTriangle("This is not a triangle");
            }
        }
    }
}
