//write a method to swap number without a temp
//Question: How would you swap two numbers without using a temporary variable?

public class SwapNumber {
    public static void main(String[] args) {
        numberSwapper(10, 20);
        numberSwapperTemp(10, 20);

    }

    public static void numberSwapper(int a, int b){

        System.out.println("before swap: " + " a: " + a + " b: " + " " + b);
        b = b - a;
        a = a + b;
        b = a - b;
        System.out.println("after swab A / B: " + a + " / " + b);

    }

    public static void numberSwapperTemp(int a, int b){
        System.out.println("Before A/B: " + a + " / " + b);
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After A/B: " + a + " / " + b);

    }
}
