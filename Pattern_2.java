public class Pattern_2 {
    public static void main() {

        int outer_loop = Integer.parseInt(IO.readln("enter no of cloumns:"));
        int inner_loop = Integer.parseInt(IO.readln("enter no of rows:"));

        for (int i = 0; i < outer_loop; i++) {
            for (int j = 0; j < inner_loop; j++) {
                IO.print(j+1);//number printing instead of star
            }
            IO.print("\n");
        }
    }
}
