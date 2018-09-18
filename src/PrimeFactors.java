//Write a funciotn to check all prime factors for a number
//Run a while loop. start dividing by two and if not divisible increase divider until u r done.

import java.util.ArrayList;
import java.util.List;


class PrimeFactors {

    public static List<Integer> primeFactors(int number) {

        int n = number;
        List<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                System.out.println("Found it " + i);
                n = n / i;
                System.out.println("Dividing" + n);
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println(primeFactors(70));

    }
}