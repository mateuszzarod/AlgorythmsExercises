public class Fibonaci {
    public static void main(String[] args) {
        fibonacci(100);

        int index = 0;
        while (true){
            System.out.println(fiboaciRec(index));
            index++;
        }
    }

    //Pring fibonaci n times

    public static void fibonacci(int n){
        System.out.println("Ill show you " + n + "elements of Fibonacci");
        //stwórz zmienną reprezentującą pirewszą liczbę
        int num1 = 0;
        //stwórz zmienną reprezentującą drugą liczbę
        int num2 = 1;
        //tymczasowa zmienna przechowująca wynik dodawania poprzednich
        int temp;

        System.out.println("Fibonaci series is: ");
        //for loop (starting from third to n
        for (int i =2; i < n; i++){
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.println(temp);
        }
    }

    public static long fiboaciRec(int i){

        if (i == 0) return 0;

        if (i <= 2) return 1;

        long fibTerm = fiboaciRec(i-1) + fiboaciRec(i-2);

        return fibTerm;
    }

    public static void fibonacci2(int n){
        int num1 = 0;
        int num2 = 1;
        int temp;

        for (int i=2; i < n; i++){
            temp = num1+num2;
            num1 = num2;
            num2 = temp;
            System.out.println(temp);
        }
    }


}

