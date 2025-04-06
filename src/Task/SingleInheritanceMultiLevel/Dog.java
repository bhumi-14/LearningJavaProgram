package Task.SingleInheritanceMultiLevel;

public class Dog extends Mammal{
    void bark(){
        System.out.println("Dog is barking ");
    }

    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eat();
        obj.bark();
        obj.walk();
        Mammal mm=new Mammal();
        mm.walk();
        mm.eat();
        Animal an = new Animal();
        an.eat();
    }
}
