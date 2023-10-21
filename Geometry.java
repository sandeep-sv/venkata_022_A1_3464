import java.util.*;
public class Geometry {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the number of triangles:");
        n= sc.nextInt();
        while(true){
            if (n>=3){
                break;
            }
            else{
                System.out.println("The number of triangles must be minimum 3!!");
                System.out.println("Enter the number of triangles:");
                n= sc.nextInt();
            }
        }
        Triangle[] t =new Triangle[n];
        for (int i=0;i<n;i++){
            Point a = new Point();
            System.out.println("Enter points a , b , c for triangle "+(i+1)+":");
            System.out.println("Construction of a new point A:");
            System.out.println("Please enter x:");
            a.setxCordinate(sc.nextDouble());
            System.out.println("Please enter y:");
            a.setyCordinate(sc.nextDouble());
            Point b = new Point();
            System.out.println("Construction of a new point b:");
            System.out.println("Please enter x:");
            b.setxCordinate(sc.nextDouble());
            System.out.println("Please enter y:");
            b.setyCordinate(sc.nextDouble());
            Point c = new Point();
            System.out.println("Construction of a new point c:");
            System.out.println("Please enter x:");
            c.setxCordinate(sc.nextDouble());
            System.out.println("Please enter y:");
            c.setyCordinate(sc.nextDouble());
             t[i] = new Triangle(a,b,c);
             t[i].perimeter();
             t[i].getArea();
            System.out.println(" ");

        }
        System.out.println("Enter coordinates of the point to check if it lies inside or outside the triangle: ");
        System.out.println("Enter the x coordinate of the point: ");
        double x1=sc.nextDouble();
        System.out.println("Enter the y coordinate of the point: ");
        double y1=sc.nextDouble();
        Point p= new Point(x1,y1);
        for (int i=0;i<n;i++){
            System.out.println("For Triangle "+(i+1)+" :");
            t[i].isInside(p);
            System.out.println(" ");
        }

    }
}
