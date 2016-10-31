import Shapes.*;

import java.util.Scanner;

/**
 * Created by andrey on 30.10.16.
 */
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String [] args){
        Shape shape = createShape();
        showShapeInfo(shape);
    }

    public static Shape chooseShape(TypeShape typeShape){
        switch (typeShape){
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            case TRIANGLE:
                return new Triangle();
        }
        return null;
    }

    public static Shape createShape(){
        String inputShape;
        System.out.println("Please enter a shape name (Circle, Square, Rectangle, Triangle):");
        do{
            inputShape = input.next().toUpperCase();
        }while(!checkInputShape(inputShape));
        Shape shape = chooseShape(TypeShape.valueOf(inputShape));
        shape.setData();
        return shape;
    }

    public static boolean checkInputShape(String inputShape){
        try{
            chooseShape(TypeShape.valueOf(inputShape));
            return true;
        }catch (Exception e){
                System.out.println("Incorrect input!");
            return false;
        }
    }
    public static void showShapeInfo(Shape shape){
        System.out.println(shape.toString());
    }
}
