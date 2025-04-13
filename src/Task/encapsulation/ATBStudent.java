package Task.encapsulation;

public class ATBStudent {
    //Create the Class of ATB ( Encapsulation) , getter & setter)
    //Create an Array of ATB Students and add toString method.
    //Create Single, Multilevel, and Hierarchical. Inheritance
    //Create both Overloading and OverRIDING Examples
    private String name;
    private int age;
    private String course;
    public ATBStudent(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "ATBStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }



    public static void main(String[] args) {
        ATBStudent[] student =new ATBStudent[3];
        student[0]= new ATBStudent("Bhumi", 23, "Automation testing");
        student[1]= new ATBStudent("Harshal", 20, "Mobile testing");
        student[2]= new ATBStudent("Amol", 26, "Mechanical Engg");
        for (ATBStudent student1 : student){
            System.out.println(student1.toString());
        }
    }


}
