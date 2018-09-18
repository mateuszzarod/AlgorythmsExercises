//jest wydajniejsze niż bubbleSort
//komputer nie wykonuje każdej operacji
//dokonuje podziału tablicy na dwie części według osi

public class QuickSort {
    public static void sort(int[] arrayToSort) {
       }

    private static void quickSort(int[] tablica, int x, int y) {
        int i, j, v, temp;

        i = x;
        j = y;
        v = tablica[(x + y) / 2];
        do {
            while (tablica[i] < v)
                i++;
            while (v < tablica[j])
                j--;
            if (i <= j) {
                temp = tablica[i];
                tablica[i] = tablica[j];
                tablica[j] = temp;
                i++;
                j--;
            }
        }
        while (i <= j);
        if (x < j)
            quickSort(tablica, x, j);
        if (i < y)
            quickSort(tablica, i, y);
    }
}