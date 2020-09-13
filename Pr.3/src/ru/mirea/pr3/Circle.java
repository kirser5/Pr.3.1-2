package ru.mirea.pr3;

public class Circle extends Shape {
    protected   double radius;

    public Circle(){
        this.Color="Red";
        this.Filled=true;
    }
    public Circle(String color, boolean filled){
       Color=color;
       Filled=filled;
    }
    public Circle(int i) {
        super();
        this.radius=i;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 2*Math.PI*radius;
    }
    public double getPerimeter(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle " +
                "radius=" + radius;
    }
}

