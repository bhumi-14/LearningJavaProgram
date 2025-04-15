package Task.javaPrograms;

import java.util.Scanner;
import java.util.SortedMap;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num1");
        System.out.println("enter num2");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("num1 is max");
        }else{
            System.out.println("num2 is max");

        }
    }
}
