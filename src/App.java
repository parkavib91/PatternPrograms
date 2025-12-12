import java.util.Scanner;
public class App {
    public static void main(String[] args){
      ExecuteProgram(); 
    }
 private static void ExecuteProgram(){
    PrintDetails();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your choice");
    int choice = scanner.nextInt(); 
    switch(choice){

        case 1 :
          RightTrianglePatternCalculation(scanner);
          break;

        case 2:
          MirrorUpperStarCalculation(scanner);
          break;
         
        case 3:
          MirrorLowerStarCalculation(scanner);
          break;

        case 4:
          SquareStarCalculation(scanner);
          break;

        case 5:
          PyramidStarCalculation(scanner);
          break;

        case 6:
          SpiralNumberCalculation(scanner);
          break;

        default:
           System.out.println("Enter the correct choice");
           break;
    }
 } 
 private static void PrintDetails(){
    System.out.println("1. RightTriangleStarPattern");
    System.out.println("2. Mirror Upper Star Triangle Pattern");
    System.out.println("3. Mirror Lower Star Pattern");
    System.out.println("4. Square Star Pattern");
    System.out.println("5. Pyramid Star Pattern");
    System.out.println("6. Spiral number pattern");
 }
 private static void MirrorUpperStarCalculation(Scanner scanner){
   System.out.println("Enter the size");
   int size = scanner.nextInt();
   MirrorUpperStar mirrorUpperStar = new MirrorUpperStar();
   mirrorUpperStar.MirrorUpperStarMethod(size);
 } 
private static void MirrorLowerStarCalculation(Scanner scanner){
  System.out.println("Enter the number");
  int number = scanner.nextInt();
  MirrorLowerStar mirrorLowerStar = new MirrorLowerStar();
  mirrorLowerStar.MirrorLowerStarMethod(number);
}
private static void SquareStarCalculation(Scanner scanner){
   System.out.println("Enter the rows");
   int k = scanner.nextInt();
   System.out.println("Enter the columns");
   int l = scanner.nextInt();
   SquareStar squareStar = new SquareStar();
   squareStar.SquareStarMethod(k,l);
}
private static void PyramidStarCalculation(Scanner scanner){
  System.out.println("Enter the number");
  int n = scanner.nextInt();
  PyramidStar pyramidStar = new PyramidStar();
  pyramidStar.PyramidStarMethod(n);
}
private static void SpiralNumberCalculation(Scanner scanner){
  System.out.println("Enter the size");
  int size = scanner.nextInt();
  SpiralNumber spiralNumber = new SpiralNumber();
  spiralNumber.SpiralNumberMethod(size); 
}

 private static void RightTrianglePatternCalculation(Scanner scanner){
    System.out.println("Enter the number of rows");
    int rows = scanner.nextInt();
    RightTriangleStar rightTriangleStar = new RightTriangleStar();
    rightTriangleStar.RightTriangleStarMethod(rows);
 }   
}
