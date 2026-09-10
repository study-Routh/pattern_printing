public class Pattern_15 {
    public static void main() {
        int colum = Integer.parseInt(IO.readln("enter odd number:"));
        // int pri;
        // for (int i = 1; i <= colum; i++) {
        // if (i % 2 == 0)
        // pri = 0;
        // else
        // pri = 1;
        // for (int j = 1; j <= i; j++) {
        // IO.print(pri);
        // if (pri == 1)
        // pri = 0;
        // else
        // pri = 1;
        // }
        // IO.print("\n");
        // }

        for (int i = 1; i <= colum; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    IO.print(1);
                } else {
                    IO.print(0);
                }
            }
            IO.print("\n");
        }

    }
}
