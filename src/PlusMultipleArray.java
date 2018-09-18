import java.util.ArrayList;
import java.util.Arrays;

public class PlusMultipleArray {

   //napisz funkcję, która zwraca wynik z arraylisty gdzie pierwszą np. array to jest 1,2,3 to wynik będzie 1+2*3 albo 2,4,5,5,6 to będzie 2+4*5+6*6
   //jeśli pozyacja na arrayu jest parzysta to do sumy dodaje tę pozycję a jeśli jest nieparzysta to mnoży tą pozycję razy sumę
    //sprawdź czy i jest parzyste jeśli tak to dodaj i do zmiennej i zwróć mi liczbe która jest na pozaycji i dodaj dą do sumy
    //nie używaj reszty z dzielenia
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        lista.add(2);
        lista.add(2);
        lista.add(2);
        lista.add(2);
        lista.add(2);
        sumMulti(lista);
    }

    public static int sumMulti(ArrayList<Integer> array){
        int sum = array.get(0);
//      String resultS = "0";
        for (int i=1; i < array.size(); i++){
            if ((i & 1)==0){
                sum = sum * array.get(i);
//                resultS = resultS + " * " + String.valueOf(array.get(i));
            } else sum = sum + array.get(i);
//            resultS = resultS + " + " + String.valueOf(array.get(i));
        }
        System.out.println(sum);
        return sum;
    }
}
