package ex_02_Datatypes_Variables;

public class GradingSystem {
    //Challenge ; ✅ Grade Calculator:
    //
    //Write a program that calculates and displays the letter grade
    // for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59
    // without using scanner
    public static void main(String[] args) {
        int x=80;
        if(x>=90 && x<=100){
            System.out.println("candidate passed with A grade");
        } else if (x>=80 && x<=89) {
            System.out.println("candidate passed with B grade");
        } else if (x>=70 && x<=79) {
            System.out.println("candidate passed with C grade");
        }else if (x>=60 && x<=69) {
            System.out.println("candidate passed with D grade");
        }else {
            System.out.println("candidate passed with F grade");
        }
    }
}
