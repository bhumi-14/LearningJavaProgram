package Task.constructor;

public class Person {
    public static void main(String[] args) {
       //// Create a person object using DC
        Person person1=new Person();
        person1.setName("Bhumi");
        person1.setAddress("Nagpur");
        person1.setPhone("6578649067905");
        person1.setMale(false);
        person1.setAge(30);
// Create a person object using PC
Person person2=new Person("Amol", "Angul", "65464949", true, 32);

//Print details
        System.out.println("Person1 Details: ");
        person1.printDetails();
        System.out.println("Person2 Details: ");
        person2.printDetails();

        //Behaviour
        person1.eat();
        person1.sleep();
        person2.walk();
        person2.doHome();
    }
    //Create a Class with the Person - where we have DC, PC , two types.
    //Fields. Instances - name, age, address, phone, isMale.
    //Behaviour - eat, sleep, walk, doHome, printDetails()- print the details of the all the fields.
    private String name;
    private String address;
    private String phone;
    private boolean isMale;
    private int age;
    //Default constroctor
    public Person() {
        this.name = "";
        this.address="";
        this.phone="";
        this.isMale=true;
        this.age=0;
    }
// Parameterized constructor
    public Person(String name, String address, String phone, boolean isMale, int age) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.isMale = isMale;
        this.age = age;
    }
    //Behavior
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void doHome() {
        System.out.println(name + " is doing home work");
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Is Male: " + isMale);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // getter and setter methods

}
