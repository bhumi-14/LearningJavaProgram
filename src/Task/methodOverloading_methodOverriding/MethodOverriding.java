package Task.methodOverloading_methodOverriding;

public class MethodOverriding {
    int a=20;
    int b=14;
    int c=34;
    int d=34;
    public static void main(String[] args) {
        MethodOverriding movrd= new MethodOverriding();
        MethodOverridingClass movrdc= new MethodOverridingClass();
        movrd.add();
        movrdc.add();
    }
    public void add(){
        System.out.println(a+b);
    }
}
class MethodOverridingClass extends MethodOverriding{

    public void add(){
        System.out.println(c+d);
    }

}
