//BUBBLESORT

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] unsArr = {2, 5, 4, 5, 6, 10};

        long begin = System.nanoTime();
       //bubbleSortSlowest(unsArr);
        // bubbleSortBetter(unsArr);
        //bubbleSortFlag(unsArr);
        long end = System.nanoTime();
        System.out.println(end-begin + " MS ");

        System.out.println("after");
        for (int i = 0; i < unsArr.length; i++) {
            System.out.println(unsArr[i] + " ");
        }
    }

    public static void bubbleSortSlowest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    //zmniejszamy pętle o 1, bo za każdym przebiegiem elelment
    // jest na swojej pozycji
    //nie trzeba z nim porównywać innych liczb
    public static void bubbleSortBetter(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void bubbleSortFlag(int[] arr){
        boolean flag = true;
        for (int i=1; i < arr.length && flag; i++){
            flag = false;
            for (int j=0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    flag = true;
                }
            }
        }
    }

    private static void swap(int tab[], int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
}
