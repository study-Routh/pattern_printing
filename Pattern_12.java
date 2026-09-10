public class Pattern_12 {

    public static void main() {

        int num_columns = Integer.parseInt(IO.readln("enter the number of columns:"));

        for (int i = num_columns; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                IO.print(" ");
            }
            for (int j = num_columns; j >= i; j--) {
                IO.print("*");
            }
            IO.print("\n");
        }
    }
}
