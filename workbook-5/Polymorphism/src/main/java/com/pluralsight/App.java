package com.pluralsight;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Shape s1 = new Shape();
        Shape s2 = new Square(4);
        Shape s3 = new Circle(3);

       s2.calculateArea();
       s3.calculateCircumference();

        System.out.println(((Circle) s3).getRadius());

        if(s3 instanceof Circle c){
            System.out.println(c.getRadius());
        }
    }
}
