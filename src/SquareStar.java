public class SquareStar {
    public void SquareStarMethod(int k,int l){
        print_rectangle(k,l);
    }
         static void print_rectangle(int k, int l)
    {
        int a, b;
        for (a = 1; a <= k; a++) {
            for (b = 1; b <= l; b++) {
                if (a == 1 || a == k || b == 1 || b == l)
                    System.out.print("*");
                else

                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    }