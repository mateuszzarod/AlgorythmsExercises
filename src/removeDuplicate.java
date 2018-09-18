//Question: How would you remove duplicate members from an array?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {

    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList();
        newList.addAll(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 9, 10, 10, 11));

        removeDuplicate(newList);
        System.out.println(newList);

        for (int i : newList) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> arr) {
        ArrayList<Integer> list = arr;

        Set<Integer> withoutDupl = new HashSet<>();
        withoutDupl.addAll(list);
        list.clear();
        list.addAll(withoutDupl);
        return list;
    }
}