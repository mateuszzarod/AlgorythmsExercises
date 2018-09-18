//Write a java program to merge two sorted arrays

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArrays {

    public static void main(String[] args) {
        int[] arr1 = { 1, 18, 22, 100, 105, 1002 };
        List<Integer> intList = new ArrayList<>();
        for (int o : arr1){
            intList.add(o);
        }

        int[] arr2 = { 16, 17, 19, 21, 1001 };
        List<Integer> intList2 = new ArrayList<>();
        for (int o : arr2){
            intList2.add(o);
        }

        intList.addAll(intList2);
        Collections.sort(intList);

        System.out.println(intList);



    }
}
