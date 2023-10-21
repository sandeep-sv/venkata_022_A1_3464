public class Point {
    private double xCordinate;
    private double yCordinate;

    public Point(double xCordinate,double yCordinate){
        this.xCordinate = xCordinate;
        this.yCordinate=yCordinate;
    }

    public Point(){}

    public void setxCordinate(double xCordinate) {
        this.xCordinate = xCordinate;
    }

    public void setyCordinate(double yCordinate) {
        this.yCordinate = yCordinate;
    }

    public double getxCordinate(){
        return xCordinate;
    }

    public double getyCordinate(){
        return yCordinate;
    }
}
