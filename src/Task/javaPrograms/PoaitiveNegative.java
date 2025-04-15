package Task.javaPrograms;

import java.util.Scanner;

public class PoaitiveNegative {
    //1) Check if a Number is Positive or Negative.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num<0){
            System.out.println(num+ " is Negative");
        }else{
            System.out.println(num +" is Positive");
        }
    }
}
