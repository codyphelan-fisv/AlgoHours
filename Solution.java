public class Solution {
    public static void main(String[] args) {
        isPrime(2);
        isPrime(0);
        isPrime(1);
        isPrime(31);

    }
    public static boolean isPrime(int input){
        int number = input;
        for (int n = 1; n < number; n++) {
            if (number % n == 0) {
                System.out.println("Prime");
                return true;
            }
        }
        System.out.println("Not prime");
        return false;

        }
}
