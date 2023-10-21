import java.util.*;
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    private double perimeter;
    private double area;
    private double side1;
    private double side2;
    private double side3;



    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(){

    }

    public void perimeter() {
         side1 = Math.sqrt(Math.pow((b.getxCordinate() - a.getxCordinate()), 2) + Math.pow((b.getyCordinate() - a.getyCordinate()), 2));
         side2 = Math.sqrt(Math.pow((c.getxCordinate() - b.getxCordinate()), 2) + Math.pow((c.getyCordinate() - b.getyCordinate()), 2));
         side3 = Math.sqrt(Math.pow((c.getxCordinate() - a.getyCordinate()), 2) + Math.pow((c.getyCordinate() - a.getyCordinate()), 2));
        perimeter = side1+side2+side3;
        if (side1 == side2 && side2 == side3) {
            System.out.println("Perimeter is: "+perimeter+" and it is Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Perimeter is: "+perimeter+" and it is Isosceles triangle");
        } else {
            System.out.println("Perimeter is: "+perimeter+" and it is Unknown triangle");
        }

    }
    public void getArea(){
        double s=perimeter/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("Area is: "+area);
    }

    public double area(Point a,Point b,Point c){
        double result= Math.abs((a.getxCordinate()*(b.getyCordinate()-c.getyCordinate()))+b.getxCordinate()*(c.getyCordinate()-a.getyCordinate())+c.getxCordinate()*(a.getyCordinate()-b.getyCordinate()));
        return result;
    }

    public void isInside(Point p){
        double a1 = area(a,b,p);
        double a2 = area(b,c,p);
        double a3 = area(a,c,p);
        if (area==a1+a2+a3){
            System.out.println("The point is inside the Triangle");
        }
        else{
            System.out.println("The point is not inside the Triangle");
        }


    }

}

