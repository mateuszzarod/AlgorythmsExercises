//Question: How would you find the greatest common divisor of two numbers?

public class GreatestCommonDivisior {

    public static void main(String[] args) {
        System.out.println(greatestCommon(100, 30));
        printAllDivisiorsFor(90);
    }

    public static void printAllDivisiorsFor(int number) {
        for (int i = 1; i < number; i++) {
            System.out.println("Factors of" + i);
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.println(" " + j);
                }
            }
        }
    }


    public static int greatestCommon(int a, int b) {
        int greatestDiv = 1;
        int divisior = 2;

        while (a > divisior && b > divisior) {
            if (a % divisior == 0 && b % divisior == 0) {
                greatestDiv = divisior;
                divisior++;
            }
        }
        return greatestDiv;
    }
}
