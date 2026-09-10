public class Pattern_9 {
    public static void main() {

        int outer_loop = Integer.parseInt(IO.readln("enter no of cloumns:"));
        // int inner_loop = Integer.parseInt(IO.readln("enter no of rows:"));

        for (int i = 1; i <= outer_loop; i++) {
            for (int j = 1; j <= i; j++) {
                IO.print((char) ((65 - 1) + j));//    both lines do the s
            }                  
            IO.print("\n");
        }
    }
}
