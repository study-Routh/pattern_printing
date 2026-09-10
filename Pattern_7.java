//Odd_Number Triangle
public class Pattern_7 {
    public static void main() {

        int outer_loop = Integer.parseInt(IO.readln("enter no of cloumns:"));
        // int inner_loop = Integer.parseInt(IO.readln("enter no of rows:"));

        for (int i = 1; i <= outer_loop; i++) {
            for (int j = 1; j <= i; j+=2) {
                IO.print(j);
            }
            IO.print("\n");
        }
    }
}
