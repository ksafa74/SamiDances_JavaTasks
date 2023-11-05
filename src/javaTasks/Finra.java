package javaTasks;

public class Finra {
    /*
    Finra. Print numbers from 1 to 100
    - If a number is divisible by 3 print Fin
    - If a number is divisible by 5 print Ra
    - If a number is divisible by both 3 and 5 print Finra
    - If number is not divisible by 3, 5  then print number
     */

    public static void finraTask(int n) {

        int i = 1;

        while (i <= n) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("Finra");
            } else if (i % 3 == 0) {
                System.out.println("Fin");
            } else if (i % 5 == 0) {
                System.out.println("Ra");

            } else {
                System.out.println(i);
            }
            i++;
        }
    }
    public static void main(String[] args) {
        finraTask(50);
    }


}
