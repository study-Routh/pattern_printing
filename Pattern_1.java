public class Pattern_1 {
    public static void main() {

        int outer_loop = Integer.parseInt(IO.readln("enter no of cloumns:"));
        int inner_loop = Integer.parseInt(IO.readln("enter no of rows:"));

        for (int i = 0; i < outer_loop; i++) {
            for (int j = 0; j < inner_loop; j++) {
                IO.print("*");
            }
            IO.print("\n");
        }
    }
}
