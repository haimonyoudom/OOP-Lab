class Point{
    void printPoint()
    {
        System.out.println("draw a point. ");
    }
}
class Line extends Point{
    void printLine()
    {
        System.out.println("draw a line. ");
    }
}
class Triangle extends Line{
    void printTriangle()
    {
        System.out.println("draw a triangle");
    }
}
class Rectangle extends Triangle{
    void printRectangle()
    {
        System.out.println("draw rectangle");
    }
}
public class task7 {
    public static void main(String[] args) {
        System.out.println("\tfrom point class");
        Point p = new Point();
        p.printPoint();
        
        System.out.println("\tFrom Line class");
        Line l = new Line();
        l.printPoint();
        l.printLine();

        System.out.println("\tFrom Triangle class");
        Triangle t = new Triangle();
        t.printPoint();
        t.printLine();
        t.printTriangle();

        System.out.println("\tFrom Rectangle class");
        Rectangle r = new Rectangle();
        r.printPoint();
        r.printLine();
        r.printTriangle();
        r.printRectangle();
    }
}
