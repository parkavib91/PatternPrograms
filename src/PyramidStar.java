public class PyramidStar {
    public void PyramidStarMethod(int n){
        PyramidStar(n);
}
public static void PyramidStar(int n){
    int a,b;
    for(a = 0;a<n;a++){
    for(b = 0;b<=a;b++){
    System.out.print("* ");        
    }
    System.out.println();
}
}
}