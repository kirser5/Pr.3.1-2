package ru.mirea.pr3;

public class main {
    public static void main(String[] args) {
        Circle n1=new Circle(36);
        System.out.println(n1.getArea()+"  "+n1.getPerimeter());
        Rectangle n2=new Rectangle(7,4);
        System.out.println(n2.getArea()+"  "+n2.getPerimeter());
        System.out.println(n2.getWidth()+"  "+n2.getLength());
    }
}

