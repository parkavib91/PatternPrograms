public class RightTriangleStar {
    public void RightTriangleStarMethod(int rows){
        String row = "*";
        int i = 1;
        while(i <= rows) {
            System.out.println(row);
            row += "*";
            i++;
        }        
    }
} 