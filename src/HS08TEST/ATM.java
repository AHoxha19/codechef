package HS08TEST;

import java.util.Map;

public class ATM {

    private static final double FEE = 0.50;

    public static void main(String[] args) throws java.lang.Exception{
        //Withdraw x $US
        //Accept only if x is a multiple of 5
        //And enough cash to perform.
        //For each successful withdrawal the bank charges 0.50 $US
        // 30(amount of cash wanted) 120.00(initial account balance)
        //89.50 output
        java.io.BufferedReader r = new java.io.BufferedReader
                (new java.io.InputStreamReader(System.in));
        String input = r.readLine();
        String[] values = input.split(" ");
        int amount = Integer.parseInt(values[0]);
        float balance = Float.parseFloat(values[1]);
        withdraw(amount, balance);
    }

    private static void withdraw(int amount, double balance) {
        if (amount % 5 == 0) {
            if (amount + FEE <= balance) {
                System.out.println(balance - amount - FEE);
                return;
            }
        }
        System.out.println(balance);
    }
}
