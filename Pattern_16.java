public class Pattern_16 {
    public static void main() {
        int colum = Integer.parseInt(IO.readln("enter odd number:"));
        int pri = 0;
        for (int i = 1; i <= colum; i++) {
            for (int j = colum - 1; j >= i; j--) {
                IO.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                IO.print("*");
            }
            IO.print("\n");
        }
    }
}
