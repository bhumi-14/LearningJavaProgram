package Task.javaPrograms;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        //5) Check if a Person is Eligible to Vote (Age Check)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age ");
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("Person is Eligible to Vote");
        }else {
            System.out.println("Person is not Eligible to Vote");
        }
        sc.close();
    }
}