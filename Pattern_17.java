public class Pattern_17 {
    public static void main() {
        int colum = Integer.parseInt(IO.readln("enter odd number:"));
        int pri = 0;
        for (int i = 1; i <= colum; i++) {
            for (int j = 1; j <= i; j++) {
                IO.print((pri += 1) + " ");
                pri++;
            }
            System.out.print("\n");
        }
    }
}
