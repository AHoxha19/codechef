package FLOW001;

public class FLOW001 {
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader r = new java.io.BufferedReader
                (new java.io.InputStreamReader(System.in));
        int t = Integer.parseInt(r.readLine());
        int counter = 0;
        String input;
        String[] values;
        for (int i = t; i > 0; i--) {
            input = r.readLine();
            values = input.split(" ");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            System.out.println(a + b);
        }
    }
}

