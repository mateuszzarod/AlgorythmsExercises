
public class ConsecutiveStrings {
    public static void main(String[] args) {

        final String a = "123".toString();
        System.out.println(a);


        longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2);

    }

    public static String longestConsec(String[] strarr, int k) {
        if(strarr.length == 0 || k > strarr.length || k <= 0){
            return "";
        }
        boolean stop = false;
        int maxlength = 0;
        String consec = "";
        String maxConsec = "";

        for(int i=0;i<strarr.length;i++){

            consec = "";

            for(int j = 0;j < k;j++){

                if(i+j >=strarr.length){
                    stop = true;
                    break;
                }
                consec = consec + strarr[i] + strarr[j];
            }
            if (stop){
                break;
            } else if (consec.length() > maxlength){
                maxlength = consec.length();
                maxConsec = consec;
            }
        }
        return maxConsec;
    }
}
