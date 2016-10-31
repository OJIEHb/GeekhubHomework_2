package Shapes;

import Shapes.Shape;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by andrey on 30.10.16.
 */
public class Triangle extends Shape {
    private Scanner input = new Scanner(System.in);

    private double sideA;
    private double sideB;
    private double sideC;

    @Override
    public void setData(){
        do {
            System.out.print("Side a = ");
            sideA = input.nextDouble();
            System.out.print("Side b = ");
            sideB = input.nextDouble();
            System.out.print("Side c = ");
            sideC = input.nextDouble();
        }while(!isValidTriangle(sideA,sideB,sideC));
        super.setData();
    }

    public void setData(double a, double b){
        sideA = a;
        sideB = b;
        sideC = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        super.setData();
    }

    @Override
    public BigDecimal calculateArea() {
        double p = (sideA+sideB+sideC)/2;
        return new BigDecimal(Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return new BigDecimal(sideA+sideB+sideC);
    }

    private boolean isValidTriangle(double a, double b, double c){
        if (a + b > c && a+c>b && c+b >a){
            return true;
        }
        System.out.println("Try again!");
        return false;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}
