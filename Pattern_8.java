public class Pattern_8 {
    public static void main() {

        int outer_loop = Integer.parseInt(IO.readln("enter no of cloumns:"));
        int inner_loop = Integer.parseInt(IO.readln("enter no of rows:"));

        for (int i = 1; i <= outer_loop; i++) {
            for (int j = 1; j <= inner_loop; j++) {
                IO.print((char) ((65 - 1) + j));// both lines do the same
                System.out.printf("%c", (65 - 1) + j);// just different approaches
            }
            IO.print("\n");
        }
    }
}
