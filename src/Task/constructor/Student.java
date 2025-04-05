package Task.constructor;

public class Student {
   private String name;
   private int age;
    public Student(String name, int age) {
      this.name=name;
      this.age=age;
    }
    // 1. Without Parameters and Without Return Type
public void displayStudent(){
    System.out.println("name: "+ name);
    System.out.println("age: "+ age);
}
// 2. Without Parameters but With Return Type

    public String getStudentDetails() {
        return "name: "+ name + ", Age: "+age;
    }
    // 3. With Parameters and Without Return Type
    public void updateStudentDetails(String newName, int newAge){
        this.name=newName;
        this.age=newAge;
    }
    // 4. With Parameters and With Return Type

    public boolean isValidAge(int ageToCheck){
        return ageToCheck>=this.age;
    }

    public static void main(String[] args) {
        Student student= new Student("Bhuwaneshwari", 30);
        //1st method
        System.out.println("Method 1.:");
        student.displayStudent();
        //2nd Method
        System.out.println("Method 2.: ");
        System.out.println(student.getStudentDetails());
        //3rd Method
        System.out.println("Method 3.:");
        student.updateStudentDetails("Aarna", 20);
        student.displayStudent();
        //4th Method
        System.out.println("Method 4.: ");
        System.out.println("is 25 a valid age? "+ student.isValidAge(25));
        System.out.println("is 30 a valid age? "+ student.isValidAge(30));
    }
}
