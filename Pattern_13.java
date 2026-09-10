public class Pattern_13 {
    public static void main() {
        // n is to be add always
        int num_columns = Integer.parseInt(IO.readln("enter the number of columns:"));

        for (int i = 1; i <= num_columns; i++) {
            for (int j = 1; j <= num_columns; j++) {
                if (i == j || i + j == num_columns + 1) {
                    IO.print("*");
                } else {
                    IO.print(" ");
                }
            }
            IO.print("\n");
        }
    }
}
