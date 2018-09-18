import java.util.ArrayList;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        System.out.println(nbDig(25, 1));
        System.out.println(digIt(25, 1));
    }


    public static Boolean authenticate(String name, String password){
            return (name == "Santa Claus" && password=="Ho! Ho! Ho!");
        }

//n = 10, d = 1, the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
//We are using the digit 1 in 1, 16, 81, 100. The total count is then 4.
//nb_dig(25, 1): the numbers of interest are
//1, 4, 9, 10, 11, 12, 13, 14, 19, 21 which squared are 1, 16, 81, 100, 121, 144, 169, 196, 361, 441
//so there are 11 digits `1` for the squares of numbers between 0 and 25.

 public static int digIt(int n, int d){
        int dig = String.valueOf(n).charAt(0);
        int count = 0;

        for (int i=0; i<=n;i++){
            String result = String.valueOf(i*i);
            count = (int) (count + result.chars()
                                .filter(o -> o == dig)
                                .count());

        }
        return count;
 }

    public static int nbDig(int n, int d) {
        int dig = String.valueOf(n).charAt(0);
        int count = 0;

        for (int i=0; i<=n; i++){
            String result = String.valueOf(i*i);
            count = (int) (count + result.chars()
                                .filter(o -> o == dig)
                                .count());
        }
        return count;
    }


    public static int nbDigStream(int n, int d) {
        return (int) IntStream.rangeClosed(0, n)
                .map(i -> i * i)
                .flatMap(i -> String.valueOf(i).chars())
                .mapToObj(o -> (char) o)
                .mapToInt(Character::getNumericValue)
                .filter(i -> i == d)
                .count();
    }

    public static int countOfDigit(int n, int d) {
        int count = 0;
        do {
            if (n % 10 == d)
                count++;
            n = n / 10;
            System.out.println(n);
        } while (n > 0);

        System.out.println(n);
        return count;
    }


    public static String showTheSequence(int value) {

        if (value < 0) {
            return value + "<0";
        }

        if (value == 0) {
            return "0=0";
        }

        int sum = 0;
        String result = "0";

        for (int i = 1; i <= value; i++) {
            result = result + "+" + i;
            sum += i;
        }
        return result = result + " = " + sum;
    }


    public static String showSequence(int value) {

        if (value < 0)
            return value + "<0";

        if (value == 0)
            return "0=0";

        int sum = 0;
        String result = "0";

        for (int i = 1; i <= value; i++) {
            result += "+" + i;
            sum += i;
        }

        return result += " = " + sum;
    }

  //Weź wejściowy strumnień, przeiteruj go i liczby znajdujące się na parzystych miehscach daj do pierwszej połowy, nieparzyste do drugiej
    //elementy o indexie parzystym będą w pierwszej połowie,
    //elementy o indexie nieparzystym będą w drugiej połowie
    //np. [6,5,1,3,5] -> {6,1,5] [5,3]
    //np. [7,7,5,4,3,1,6] [7,5,3,6][7,4,1]

    //napisz metodę która weźmie arrayList i na zmianę doda i pomnoży wynik

    public static ArrayList<Integer> returnArray(ArrayList<Integer> arr) {
        int result;
        int start = 0;
        return null;
    }

    public static ArrayList<Integer> returnArrayTwo(ArrayList<Integer> arr) {

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if ((i & 1) == 0) {
                odd.add(arr.get(i));
            } else even.add(arr.get(i));
            System.out.println(odd);
            System.out.println(even);
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(even);
        result.addAll(odd);
        System.out.println(result);
        return result;
    }

/*
You are given an array strarr of strings and an integer k.
Your task is to return the first longest string consisting of k consecutive strings taken in the array.
#Example: longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
*/

    public static String longestConsec(String[] strarr, int k) {
        int longestEl = strarr[0].length();
        int index;
        String longestK = "";

        for (int i=1; i< strarr.length; i++){
            if (strarr[i].length() > longestEl){
                index = i;
                longestEl = strarr[i].length();
                System.out.println(longestEl);
                for (int j=1; j <= k; j++)
                longestK += strarr[i];
                System.out.println(longestK);
            }
        }
        return longestK;
    }


//szukanie emelemntu na tablicy
    //wyznacz zmienną start na pozycji 0 i jej długość array[0].lenght
    //przeiteruj tablicę przez i jesli elemeny interowany jest dłuższy niż start zmieniasz zmienną i i wrzucasz do countera
    //zwracasz zmienną array[i]
    //robisz tak tyle razy ile wynosi k
//przeiteruj tablicę, znajdź najdłuższe stringi w tablicy, ten który znajdzie pierwszy dodaj do pustego Stringa result
    //zrób tak k razy
    //zwróć result
}

