public class MirrorUpperStar{
   public void MirrorUpperStarMethod(int size){
        int m, n;

        for (m = size - 1; m >= 0; m--) {

            
            for (n = 0; n < m; n++) {

                System.out.print(" ");
            }
            for (n = m; n <= size - 1; n++) {

                System.out.print("*"
                                 + " ");
            }
            System.out.println();
        }
      }
    }