package ex_02_Datatypes_Variables;

public class Math_Functions {
    public static void main(String[] args) {
        double x=10; double y=10; int z=10;
        double result;
        result=Math.cbrt((Math.pow(x,2)+ (Math.pow(y,2))-(Math.abs(z))));
        System.out.println(result);
    }
}
