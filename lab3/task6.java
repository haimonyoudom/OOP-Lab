public class task6 {
//     Implement an application in Java to create your Math class with following return functions/methods:
// ▪ factorial (one parameter of a number)
// ▪ rectangleSurface (two parameters Width and Height)
// ▪ circleSurface (one parameter of radius)
// ▪ max (five parameters A, B, C, D, and E)
// ▪ min (five parameters A, B, C, D, and E)
    public static void main(String[] args)
    {
        System.out.println("Factorial : ");
        System.out.println(Maths.factorial(5));
        System.out.println();
        System.out.println("Rectangle surface : "+Maths.rectangleSurface(5, 9));
        System.out.println();
        System.out.println("Circle Surface : "+Maths.circleSurface(4));
        System.out.println();
        System.out.println("\nMax Number : "+Maths.max(3, 8, -1, 1, -1));
        System.out.println();
        System.out.println("\nMin Number : "+Maths.min(3, 8, -1, 1, -1));
    }
}
