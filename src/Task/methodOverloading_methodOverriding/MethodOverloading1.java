package Task.methodOverloading_methodOverriding;

public class MethodOverloading1 {

    public int add(int a, int b){
        return a+b;

    }public int add(int a, int b, int c){
        return a+b+c;
    }public double add(double a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodOverloading1 movrld= new MethodOverloading1();
        //movrld.add(2,5);
        System.out.println("1st Method"+ movrld.add(2,5));
        //movrld.add(2,5,45);
        System.out.println("2nd Method"+ movrld.add(2,5,45));
        //  movrld.add(2.4,5,45);
        System.out.println("3rd Method"+ movrld.add(2.4,5,45));
    }

}
