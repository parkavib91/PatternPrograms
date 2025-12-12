public class RightTriangleStar {
    public void RightTriangleStarMethod(int rows){
        int n = 5;
        String row = "*";
        int i = 1;
        while(i <= n) {
            System.out.println(row);
            row += "*";
            i++;
        }
    }
} 