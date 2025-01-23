package gr.aueb.cf.ch1;

/**
 * σενάριο για backup στο github
 */

public class MyCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result =0;
        result = add(num1, num2);
    // δεν θα εκτυπωνει θα ειναι ως bug
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
