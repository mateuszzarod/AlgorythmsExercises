//Elements that occurred only once in the array
//Given an array arr that has numbers appearing twice or once. The task is to identify numbers that occurred only once in the array.
// {1,2,3,4,4,5,6,7}

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8, 9, 10, 10, 12, 14, 15, 15, 20};
        appOnce(numbers);

        appOnceAlt(numbers);
    }

    public static ArrayList<Integer> appOnce(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int o : arr) {
            list.add(o);
        }

        ArrayList<Integer> unDouble = new ArrayList<>();

        //sort
        Collections.sort(list);
// TODO: 17.09.2018 http://www.thatjsdude.com/interview/js1.html#primFactors
        // TODO: 17.09.2018 Zrobić do końca te podstawy algorytmy, powtórzyć na pamięć
        // TODO: 17.09.2018 zrobić 3 rodzaje sortowania buble quick i coś jeszcze

        //check for 1st element if it's only one - add to new list
        if (list.get(0) != list.get(1)) {
            unDouble.add(list.get(0));
        }

        //check for other elements (1 < list.size()-1) without last
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) != list.get(i + 1) && list.get(i) != list.get(i - 1)) {
                unDouble.add(list.get(i));
            }
        }

        if (list.get(list.size() - 2) != list.get(list.size() - 1)) {
            unDouble.add(list.get(list.size() - 1));
        }

        System.out.println(unDouble);
        return unDouble;
    }

    public static void appOnceAlt(int[] arr) {
        Set<Integer> newDistinct = new HashSet<Integer>();
        List<Integer> aIntList = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        newDistinct.addAll(aIntList);
        System.out.println(newDistinct);
        }
}
