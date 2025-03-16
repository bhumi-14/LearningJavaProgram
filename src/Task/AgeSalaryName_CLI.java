package Task;

public class AgeSalaryName_CLI {
    //Take a user input - Name, Age and Salary and print them in the end.
    public static void main(String[] args) {
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        double salary=Double.parseDouble(args[2]);
        String place=args[3];
        System.out.println(name+" "+age+" "+salary+" "+place);
    }
}
