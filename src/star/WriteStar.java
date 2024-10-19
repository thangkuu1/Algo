package star;

public class WriteStar {
    public static void staircase(int n) {
        // Write your code here
        for (int a = 0; a < n; a++) {

            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (int b = 0; b < n; b++) {
                // printing stars
                if(((a + b ) >= (n - 1 ))){
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }

            // end-line
            System.out.println();
        }

    }

    public static void main(String[] args) {
        staircase(5);
    }
}
