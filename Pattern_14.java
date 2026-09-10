public class Pattern_14 {
    public static void main() {
        int colum = Integer.parseInt(IO.readln("enter odd number:"));
        int pri = 0;
        for (int i = 1; i <= colum; i++) {
            for (int j = 1; j <= i; j++) {
                IO.print((pri += 1) + " ");
                pri++;
            }
            IO.print("\n");
        }
    }
}
