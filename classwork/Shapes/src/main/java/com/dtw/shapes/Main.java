/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtw.shapes;


// calls everything
class Main {
    
    public static void main(String[] args){
    
        // create instance of square class
        Shape s = new Square(5);
        
        System.out.println(s.getPerimeter());
        
        // create instance of rectangle class
        Shape r = new Rectangle(5, 8);
        
        System.out.println(r.getArea());
        
        // create instance of triangle class
        Shape t = new Triangle(2, 5 ,6);
        
        System.out.println(t.getArea());
        
        // create instance of circle class
        Shape c = new Circle(8);
        
        System.out.println(c.getArea());
        
        
    }
    
}
