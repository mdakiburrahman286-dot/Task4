public class Task4 {
    public static void main(String[] args) {
        for (int tens = 1; tens <= 9; tens++) {
            for (int ones = 0; ones <= 9; ones++) {
                if (tens == ones / 2) {
                    int original = (tens * 10) + ones;
                    int reversed = (ones * 10) + tens;

                    if (reversed - original == 36) {
                        System.out.println("The number is: " + original);
                    }
                }
            }
        }
    }
}