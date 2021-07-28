/**
 *@author DeJone' Williamson
 *email: tyrionw@gmail..com
 *date: 7/28/2021
 *purpose: Create a set of classes that represent different shapes
 */
package com.dtw.shapes;

// abstract class
abstract class Shape {
    
    // field
    String color;
    
    // methods
    abstract int getPerimeter();
    abstract int getArea();
    
}


// square
class Square extends Shape{

    // field
    private final int side;
    
    // constructor
    Square(int side){
    
        // assign value to the side
        this.side = side;
    
    }
    
    // get the perimeter of the square
    @Override
    public int getPerimeter(){
    
        return (4 * this.side);
    
    }

    // get the perimeter of the square
    @Override
    public int getArea(){
    
        return (this.side * this.side);
    
    }
    
}
    

// rectangle
class Rectangle extends Shape{

    // field
    private final int length;
    private final int width;
    
    // constructor
    Rectangle(int length, int width){
    
        // assign value to the sides
        this.length = length;
        this.width = width;
    
    }
    
    // get the perimeter of the rect
    @Override
    public int getPerimeter(){
    
        return (2 * (this.length + this.width));
    
    }

    // get the perimeter of the rect
    @Override
    public int getArea(){
    
        return (this.width * this.length);
    
    }

}


// triangle
class Triangle extends Shape{

    // field
    private final int a;
    private final int b;
    private final int c;
    
    // constructor
    Triangle(int a, int b, int c){
    
        // assign value to the sides
        this.a = a;
        this.b = b;
        this.c = c;
    
    }
    
    // get the perimeter of the rect
    @Override
    public int getPerimeter(){
    
        return (this.a + this.b + this.c);
    
    }

    // get the perimeter of the rect
    @Override
    public int getArea(){
    
        double s =  (this.a + this.b+ this.c) / 2;
        double area = Math.sqrt(s * (s-this.a)* (s-this.b) * (s-this.c));
        return (int)area;
    
    }

}


//circle
class Circle extends Shape{

    // field
    private final int radius;

    
    // constructor
    Circle(int radius){
    
        // assign value to the sides
        this.radius = radius;
    }
    
    // get the perimeter of the rect
    @Override
    public int getPerimeter(){
    
        double circum = (2*Math.PI * this.radius);
        return (int)circum;
    
    }

    // get the perimeter of the rect
    @Override
    public int getArea(){
    

        double area = Math.PI * Math.pow(this.radius, 2);
        return (int)area;
    
    }

}