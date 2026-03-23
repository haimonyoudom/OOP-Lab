public class Maths{
   
    int a,b,c,d,e;
    static int add(int a,int b)
    {
        return a+b;
    }
    static int subtract(int a,int b)
    {
        return a-b;
    }
    static int multiply(int a,int b)
    {
        return a*b;
    }
    static int divide(int a,int b)
    {
        return a/b;
    }
    static int min(int a,int b)
    {
        if(a < b){return a;}
        else {return b;}
    }
    static int max(int a ,int b)
    {
        if(a > b){return a;}
        else {return b;}
    }
     //     Implement an application in Java to create your Math class with following return functions/methods:
// ▪ factorial (one parameter of a number)
    static int factorial(int a)
    {
        if (a == 0)
            {
                System.out.print("1 = ");
                return 1;}
        System.out.print(a + " * ");
        return a * factorial(a-1);
    }
    // ▪ rectangleSurface (two parameters Width and Height)
    static float rectangleSurface(int w , int h)
    {
        System.out.println("Wieght : "+w+"\nHeight : "+h);
        return w*h;
    }
    // ▪ circleSurface (one parameter of radius)
    static float circleSurface(int r)
    {
        System.out.println("Radius : "+r);
        return 3.14f*r*r;
    }
    // ▪ max (five parameters A, B, C, D, and E)
    static int max(int a,int b,int c,int d,int e)
    {
        int[] num = {a,b,c,d,e};
       
        int max = num[0];
        System.out.print("All elements of number : ");
        for(int i = 0; i < 5;i++)
        {
            System.out.print(num[i]+" ");
            if(num[i]>max)
            {
                max = num[i];
            }
        }
        return max;
    }
    // ▪ min (five parameters A, B, C, D, and E)
     static int min(int a,int b,int c,int d,int e)
    {
        int[] num = {a,b,c,d,e};
       
        int min = num[0];
        System.out.print("All elements of number :");
        for(int i = 0; i < 5;i++)
        {
            System.out.print(num[i]+" ");
            if(num[i]<min)
            {
                min = num[i];
            }
        }
        return min;
    }
}
