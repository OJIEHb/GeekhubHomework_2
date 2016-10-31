package Shapes;

import Shapes.Shape;
import Shapes.Triangle;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by andrey on 30.10.16.
 */
public class Square extends Shape {
    private Scanner input = new Scanner(System.in);
    private double side;
    private Triangle triangle;

    @Override
    public void setData(){
        System.out.print("Side = ");
        side = input.nextDouble();
        super.setData();
        triangle = rectangleTriangles();
    }

    @Override
    public BigDecimal calculateArea() {
        return new BigDecimal(side * side);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return new BigDecimal(side * 4);
    }

    public Triangle rectangleTriangles(){
        Triangle triangle = new Triangle();
        triangle.setData(side,side);
        return triangle;
    }

    @Override
    public String toString() {
        String s = String.format("\nTriangles params: \nA = %.2f\nB = %.2f\nC = %.2f\n",triangle.getSideA(),triangle.getSideB(),triangle.getSideC());
        return super.toString()+ s + triangle.toString();
    }
}
