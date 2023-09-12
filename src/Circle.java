public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle(){};

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
       //Cach 1:
//        return this.radius * this.radius * 3.14;

        // Cach 2 :
        return Math.pow(this.radius,2) * Math.PI;
    }
}
