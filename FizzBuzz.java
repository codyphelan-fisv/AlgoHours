public class FizzBuzz {
    public static void main(String[] args) {
        int num_end = 100;

        for (int i = 1; i <= num_end; i++) {

            if (((i % 3) == 0) && ((i % 5) == 0))
            {
                System.out.println("fizzbuzz");
            } else if ((i % 3) == 0)
            {
                System.out.println("fizz");
            } else if ((i % 5) == 0)
            {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
