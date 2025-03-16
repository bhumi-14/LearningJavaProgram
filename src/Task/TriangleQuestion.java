package Task;

public class TriangleQuestion {
//    //Triangle Classifier:
//    Write a program that classifies a triangle based on its side lengths.
//    Given three input values representing the lengths of the sides,
//    determine if the triangle is equilateral (all sides are equal),
//    isosceles (exactly two sides are equal),
//    or scalene (no sides are equal).
//    Use an if-else statement to classify the triangle
public static void main(String[] args) {
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    int c=Integer.parseInt(args[2]);
    if (a==b && b==c){
        System.out.println("is equilateral");
    } else if (a==b|| b==c|| c==a) {
        System.out.println("is isoscale");
    }else{
        System.out.println("scalene");
    }
}
}
