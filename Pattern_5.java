//Inverted Triangle
public class Pattern_5 {
    public static void main() {

        int outer_loop = Integer.parseInt(IO.readln("enter no of cloumns:"));
        // int inner_loop = Integer.parseInt(IO.readln("enter no of rows:"));

        for (int i = outer_loop; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                IO.print("*");
            }
            IO.print("\n");
        }
    }
}
