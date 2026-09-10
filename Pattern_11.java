public class Pattern_11 {

    public static void main() {

        int num_columns = Integer.parseInt(IO.readln("enter the number of columns:"));

        for (int i = 1; i <= num_columns; i++) {
            for (int j = 1; j <= num_columns; j++) {
                int a = (num_columns / 2) + 1;
                if (i == a || j == a) {
                    IO.print(" * ");
                } else {
                    IO.print("   ");// it will break if only if condition is given space or if the spaces aren't
                                    // equal
                }
            }
            IO.print("\n");
        }
    }
}
