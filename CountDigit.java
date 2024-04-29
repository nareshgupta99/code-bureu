public class CountDigit {

    public static int countDigits(int n){

       String s = ""+n;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char tem = s.charAt(i);
            int digit = Integer.parseInt(""+tem);

            if (digit != 0 && n % digit == 0) {
                count++;
            }
        }

        return count;
    }
}