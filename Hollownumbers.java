public class Hollownumbers {
    public static void main(String[] args) {
        int rows = 5;  // You can change the number of rows

        for (int i = 1; i <= rows; i++) {
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line
        }
    }
}