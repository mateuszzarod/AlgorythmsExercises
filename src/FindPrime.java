//Question: How would you verify a prime number?

public class FindPrime {


    public static void main(String[] args) {

        System.out.println(isPrime(13));
        System.out.println(isPrimeShort(13));
    }

    //źle działa
    public static boolean isPrimeShort(int number) {
        int divisior =2;

        while (number > divisior){
            if (number % divisior == 0){
                return false;
            } else divisior ++;
        }
        return true;
    }

    public static boolean isPrime(int i) {
        int divisior = 2;

        while (i > divisior) {
            if (i % divisior == 0) {
                return false;
            } else divisior++;
        }
        return true;
    }
}

