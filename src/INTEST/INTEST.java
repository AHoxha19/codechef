package INTEST;

public class INTEST {
    public static void main(String[] args) throws Exception{
        /**n = 7, k = 3 (n, k<=10e7)
         * the next n lines of input contain one positive ti, not greater than 10e9 each
         * output single integer denoting how many ti integers are divisible by k.
         */

        java.io.BufferedReader r = new java.io.BufferedReader
                (new java.io.InputStreamReader(System.in));
        String input = r.readLine();
        String[] values = input.split(" ");
        int n = Integer.parseInt(values[0]);
        int k = Integer.parseInt(values[1]);
        int counter = 0;
        for (int i = n; i > 0; i--) {
            int currentValue = Integer.parseInt(r.readLine());
            if(currentValue % k == 0)counter++;
        }
        System.out.println(counter);
    }
}
