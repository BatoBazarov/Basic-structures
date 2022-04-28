public class lesson2 {

    public static void main(String[] args) {
        System.out.println(within10and20(5, 7));
        isPositiveOrNegative(-4);
        System.out.println(isNegative(-3));
    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Number " + a + "Positive");
        } else {
            System.out.println("Number " + a + " Negative");
        }
    }

    public static boolean isNegative(int a) {
        if (a > 0) {
            return true;
        }
        return false;
    }
}

